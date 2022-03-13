package br.com.fiap.hms.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Johnny
 *
 */
@Entity
@Table(name="tb_medicamento")
public class Medicamento {

	@Id
	@Column(name="id_mdt")
	@SequenceGenerator(name="medicamento",sequenceName = "sq_tb_mdt", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "medicamento")
	private int codigoMedicamento;
	
	@JoinColumn(name = "id_prc")
	@ManyToOne
	private Prescricao prescricaoMdt;
	
	@Column(name="nm_mdt")
	private String nomeMedicamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_validade")
	private Calendar dataValidade;
	
}
