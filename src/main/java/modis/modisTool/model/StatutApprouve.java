package modis.modisTool.model;

public enum StatutApprouve {

	Approuve("APPROUVE");
	
	private String statutApprouve;

	private StatutApprouve(String statutApprouve) {
		this.statutApprouve = statutApprouve;
	}

	public String getStatutApprouve() {
		return statutApprouve;
	}
	
}
