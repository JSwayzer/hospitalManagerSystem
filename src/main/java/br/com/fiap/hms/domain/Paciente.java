/**
 * 
 */
package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy = "pacienteTt")
	private Totem totemPct;
	
	@OneToOne(mappedBy = "pacientePrc")
	private Prescricao prescricaoPct;
	
	@OneToMany(mappedBy = "pacienteMedico")
	private List<Medico> medicos;
	
	@OneToMany(mappedBy = "pacienteExmReal")
	private List<ExameRealizado> exameRealizadoPct;
	
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
	 * @param codigo
	 * @param totemPct
	 * @param prescricaoPct
	 * @param medicos
	 * @param exameRealizadoPct
	 * @param nome
	 * @param dataNascimento
	 * @param cpf
	 * @param dataCadastro
	 * @param dataAdmissao
	 * @param prioridade
	 */
	public Paciente(int codigo, Totem totemPct, Prescricao prescricaoPct, List<Medico> medicos,
			List<ExameRealizado> exameRealizadoPct, String nome, Calendar dataNascimento, String cpf,
			Calendar dataCadastro, Calendar dataAdmissao, Prioridade prioridade) {
		super();
		this.codigo = codigo;
		this.totemPct = totemPct;
		this.prescricaoPct = prescricaoPct;
		this.medicos = medicos;
		this.exameRealizadoPct = exameRealizadoPct;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.dataCadastro = dataCadastro;
		this.dataAdmissao = dataAdmissao;
		this.prioridade = prioridade;
	}

	/**
	 * 
	 */
	public Paciente() {
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
	 * @return the totemPct
	 */
	public Totem getTotemPct() {
		return totemPct;
	}

	/**
	 * @param totemPct the totemPct to set
	 */
	public void setTotemPct(Totem totemPct) {
		this.totemPct = totemPct;
	}

	/**
	 * @return the prescricaoPct
	 */
	public Prescricao getPrescricaoPct() {
		return prescricaoPct;
	}

	/**
	 * @param prescricaoPct the prescricaoPct to set
	 */
	public void setPrescricaoPct(Prescricao prescricaoPct) {
		this.prescricaoPct = prescricaoPct;
	}

	/**
	 * @return the medicos
	 */
	public List<Medico> getMedicos() {
		return medicos;
	}

	/**
	 * @param medicos the medicos to set
	 */
	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}

	/**
	 * @return the exameRealizadoPct
	 */
	public List<ExameRealizado> getExameRealizadoPct() {
		return exameRealizadoPct;
	}

	/**
	 * @param exameRealizadoPct the exameRealizadoPct to set
	 */
	public void setExameRealizadoPct(List<ExameRealizado> exameRealizadoPct) {
		this.exameRealizadoPct = exameRealizadoPct;
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
