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

}