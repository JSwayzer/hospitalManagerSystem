package br.com.fiap.hms.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="dt_prc")
	private Calendar dataPrescricao;
	
	@Column(name="ds_via")
	private String via;
	
	@Column(name="ds_dose")
	private String dose;
	
	@Column(name="ob_observaco")
	private String observacao;
	
	public Prescricao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoPrescricao
	 * @param dataPrescricao
	 * @param via
	 * @param dose
	 * @param observacao
	 */
	public Prescricao(int codigoPrescricao, Calendar dataPrescricao, String via, String dose, String observacao) {
		super();
		this.codigoPrescricao = codigoPrescricao;
		this.dataPrescricao = dataPrescricao;
		this.via = via;
		this.dose = dose;
		this.observacao = observacao;
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
