package modis.modisTool.model;

public enum StatutFerme {

	Ferme("FERME");
	private String statutFerme;

	private StatutFerme(String statutFerme) {
		this.statutFerme = statutFerme;
	}

	public String getStatutFerme() {
		return statutFerme;
	}
	
}
