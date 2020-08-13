package modis.modisTool.model;

public enum StatutAnnule {
	
	Annule("ANNULE");
	
	private String statutAnnule;

	private StatutAnnule(String statutAnnule) {
		this.statutAnnule = statutAnnule;
	}

	public String getStatutAnnule() {
		return statutAnnule;
	}
	

}
