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
	
	public ExameRealizado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoExameRealizado
	 * @param dataExameRealizado
	 * @param docExameRealizado
	 */
	public ExameRealizado(int codigoExameRealizado, Calendar dataExameRealizado, Blob docExameRealizado) {
		super();
		this.codigoExameRealizado = codigoExameRealizado;
		this.dataExameRealizado = dataExameRealizado;
		this.docExameRealizado = docExameRealizado;
	}

	/**
	 * @return the codigoExameRealizado
	 */
	public int getCodigoExameRealizado() {
		return codigoExameRealizado;
	}

	/**
	 * @param codigoExameRealizado the codigoExameRealizado to set
	 */
	public void setCodigoExameRealizado(int codigoExameRealizado) {
		this.codigoExameRealizado = codigoExameRealizado;
	}

	/**
	 * @return the dataExameRealizado
	 */
	public Calendar getDataExameRealizado() {
		return dataExameRealizado;
	}

	/**
	 * @param dataExameRealizado the dataExameRealizado to set
	 */
	public void setDataExameRealizado(Calendar dataExameRealizado) {
		this.dataExameRealizado = dataExameRealizado;
	}

	/**
	 * @return the docExameRealizado
	 */
	public Blob getDocExameRealizado() {
		return docExameRealizado;
	}

	/**
	 * @param docExameRealizado the docExameRealizado to set
	 */
	public void setDocExameRealizado(Blob docExameRealizado) {
		this.docExameRealizado = docExameRealizado;
	}

}
