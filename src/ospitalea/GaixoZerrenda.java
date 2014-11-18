package ospitalea;

import java.util.ArrayList;


public class GaixoZerrenda {
	
	//Atributuak
	private ArrayList<Gaixoa> gaixoak;

	
	//Eraikitzailea
	public GaixoZerrenda(){
		this.gaixoak=new ArrayList<Gaixoa>();
	}
	
	//metodoak
	public void gehituGaixoa(String oz, String izena, String nan, String abizena) {
		Gaixoa gaixo=new Gaixoa(nan, oz, izena, abizena);
		this.gaixoak.add(gaixo);
	}
	public void kenduGaixoa(String oz) {
		Gaixoa gaixo=getGaixo(oz);
		this.gaixoak.remove(gaixo);
	}
	
	public Gaixoa getGaixo(String oz) {
		for (Gaixoa gaixoa : gaixoak) {
			if(gaixoa.getOsakidetzaZenb()==oz)
				return gaixoa;
		}
		return null;
	}
	
	public void gehituGaixoa(Gaixoa gaixoa) {
		this.gaixoak.add(gaixoa);
	}
	}
