package pl.zetosoftware.jeeuwm.model.uwm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gmina database table.
 * 
 */
@Entity
@NamedQuery(name="Gmina.findAll", query="SELECT g FROM Gmina g")
@Table(schema="uwm" ,name="gmina")
public class Gmina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GMINA_ID_GENERATOR", sequenceName="UWM.GMINA_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GMINA_ID_GENERATOR")
	private Long id;

	@Column(name="fk_powiat")
	private Long fkPowiat;

	@Column(name="kod_teryt")
	private String kodTeryt;

	private String nazwa;

	public Gmina() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFkPowiat() {
		return this.fkPowiat;
	}

	public void setFkPowiat(Long fkPowiat) {
		this.fkPowiat = fkPowiat;
	}

	public String getKodTeryt() {
		return this.kodTeryt;
	}

	public void setKodTeryt(String kodTeryt) {
		this.kodTeryt = kodTeryt;
	}

	public String getNazwa() {
		return this.nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

}