package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "id_tt_snh"), inverseJoinColumns = @JoinColumn(name = "id_pnl_snh"), name = "rl_tt_pnl")
	private List<Painel> painel;
	
	@JoinColumn(name = "id_und")
	@ManyToOne
	private Unidade unidade;
	
	@OneToOne
	@JoinColumn(name = "id_pct")
	private Paciente pacienteTt;
	
	@Column(name="ds_tt_snh",nullable=false,length=80)
	private String totemSenha;
	
	@Column(name="ds_snh",nullable=false,length=50)
	private String senha;
	
	@Column(name="dt_retirada_snh",nullable=false)
	private Calendar dataRetiradaSenha;

	/**
	 * @param codigoTotem
	 * @param painel
	 * @param unidade
	 * @param pacienteTt
	 * @param totemSenha
	 * @param senha
	 * @param dataRetiradaSenha
	 */
	public Totem(int codigoTotem, List<Painel> painel, Unidade unidade, Paciente pacienteTt, String totemSenha,
			String senha, Calendar dataRetiradaSenha) {
		super();
		this.codigoTotem = codigoTotem;
		this.painel = painel;
		this.unidade = unidade;
		this.pacienteTt = pacienteTt;
		this.totemSenha = totemSenha;
		this.senha = senha;
		this.dataRetiradaSenha = dataRetiradaSenha;
	}

	/**
	 * 
	 */
	public Totem() {
		super();
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
	 * @return the painel
	 */
	public List<Painel> getPainel() {
		return painel;
	}

	/**
	 * @param painel the painel to set
	 */
	public void setPainel(List<Painel> painel) {
		this.painel = painel;
	}

	/**
	 * @return the unidade
	 */
	public Unidade getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	/**
	 * @return the pacienteTt
	 */
	public Paciente getPacienteTt() {
		return pacienteTt;
	}

	/**
	 * @param pacienteTt the pacienteTt to set
	 */
	public void setPacienteTt(Paciente pacienteTt) {
		this.pacienteTt = pacienteTt;
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
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the dataRetiradaSenha
	 */
	public Calendar getDataRetiradaSenha() {
		return dataRetiradaSenha;
	}

	/**
	 * @param dataRetiradaSenha the dataRetiradaSenha to set
	 */
	public void setDataRetiradaSenha(Calendar dataRetiradaSenha) {
		this.dataRetiradaSenha = dataRetiradaSenha;
	}

}
