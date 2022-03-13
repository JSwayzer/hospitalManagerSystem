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
@Table(name="tb_exm")
public class Exame {

	@Id
	@SequenceGenerator(name = "exame", sequenceName = "sq_tb_exm", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "exame")
	@Column(name="id_exm")
	private int codigoExame;
	
	@Column(name="ds_exm",nullable=false,length=255)
	private String nomeExame;
	
	@Column(name="ds_tipo_exm",nullable=false,length=100)
	private String tipoExame;
	
	@Column(name="ds_regiao_exm",nullable=false,length=100)
	private String dataExame;
	
}
