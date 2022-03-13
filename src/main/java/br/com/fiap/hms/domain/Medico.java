/**
 * 
 */
package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne(mappedBy = "medicoPrc")
	private Prescricao prescricaoMedico;

	@JoinColumn(name = "id_pct")
	@ManyToOne
	private Paciente pacienteMedico;
	
	@OneToMany(mappedBy = "medicoExmReal")
	private List<ExameRealizado> exameRealizadoMedico;
	
	@OneToMany(mappedBy = "medicoPainel")
	private List<Painel> painelMedico;
	
	@OneToMany(mappedBy = "medicoLaudo")
	private List<Laudo> laudoMedico;
	
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
	 * @param codigo
	 * @param prescricaoMedico
	 * @param pacienteMedico
	 * @param exameRealizadoMedico
	 * @param painelMedico
	 * @param laudoMedico
	 * @param nome
	 * @param dataNascimento
	 * @param cpf
	 * @param crm
	 * @param estadoCrm
	 * @param especialidade
	 */
	public Medico(int codigo, Prescricao prescricaoMedico, Paciente pacienteMedico,
			List<ExameRealizado> exameRealizadoMedico, List<Painel> painelMedico, List<Laudo> laudoMedico, String nome,
			Calendar dataNascimento, String cpf, String crm, String estadoCrm, String especialidade) {
		super();
		this.codigo = codigo;
		this.prescricaoMedico = prescricaoMedico;
		this.pacienteMedico = pacienteMedico;
		this.exameRealizadoMedico = exameRealizadoMedico;
		this.painelMedico = painelMedico;
		this.laudoMedico = laudoMedico;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.crm = crm;
		this.estadoCrm = estadoCrm;
		this.especialidade = especialidade;
	}

	/**
	 * 
	 */
	public Medico() {
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
	 * @return the prescricaoMedico
	 */
	public Prescricao getPrescricaoMedico() {
		return prescricaoMedico;
	}

	/**
	 * @param prescricaoMedico the prescricaoMedico to set
	 */
	public void setPrescricaoMedico(Prescricao prescricaoMedico) {
		this.prescricaoMedico = prescricaoMedico;
	}

	/**
	 * @return the pacienteMedico
	 */
	public Paciente getPacienteMedico() {
		return pacienteMedico;
	}

	/**
	 * @param pacienteMedico the pacienteMedico to set
	 */
	public void setPacienteMedico(Paciente pacienteMedico) {
		this.pacienteMedico = pacienteMedico;
	}

	/**
	 * @return the exameRealizadoMedico
	 */
	public List<ExameRealizado> getExameRealizadoMedico() {
		return exameRealizadoMedico;
	}

	/**
	 * @param exameRealizadoMedico the exameRealizadoMedico to set
	 */
	public void setExameRealizadoMedico(List<ExameRealizado> exameRealizadoMedico) {
		this.exameRealizadoMedico = exameRealizadoMedico;
	}

	/**
	 * @return the painelMedico
	 */
	public List<Painel> getPainelMedico() {
		return painelMedico;
	}

	/**
	 * @param painelMedico the painelMedico to set
	 */
	public void setPainelMedico(List<Painel> painelMedico) {
		this.painelMedico = painelMedico;
	}

	/**
	 * @return the laudoMedico
	 */
	public List<Laudo> getLaudoMedico() {
		return laudoMedico;
	}

	/**
	 * @param laudoMedico the laudoMedico to set
	 */
	public void setLaudoMedico(List<Laudo> laudoMedico) {
		this.laudoMedico = laudoMedico;
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