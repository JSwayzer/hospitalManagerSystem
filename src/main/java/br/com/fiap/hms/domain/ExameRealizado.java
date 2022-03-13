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

}
