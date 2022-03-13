package br.com.fiap.hms.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@JoinColumn(name = "id_exm_real")
	@ManyToOne
	private ExameRealizado exameRealizado;
	
	@Column(name="ds_exm",nullable=false,length=255)
	private String nomeExame;
	
	@Column(name="ds_tipo_exm",nullable=false,length=100)
	private String tipoExame;
	
	@Column(name="ds_regiao_exm",nullable=false,length=100)
	private String dataExame;

	/**
	 * @param codigoExame
	 * @param exameRealizado
	 * @param nomeExame
	 * @param tipoExame
	 * @param dataExame
	 */
	public Exame(int codigoExame, ExameRealizado exameRealizado, String nomeExame, String tipoExame, String dataExame) {
		super();
		this.codigoExame = codigoExame;
		this.exameRealizado = exameRealizado;
		this.nomeExame = nomeExame;
		this.tipoExame = tipoExame;
		this.dataExame = dataExame;
	}

	/**
	 * 
	 */
	public Exame() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the exameRealizado
	 */
	public ExameRealizado getExameRealizado() {
		return exameRealizado;
	}

	/**
	 * @param exameRealizado the exameRealizado to set
	 */
	public void setExameRealizado(ExameRealizado exameRealizado) {
		this.exameRealizado = exameRealizado;
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
