package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Johnny
 *
 */
@Entity
@Table(name="tb_pnl_snh")
public class Painel {

	@Id
	@SequenceGenerator(name="painel", sequenceName = "sq_tb_pnl_snh", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "painel")
	private int codigoPainel;
	
	@ManyToMany(mappedBy = "painel")
	private List<Totem> totem;
	
	@JoinColumn(name = "id_medico")
	@ManyToOne
	private Medico medicoPainel;
	
	@Column(name="ds_painel")
	private String painel;
	
	@Column(name="dt_chamada_snh")
	private Calendar dataChamadaSenha;

	/**
	 * @param codigoPainel
	 * @param totem
	 * @param medicoPainel
	 * @param painel
	 * @param dataChamadaSenha
	 */
	public Painel(int codigoPainel, List<Totem> totem, Medico medicoPainel, String painel, Calendar dataChamadaSenha) {
		super();
		this.codigoPainel = codigoPainel;
		this.totem = totem;
		this.medicoPainel = medicoPainel;
		this.painel = painel;
		this.dataChamadaSenha = dataChamadaSenha;
	}

	/**
	 * 
	 */
	public Painel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the codigoPainel
	 */
	public int getCodigoPainel() {
		return codigoPainel;
	}

	/**
	 * @param codigoPainel the codigoPainel to set
	 */
	public void setCodigoPainel(int codigoPainel) {
		this.codigoPainel = codigoPainel;
	}

	/**
	 * @return the totem
	 */
	public List<Totem> getTotem() {
		return totem;
	}

	/**
	 * @param totem the totem to set
	 */
	public void setTotem(List<Totem> totem) {
		this.totem = totem;
	}

	/**
	 * @return the medicoPainel
	 */
	public Medico getMedicoPainel() {
		return medicoPainel;
	}

	/**
	 * @param medicoPainel the medicoPainel to set
	 */
	public void setMedicoPainel(Medico medicoPainel) {
		this.medicoPainel = medicoPainel;
	}

	/**
	 * @return the painel
	 */
	public String getPainel() {
		return painel;
	}

	/**
	 * @param painel the painel to set
	 */
	public void setPainel(String painel) {
		this.painel = painel;
	}

	/**
	 * @return the dataChamadaSenha
	 */
	public Calendar getDataChamadaSenha() {
		return dataChamadaSenha;
	}

	/**
	 * @param dataChamadaSenha the dataChamadaSenha to set
	 */
	public void setDataChamadaSenha(Calendar dataChamadaSenha) {
		this.dataChamadaSenha = dataChamadaSenha;
	}

}
