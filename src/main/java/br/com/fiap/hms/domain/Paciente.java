/**
 * 
 */
package br.com.fiap.hms.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author Johnny
 *
 */

@Entity
@Table(name="tb_pct")
public class Paciente {

	@Id
	@Column(name="id_pct")
	@SequenceGenerator(name = "pct", sequenceName = "sq_tb_pct", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pct")
	private int codigo;

	@Column(name="nm_pct",nullable=false,length=150)
	private String nome;
	
	@Column(name="dt_nasc",nullable=false)
	private Calendar dataNascimento;
	
	@Column(name="nr_cpf",nullable=false,length=11)
	private String cpf;
	
	@CreationTimestamp
	@Column(name="dt_cadastro",nullable=false)
	private Calendar dataCadastro;
	
	@UpdateTimestamp
	@Column(name="dt_admissao")
	private Calendar dataAdmissao;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_prioridade")
	private Prioridade prioridade;

	/**
	 * 
	 */
	public Paciente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param dataNascimento
	 * @param cpf
	 * @param dataCadastro
	 * @param dataAdmissao
	 * @param prioridade
	 */
	public Paciente(int codigo, String nome, Calendar dataNascimento, String cpf, Calendar dataCadastro,
			Calendar dataAdmissao, Prioridade prioridade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.dataCadastro = dataCadastro;
		this.dataAdmissao = dataAdmissao;
		this.prioridade = prioridade;
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
	 * @return the dataNascimento
	 */
	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the dataCadastro
	 */
	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the dataAdmissao
	 */
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	/**
	 * @param dataAdmissao the dataAdmissao to set
	 */
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	/**
	 * @return the prioridade
	 */
	public Prioridade getPrioridade() {
		return prioridade;
	}

	/**
	 * @param prioridade the prioridade to set
	 */
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

}
