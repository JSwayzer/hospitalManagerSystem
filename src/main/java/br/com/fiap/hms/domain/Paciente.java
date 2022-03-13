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

}
