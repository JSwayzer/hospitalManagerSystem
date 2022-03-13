package br.com.fiap.hms.domain;

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
@Table(name="tb_und")
public class Unidade {

	@Id
	@Column(name="id_und")
	@SequenceGenerator(name = "unidade", sequenceName = "sq_tb_und", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unidade")
	private int codigo;

	@Column(name="nm_und",nullable=false,length=150)
	private String nome;
	
	@Column(name="nr_cnpj",nullable=false,length=14)
	private int cpnj;
	
	@Column(name="ds_endereco",nullable=false,length=150)
	private String endereco;
	
	@Column(name="nr_numero",nullable=false)
	private String numeroEndereco;
	
	@Column(name="nr_telefone")
	private String telefone;

	/**
	 * @param codigo
	 * @param nome
	 * @param cpnj
	 * @param endereco
	 * @param numeroEndereco
	 * @param telefone
	 */
	public Unidade(int codigo, String nome, int cpnj, String endereco, String numeroEndereco, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpnj = cpnj;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.telefone = telefone;
	}
	
	/**
	 * 
	 */
	public Unidade() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpnj
	 */
	public int getCpnj() {
		return cpnj;
	}

	/**
	 * @param cpnj the cpnj to set
	 */
	public void setCpnj(int cpnj) {
		this.cpnj = cpnj;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the numeroEndereco
	 */
	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	/**
	 * @param numeroEndereco the numeroEndereco to set
	 */
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
