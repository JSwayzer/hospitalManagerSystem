package br.com.fiap.hms.domain;

import java.sql.Blob;
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

	@OneToMany(mappedBy = "exameRealizado")
	private List<Exame> exames;
	
	@OneToMany(mappedBy = "exameRealizadoLaudo")
	private List<Laudo> laudos;
	
	@JoinColumn(name = "id_pct")
	@ManyToOne
	private Paciente pacienteExmReal;
	
	@JoinColumn(name = "id_medico")
	@ManyToOne
	private Medico medicoExmReal;
	
	@Column(name="dt_exm_real",nullable=false,length=255)
	private Calendar dataExameRealizado;
	
	@Column(name="dc_exm_real",nullable=false)
	private Blob docExameRealizado;

	/**
	 * @param codigoExameRealizado
	 * @param exames
	 * @param laudos
	 * @param pacienteExmReal
	 * @param medicoExmReal
	 * @param dataExameRealizado
	 * @param docExameRealizado
	 */
	public ExameRealizado(int codigoExameRealizado, List<Exame> exames, List<Laudo> laudos, Paciente pacienteExmReal,
			Medico medicoExmReal, Calendar dataExameRealizado, Blob docExameRealizado) {
		super();
		this.codigoExameRealizado = codigoExameRealizado;
		this.exames = exames;
		this.laudos = laudos;
		this.pacienteExmReal = pacienteExmReal;
		this.medicoExmReal = medicoExmReal;
		this.dataExameRealizado = dataExameRealizado;
		this.docExameRealizado = docExameRealizado;
	}

	/**
	 * 
	 */
	public ExameRealizado() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the exames
	 */
	public List<Exame> getExames() {
		return exames;
	}

	/**
	 * @param exames the exames to set
	 */
	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	/**
	 * @return the laudos
	 */
	public List<Laudo> getLaudos() {
		return laudos;
	}

	/**
	 * @param laudos the laudos to set
	 */
	public void setLaudos(List<Laudo> laudos) {
		this.laudos = laudos;
	}

	/**
	 * @return the pacienteExmReal
	 */
	public Paciente getPacienteExmReal() {
		return pacienteExmReal;
	}

	/**
	 * @param pacienteExmReal the pacienteExmReal to set
	 */
	public void setPacienteExmReal(Paciente pacienteExmReal) {
		this.pacienteExmReal = pacienteExmReal;
	}

	/**
	 * @return the medicoExmReal
	 */
	public Medico getMedicoExmReal() {
		return medicoExmReal;
	}

	/**
	 * @param medicoExmReal the medicoExmReal to set
	 */
	public void setMedicoExmReal(Medico medicoExmReal) {
		this.medicoExmReal = medicoExmReal;
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
