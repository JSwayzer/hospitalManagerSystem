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
@Table(name="tb_pnl_snh")
public class Painel {

	@Id
	@SequenceGenerator(name="painel", sequenceName = "sq_tb_pnl_snh", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "painel")
	private int codigoPainel;
	
	@Column(name="ds_painel")
	private String painel;
	
	@Column(name="dt_chamada_snh")
	private Calendar dataChamadaSenha;
	
	public Painel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoPainel
	 * @param painel
	 * @param dataChamadaSenha
	 */
	public Painel(int codigoPainel, String painel, Calendar dataChamadaSenha) {
		super();
		this.codigoPainel = codigoPainel;
		this.painel = painel;
		this.dataChamadaSenha = dataChamadaSenha;
	}

	/**
	 * @return the codigoPainel
	 */
	public int getCodigoPainel() {
		return codigoPainel;
	}

	/**
	 * @param codigoPainel the codigoPainel to set
	 */
	public void setCodigoPainel(int codigoPainel) {
		this.codigoPainel = codigoPainel;
	}

	/**
	 * @return the painel
	 */
	public String getPainel() {
		return painel;
	}

	/**
	 * @param painel the painel to set
	 */
	public void setPainel(String painel) {
		this.painel = painel;
	}

	/**
	 * @return the dataChamadaSenha
	 */
	public Calendar getDataChamadaSenha() {
		return dataChamadaSenha;
	}

	/**
	 * @param dataChamadaSenha the dataChamadaSenha to set
	 */
	public void setDataChamadaSenha(Calendar dataChamadaSenha) {
		this.dataChamadaSenha = dataChamadaSenha;
	}

}
