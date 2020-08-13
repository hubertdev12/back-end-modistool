package modis.modisTool.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "seqDonnee", sequenceName = "seq_donnee", initialValue = 1, allocationSize = 1)
public class Donnee {
	@Id
	@Column(name = "numTache")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqDonnee")
	private Integer numTache;
	@Column(name = "statutPrepa")
	private StatutPrepa statutPrepa;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateEnPrepa")
	private Date dateEnPrepa;
	@Column(name = "statutApprouve")
	private StatutApprouve statutApprouve;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateApprouve")
	private Date dateApprouve;
	@Column(name = "statutPret")
	private StatutPret statutPret;
	@Temporal(TemporalType.DATE)
	@Column(name = "datePret")
	private Date datePret;
	@Column(name = "statutEnCours")
	private StatutEnCours statutEnCours;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateEnCours")
	private Date dateEnCours;
	@Column(name = "statutFini")
	private StatutFini statutFini;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateFini")
	private Date dateFini;
	@Column(name = "statutCom1n")
	private StatutCom1n statutCom1n;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateCom1n")
	private Date dateCom1n;
	@Column(name = "statutCloture")
	private StatutCloture statutCloture;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateCloture")
	private Date dateCloture;
	@Column(name = "statutAnnule")
	private StatutAnnule statutAnnule;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateAnnule")
	private Date dateAnnule;
	@Column(name = "statutFerme")
	private StatutFerme statutFerme;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateFerme")
	private Date dateFerme;
	
	public Donnee() {
		
	}

	public Integer getNumTache() {
		return numTache;
	}


	public void setNumTache(Integer numTache) {
		this.numTache = numTache;
	}


	public StatutPrepa getStatutPrepa() {
		return statutPrepa;
	}


	public void setStatutPrepa(StatutPrepa statutPrepa) {
		this.statutPrepa = statutPrepa;
	}


	public Date getDateEnPrepa() {
		return dateEnPrepa;
	}


	public void setDateEnPrepa(Date dateEnPrepa) {
		this.dateEnPrepa = dateEnPrepa;
	}


	public StatutApprouve getStatutApprouve() {
		return statutApprouve;
	}


	public void setStatutApprouve(StatutApprouve statutApprouve) {
		this.statutApprouve = statutApprouve;
	}


	public Date getDateApprouve() {
		return dateApprouve;
	}


	public void setDateApprouve(Date dateApprouve) {
		this.dateApprouve = dateApprouve;
	}


	public StatutPret getStatutPret() {
		return statutPret;
	}


	public void setStatutPret(StatutPret statutPret) {
		this.statutPret = statutPret;
	}


	public Date getDatePret() {
		return datePret;
	}


	public void setDatePret(Date datePret) {
		this.datePret = datePret;
	}


	public StatutEnCours getStatutEnCours() {
		return statutEnCours;
	}


	public void setStatutEnCours(StatutEnCours statutEnCours) {
		this.statutEnCours = statutEnCours;
	}


	public Date getDateEnCours() {
		return dateEnCours;
	}


	public void setDateEnCours(Date dateEnCours) {
		this.dateEnCours = dateEnCours;
	}


	public StatutFini getStatutFini() {
		return statutFini;
	}


	public void setStatutFini(StatutFini statutFini) {
		this.statutFini = statutFini;
	}


	public Date getDateFini() {
		return dateFini;
	}


	public void setDateFini(Date dateFini) {
		this.dateFini = dateFini;
	}


	public StatutCom1n getStatutCom1n() {
		return statutCom1n;
	}


	public void setStatutCom1n(StatutCom1n statutCom1n) {
		this.statutCom1n = statutCom1n;
	}


	public Date getDateCom1n() {
		return dateCom1n;
	}


	public void setDateCom1n(Date dateCom1n) {
		this.dateCom1n = dateCom1n;
	}


	public StatutCloture getStatutCloture() {
		return statutCloture;
	}


	public void setStatutCloture(StatutCloture statutCloture) {
		this.statutCloture = statutCloture;
	}


	public Date getDateCloture() {
		return dateCloture;
	}


	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
	}


	public StatutAnnule getStatutAnnule() {
		return statutAnnule;
	}


	public void setStatutAnnule(StatutAnnule statutAnnule) {
		this.statutAnnule = statutAnnule;
	}


	public Date getDateAnnule() {
		return dateAnnule;
	}


	public void setDateAnnule(Date dateAnnule) {
		this.dateAnnule = dateAnnule;
	}


	public StatutFerme getStatutFerme() {
		return statutFerme;
	}


	public void setStatutFerme(StatutFerme statutFerme) {
		this.statutFerme = statutFerme;
	}


	public Date getDateFerme() {
		return dateFerme;
	}


	public void setDateFerme(Date dateFerme) {
		this.dateFerme = dateFerme;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numTache == null) ? 0 : numTache.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Donnee other = (Donnee) obj;
		if (numTache == null) {
			if (other.numTache != null)
				return false;
		} else if (!numTache.equals(other.numTache))
			return false;
		return true;
	}
	
	
	

}
