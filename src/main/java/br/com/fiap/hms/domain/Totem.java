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
@Table(name="tb_tt_snh")
public class Totem {

	@Id
	@Column(name="id_tt_snh")
	@SequenceGenerator(name="totem",sequenceName = "sq_tb_tt_snh", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "totem")
	private int codigoTotem;
	
	@Column(name="ds_tt_snh",nullable=false,length=80)
	private String totemSenha;
	
	@Column(name="ds_snh",nullable=false,length=50)
	private String senha;
	
	@Column(name="dt_retirada_snh",nullable=false)
	private Calendar dataRetiradaSenha;
	
	/**
	 * @param id_tt_snh
	 * @param ds_tt_snh
	 * @param ds_snh
	 * @param dt_retirada_snh
	 */
	public Totem(int id_tt_snh, String ds_tt_snh, String ds_snh, Calendar dt_retirada_snh) {
		super();
		this.codigoTotem = id_tt_snh;
		this.totemSenha = ds_tt_snh;
		this.senha = ds_snh;
		this.dataRetiradaSenha = dt_retirada_snh;
	}

	public Totem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the codigoTotem
	 */
	public int getCodigoTotem() {
		return codigoTotem;
	}

	/**
	 * @param codigoTotem the codigoTotem to set
	 */
	public void setCodigoTotem(int codigoTotem) {
		this.codigoTotem = codigoTotem;
	}

	/**
	 * @return the totemSenha
	 */
	public String getTotemSenha() {
		return totemSenha;
	}

	/**
	 * @param totemSenha the totemSenha to set
	 */
	public void setTotemSenha(String totemSenha) {
		this.totemSenha = totemSenha;
	}

	/**
	 * @return the senha retirada no totem
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha retirada no totem to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the dataRetiradaSenha
	 */
	public Calendar getDt_retirada_snh() {
		return dataRetiradaSenha;
	}

	/**
	 * @param dt_retirada_snh the dataRetiradaSenha to set
	 */
	public void setDt_retirada_snh(Calendar dt_retirada_snh) {
		this.dataRetiradaSenha = dt_retirada_snh;
	}

}
