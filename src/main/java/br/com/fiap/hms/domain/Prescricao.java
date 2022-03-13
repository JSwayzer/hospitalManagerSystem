package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Johnny
 *
 */
@Entity
@Table(name="tb_prc")
public class Prescricao {

	@Id
	@SequenceGenerator(name="prescricao", sequenceName = "sq_tb_prc", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescricao")
	@Column(name="id_prc")
	private int codigoPrescricao;
	
	@OneToMany(mappedBy = "prescricaoMdt")
	private List<Medicamento> medicamento;
	
	@OneToOne
	@JoinColumn(name = "id_pct")
	private Paciente pacientePrc;
	
	@OneToOne
	@JoinColumn(name = "id_medico")
	private Medico medicoPrc;
	
	@Column(name="dt_prc",nullable=false)
	private Calendar dataPrescricao;
	
	@Column(name="ds_via",nullable=false,length=50)
	private String via;
	
	@Column(name="ds_dose",length=50)
	private String dose;
	
	@Column(name="ob_observaco",length=255)
	private String observacao;

}
