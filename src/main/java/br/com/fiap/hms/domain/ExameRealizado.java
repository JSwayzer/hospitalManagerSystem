package br.com.fiap.hms.domain;

import java.sql.Blob;
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
@Table(name="tb_exm")
public class ExameRealizado {
	
	@Id
	@SequenceGenerator(name = "exameRealizado", sequenceName = "sq_tb_exm_real", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "exameRealizado")
	@Column(name="id_exm_real")
	private int codigoExameRealizado;
	
	@Column(name="dt_exm_real",nullable=false,length=255)
	private Calendar dataExameRealizado;
	
	@Column(name="dc_exm_real",nullable=false)
	private Blob docExameRealizado;

}
