package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Johnny
 *
 */
@Entity
@Table(name="tb_prc")
public class Prescricao {

	@Id
	@SequenceGenerator(name="prescricao", sequenceName = "sq_tb_prc", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescricao")
	@Column(name="id_prc")
	private int codigoPrescricao;
	
	@OneToMany(mappedBy = "prescricaoMdt")
	private List<Medicamento> medicamento;
	
	@OneToOne
	@JoinColumn(name = "id_pct")
	private Paciente pacientePrc;
	
	@OneToOne
	@JoinColumn(name = "id_medico")
	private Medico medicoPrc;
	
	@Column(name="dt_prc",nullable=false)
	private Calendar dataPrescricao;
	
	@Column(name="ds_via",nullable=false,length=50)
	private String via;
	
	@Column(name="ds_dose",length=50)
	private String dose;
	
	@Column(name="ob_observaco",length=255)
	private String observacao;

	/**
	 * @param codigoPrescricao
	 * @param medicamento
	 * @param pacientePrc
	 * @param medicoPrc
	 * @param dataPrescricao
	 * @param via
	 * @param dose
	 * @param observacao
	 */
	public Prescricao(int codigoPrescricao, List<Medicamento> medicamento, Paciente pacientePrc, Medico medicoPrc,
			Calendar dataPrescricao, String via, String dose, String observacao) {
		super();
		this.codigoPrescricao = codigoPrescricao;
		this.medicamento = medicamento;
		this.pacientePrc = pacientePrc;
		this.medicoPrc = medicoPrc;
		this.dataPrescricao = dataPrescricao;
		this.via = via;
		this.dose = dose;
		this.observacao = observacao;
	}

	/**
	 * 
	 */
	public Prescricao() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the codigoPrescricao
	 */
	public int getCodigoPrescricao() {
		return codigoPrescricao;
	}

	/**
	 * @param codigoPrescricao the codigoPrescricao to set
	 */
	public void setCodigoPrescricao(int codigoPrescricao) {
		this.codigoPrescricao = codigoPrescricao;
	}

	/**
	 * @return the medicamento
	 */
	public List<Medicamento> getMedicamento() {
		return medicamento;
	}

	/**
	 * @param medicamento the medicamento to set
	 */
	public void setMedicamento(List<Medicamento> medicamento) {
		this.medicamento = medicamento;
	}

	/**
	 * @return the pacientePrc
	 */
	public Paciente getPacientePrc() {
		return pacientePrc;
	}

	/**
	 * @param pacientePrc the pacientePrc to set
	 */
	public void setPacientePrc(Paciente pacientePrc) {
		this.pacientePrc = pacientePrc;
	}

	/**
	 * @return the medicoPrc
	 */
	public Medico getMedicoPrc() {
		return medicoPrc;
	}

	/**
	 * @param medicoPrc the medicoPrc to set
	 */
	public void setMedicoPrc(Medico medicoPrc) {
		this.medicoPrc = medicoPrc;
	}

	/**
	 * @return the dataPrescricao
	 */
	public Calendar getDataPrescricao() {
		return dataPrescricao;
	}

	/**
	 * @param dataPrescricao the dataPrescricao to set
	 */
	public void setDataPrescricao(Calendar dataPrescricao) {
		this.dataPrescricao = dataPrescricao;
	}

	/**
	 * @return the via
	 */
	public String getVia() {
		return via;
	}

	/**
	 * @param via the via to set
	 */
	public void setVia(String via) {
		this.via = via;
	}

	/**
	 * @return the dose
	 */
	public String getDose() {
		return dose;
	}

	/**
	 * @param dose the dose to set
	 */
	public void setDose(String dose) {
		this.dose = dose;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
