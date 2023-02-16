package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the luogo database table.
 * 
 */
@Entity
@NamedQuery(name="Luogo.findAll", query="SELECT l FROM Luogo l")
public class Luogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LUOGO_IDLUOGO_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LUOGO_IDLUOGO_GENERATOR")
	@Column(name="id_luogo")
	private Integer idLuogo;

	private String citta;

	private String nome;

	//bi-directional many-to-one association to Eventi
	@OneToMany(mappedBy="luogo", cascade = CascadeType.REMOVE)
	private List<Eventi> eventis;

	public Luogo() {
	}

	public Integer getIdLuogo() {
		return this.idLuogo;
	}

	public void setIdLuogo(Integer idLuogo) {
		this.idLuogo = idLuogo;
	}

	public String getCitta() {
		return this.citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Eventi> getEventis() {
		return this.eventis;
	}

	public void setEventis(List<Eventi> eventis) {
		this.eventis = eventis;
	}

	public Eventi addEventi(Eventi eventi) {
		getEventis().add(eventi);
		eventi.setLuogo(this);

		return eventi;
	}

	public Eventi removeEventi(Eventi eventi) {
		getEventis().remove(eventi);
		eventi.setLuogo(null);

		return eventi;
	}

}