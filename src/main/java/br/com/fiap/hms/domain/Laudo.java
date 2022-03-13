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
@Table(name="tb_laudo")
public class Laudo {

	@Id
	@SequenceGenerator(name="laudo", sequenceName = "sq_tb_laudo", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="laudo")
	@Column(name="id_laudo")
	private int codigoLaudo;
	
	@Column(name="dt_laudo",nullable=false)
	private Calendar dataLaudo;
	
	@Column(name="dc_laudo",nullable = false)
	private Blob docLaudo;
	
}
