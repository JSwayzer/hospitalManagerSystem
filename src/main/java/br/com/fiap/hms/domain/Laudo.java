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
	
	public Laudo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoLaudo
	 * @param dataLaudo
	 * @param docLaudo
	 */
	public Laudo(int codigoLaudo, Calendar dataLaudo, Blob docLaudo) {
		super();
		this.codigoLaudo = codigoLaudo;
		this.dataLaudo = dataLaudo;
		this.docLaudo = docLaudo;
	}

	/**
	 * @return the codigoLaudo
	 */
	public int getCodigoLaudo() {
		return codigoLaudo;
	}

	/**
	 * @param codigoLaudo the codigoLaudo to set
	 */
	public void setCodigoLaudo(int codigoLaudo) {
		this.codigoLaudo = codigoLaudo;
	}

	/**
	 * @return the dataLaudo
	 */
	public Calendar getDataLaudo() {
		return dataLaudo;
	}

	/**
	 * @param dataLaudo the dataLaudo to set
	 */
	public void setDataLaudo(Calendar dataLaudo) {
		this.dataLaudo = dataLaudo;
	}

	/**
	 * @return the docLaudo
	 */
	public Blob getDocLaudo() {
		return docLaudo;
	}

	/**
	 * @param docLaudo the docLaudo to set
	 */
	public void setDocLaudo(Blob docLaudo) {
		this.docLaudo = docLaudo;
	}

}
