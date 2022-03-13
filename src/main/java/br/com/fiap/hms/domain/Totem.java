package br.com.fiap.hms.domain;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Johnny
 *
 */
@Entity
@Table(name="tb_tt_snh")
public class Totem {

	@Id
	@Column(name="id_tt_snh")
	@SequenceGenerator(name="totem",sequenceName = "sq_tb_tt_snh", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "totem")
	private int codigoTotem;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name = "id_tt_snh"), inverseJoinColumns = @JoinColumn(name = "id_pnl_snh"), name = "rl_tt_pnl")
	private List<Painel> painel;
	
	@JoinColumn(name = "id_und")
	@ManyToOne
	private Unidade unidade;
	
	@OneToOne
	@JoinColumn(name = "id_pct")
	private Paciente pacienteTt;
	
	@Column(name="ds_tt_snh",nullable=false,length=80)
	private String totemSenha;
	
	@Column(name="ds_snh",nullable=false,length=50)
	private String senha;
	
	@Column(name="dt_retirada_snh",nullable=false)
	private Calendar dataRetiradaSenha;

}
