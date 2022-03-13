/**
 * 
 */
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
@Table(name="tb_medico")
public class Medico {
	
	@Id
	@Column(name="id_medico")
	@SequenceGenerator(name = "medico", sequenceName = "sq_tb_medico", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "medico")
	private int codigo;

	@Column(name="nm_medico",nullable=false,length=150)
	private String nome;
	
	@Column(name="dt_nasc")
	private Calendar dataNascimento;
	
	@Column(name="nr_cpf",nullable=false,length=11)
	private String cpf;
	
	@Column(name="nr_crm",nullable=false,length=6)
	private String crm;
	
	@Column(name="ds_uf_crm",nullable=false,length=6)
	private String estadoCrm;
	
	@Column(name="ds_especialidade")
	private String especialidade;

	/**
	 * 
	 */
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nome
	 * @param dataNascimento
	 * @param cpf
	 * @param crm
	 * @param estadoCrm
	 * @param especialidade
	 */
	public Medico(int codigo, String nome, Calendar dataNascimento, String cpf, String crm, String estadoCrm,
			String especialidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.crm = crm;
		this.estadoCrm = estadoCrm;
		this.especialidade = especialidade;
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
	 * @return the crm
	 */
	public String getCrm() {
		return crm;
	}

	/**
	 * @param crm the crm to set
	 */
	public void setCrm(String crm) {
		this.crm = crm;
	}

	/**
	 * @return the estadoCrm
	 */
	public String getEstadoCrm() {
		return estadoCrm;
	}

	/**
	 * @param estadoCrm the estadoCrm to set
	 */
	public void setEstadoCrm(String estadoCrm) {
		this.estadoCrm = estadoCrm;
	}

	/**
	 * @return the especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * @param especialidade the especialidade to set
	 */
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}