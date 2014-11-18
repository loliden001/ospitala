package ospitalea;

import java.util.ArrayList;


public class MedikuZerrenda {
	
	//Atributuak
	private ArrayList<Medikua> medikuak;
	
	//Eraikitzailea
	public MedikuZerrenda(){
		this.medikuak= new ArrayList<Medikua>();
	}

	//Metodoak
	
	public Medikua bilatuMedikua(int id){
		for (Medikua mediku : medikuak) {
			if (mediku.getId()==id)
			return mediku;
		}
		return null;
	}
	
	public Medikua bilatuMedikuLibrea(String data) {
		for (Medikua medikua : medikuak) {
				if(medikua.libreDago(data))
					return medikua;
		}
		return null;
	}
	public void gehituMediku(Medikua m){
		medikuak.add(m);
	}
}

