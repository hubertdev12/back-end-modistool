package modis.modisTool.model;

public enum StatutFini {
	
	Fin("FINI");
	
	private String statutFini;

	private StatutFini(String statutFini) {
		this.statutFini = statutFini;
	}

	public String getStatutFini() {
		return statutFini;
	}
	

}
