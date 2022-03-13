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
	
	public Exame() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigoExame
	 * @param nomeExame
	 * @param tipoExame
	 * @param dataExame
	 */
	public Exame(int codigoExame, String nomeExame, String tipoExame, String dataExame) {
		super();
		this.codigoExame = codigoExame;
		this.nomeExame = nomeExame;
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
	}

	/**
	 * @return the codigoExame
	 */
	public int getCodigoExame() {
		return codigoExame;
	}

	/**
	 * @param codigoExame the codigoExame to set
	 */
	public void setCodigoExame(int codigoExame) {
		this.codigoExame = codigoExame;
	}

	/**
	 * @return the nomeExame
	 */
	public String getNomeExame() {
		return nomeExame;
	}

	/**
	 * @param nomeExame the nomeExame to set
	 */
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	/**
	 * @return the tipoExame
	 */
	public String getTipoExame() {
		return tipoExame;
	}

	/**
	 * @param tipoExame the tipoExame to set
	 */
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	/**
	 * @return the dataExame
	 */
	public String getDataExame() {
		return dataExame;
	}

	/**
	 * @param dataExame the dataExame to set
	 */
	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}

}
