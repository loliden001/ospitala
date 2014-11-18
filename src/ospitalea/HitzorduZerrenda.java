package ospitalea;

import java.util.ArrayList;


public class HitzorduZerrenda {
	private ArrayList<Hitzordua> hitzorduak;

	
	//Eraikitzailea
	public HitzorduZerrenda(){
		hitzorduak=new ArrayList<Hitzordua>();
	}
	//Metodoak
	public Hitzordua bilatuHitzordua(String data) {
		for (Hitzordua hitzordua : hitzorduak) {
			if (hitzordua.getOrduaEguna().equals(data))
				return hitzordua;
		}
		return null;
	}
	
	public void gehituHitzordua(Hitzordua h){
		hitzorduak.add(h);
	}
	public void hitzorduaKendu(Hitzordua h){
		hitzorduak.remove(h);
	}
	
}
