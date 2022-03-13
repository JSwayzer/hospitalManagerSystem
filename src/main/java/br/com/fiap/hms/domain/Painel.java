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

}
