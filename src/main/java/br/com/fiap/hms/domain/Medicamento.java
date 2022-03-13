package br.com.fiap.hms.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(name="nm_mdt")
	private String nomeMedicamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_validade")
	private Calendar dataValidade;
	
	public Medicamento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nomeMedicamento
	 * @param dataValidade
	 */
	public Medicamento(int codigo, String nomeMedicamento, Calendar dataValidade) {
		super();
		this.codigoMedicamento = codigo;
		this.nomeMedicamento = nomeMedicamento;
		this.dataValidade = dataValidade;
	}

	/**
	 * @return the codigoMedicamento
	 */
	public int getCodigo() {
		return codigoMedicamento;
	}

	/**
	 * @param codigo the codigoMedicamento to set
	 */
	public void setCodigo(int codigo) {
		this.codigoMedicamento = codigo;
	}

	/**
	 * @return the nomeMedicamento
	 */
	public String getNomeMedicamento() {
		return nomeMedicamento;
	}

	/**
	 * @param nomeMedicamento the nomeMedicamento to set
	 */
	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

	/**
	 * @return the dataValidade
	 */
	public Calendar getDataValidade() {
		return dataValidade;
	}

	/**
	 * @param dataValidade the dataValidade to set
	 */
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	
}
