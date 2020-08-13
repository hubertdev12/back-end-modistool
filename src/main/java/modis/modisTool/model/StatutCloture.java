package modis.modisTool.model;

public enum StatutCloture {
	
	Cloture("CLOTURE");
	
	private String statutCloture;

	private StatutCloture(String statutCloture) {
		this.statutCloture = statutCloture;
	}

	public String getStatutCloture() {
		return statutCloture;
	}
	

}
