package ospitalea;

public class Gaixoa {

	//Atributuak
	private String nan;
	private String osakidetzaZenb;
	private String izena;
	private String abizena;
	
	//Eraikitzailea
	public Gaixoa(String nan, String oz, String izena, String abizena){
		this.nan=nan;
		this.osakidetzaZenb=oz;
		this.izena=izena;
		this.abizena=abizena;
	}

	//Getters && setters
	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getOsakidetzaZenb() {
		return osakidetzaZenb;
	}

	public void setOsakidetzaZenb(String osakidetzaZenb) {
		this.osakidetzaZenb = osakidetzaZenb;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	
}
