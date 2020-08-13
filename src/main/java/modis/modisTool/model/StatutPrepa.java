package modis.modisTool.model;

public enum StatutPrepa {
	
	  En_Prepa("En PREPA");

	  private String statutPrepa;
 
	private StatutPrepa(String statutPrepa) {
			this.statutPrepa = statutPrepa;
		}
	public String getStatutPrepa() {
		return statutPrepa;
	}	
}
