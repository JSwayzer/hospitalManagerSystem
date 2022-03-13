package br.com.fiap.hms.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Johnny
 *
 */
@Entity
@Table(name="tb_medicamento")
public class Medicamento {

	@Id
	@Column(name="id_mdt")
	@SequenceGenerator(name="medicamento",sequenceName = "sq_tb_mdt", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "medicamento")
	private int codigoMedicamento;
	
	@JoinColumn(name = "id_prc")
	@ManyToOne
	private Prescricao prescricaoMdt;
	
	@Column(name="nm_mdt")
	private String nomeMedicamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_validade")
	private Calendar dataValidade;

	/**
	 * @param codigoMedicamento
	 * @param prescricaoMdt
	 * @param nomeMedicamento
	 * @param dataValidade
	 */
	public Medicamento(int codigoMedicamento, Prescricao prescricaoMdt, String nomeMedicamento, Calendar dataValidade) {
		super();
		this.codigoMedicamento = codigoMedicamento;
		this.prescricaoMdt = prescricaoMdt;
		this.nomeMedicamento = nomeMedicamento;
		this.dataValidade = dataValidade;
	}

	/**
	 * 
	 */
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the codigoMedicamento
	 */
	public int getCodigoMedicamento() {
		return codigoMedicamento;
	}

	/**
	 * @param codigoMedicamento the codigoMedicamento to set
	 */
	public void setCodigoMedicamento(int codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}

	/**
	 * @return the prescricaoMdt
	 */
	public Prescricao getPrescricaoMdt() {
		return prescricaoMdt;
	}

	/**
	 * @param prescricaoMdt the prescricaoMdt to set
	 */
	public void setPrescricaoMdt(Prescricao prescricaoMdt) {
		this.prescricaoMdt = prescricaoMdt;
	}

	/**
	 * @return the nomeMedicamento
	 */
	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	/**
	 * @param nomeMedicamento the nomeMedicamento to set
	 */
	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	/**
	 * @return the dataValidade
	 */
	public Calendar getDataValidade() {
		return dataValidade;
	}

	/**
	 * @param dataValidade the dataValidade to set
	 */
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}
