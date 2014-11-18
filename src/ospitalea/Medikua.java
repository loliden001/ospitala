package ospitalea;

public class Medikua {
	//Atributuak
		private int id;
		private String izena;
		private int maxGaixo;
		private HitzorduZerrenda zerrenda;
		
		//Eraikitzailea
		public Medikua(int id, String izena, int max, HitzorduZerrenda z){
			this.id=id;
			this.izena=izena;
			this.maxGaixo=max;
			this.zerrenda=z;
		}

		//Getters && setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getIzena() {
			return izena;
		}

		public void setIzena(String izena) {
			this.izena = izena;
		}

		public int getMaxGaixo() {
			return maxGaixo;
		}

		public void setMaxGaixo(int maxGaixo) {
			this.maxGaixo = maxGaixo;
		}
		
		public HitzorduZerrenda getZerrenda() {
			return zerrenda;
		}

		
		//Metodoak
		public Hitzordua bilatuHitzordua(String data) {
			Hitzordua h=zerrenda.bilatuHitzordua(data);
			return h;
		}
		
		public boolean libreDago(String data) {
			Hitzordua h=bilatuHitzordua(data);
			if (h==null)
				return true;
			else
				return false;
		}
		
		
		public void hitzorduaGehitu(Hitzordua h) {
			zerrenda.gehituHitzordua(h);
		}
		
		public void hitzorduaKendu(Hitzordua h){
			zerrenda.hitzorduaKendu(h);
		}
}
