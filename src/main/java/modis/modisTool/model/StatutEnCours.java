package modis.modisTool.model;

public enum StatutEnCours {
	
	En_Cours("EN COURS");
	
	private String statutEnCours;

	private StatutEnCours(String statutEnCours) {
		this.statutEnCours = statutEnCours;
	}

	public String getStatutEnCours() {
		return statutEnCours;
	}
	

}
