package ospitalea;

public class Hitzordua {
	
	//Atributuak 
	private String orduaEguna;
	private String gaixoa;
	private int medikua;
	
	//Eraikitzailea
	public Hitzordua(String pEO, String pGaixo, int pMediku){
		this.orduaEguna=pEO;
		this.gaixoa=pGaixo;
		this.medikua=pMediku;
	}

	public String getOrduaEguna() {
		return orduaEguna;
	}

	public void setOrduaEguna(String orduaEguna) {
		this.orduaEguna = orduaEguna;
	}

	public String getGaixoa() {
		return gaixoa;
	}

	public void setGaixoa(String gaixoa) {
		this.gaixoa = gaixoa;
	}

	public int getMedikua() {
		return medikua;
	}

	public void setMedikua(int medikua) {
		this.medikua = medikua;
	}
	
}

