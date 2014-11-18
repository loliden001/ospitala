package ospitalea;


public class OspitalKudeatzailea {
	
	//Atributuak
	private MedikuZerrenda medikuak;
	private HitzorduZerrenda hitzorduak;
	private GaixoZerrenda gaixoak;
	
	
	//Eraikitzailea
	public OspitalKudeatzailea(){
		medikuak=new MedikuZerrenda();
		hitzorduak= new HitzorduZerrenda();
		gaixoak = new GaixoZerrenda();
	}
	
	
	//metodoak
	public void medikuBatenHitzorduaEzeztatu(int id, String data) {
		Medikua m = medikuak.bilatuMedikua(id);
		Hitzordua h = m.bilatuHitzordua(data);
		if (h != null) {
			Medikua mLibre = medikuak.bilatuMedikuLibrea(data);
			String oz = h.getGaixoa();
			Gaixoa gaixoa = gaixoak.getGaixo(oz);
			if (mLibre == null) {
				m.hitzorduaKendu(h);
				hitzorduak.hitzorduaKendu(h);
				System.out.println(gaixoa.getIzena()+ " "+ gaixoa.getAbizena()+ "-(e)ri "
								+ data + " eguneko zita bertan behera geratu zaio, ez baitzegoen mediku librerik");

			} else {
				mLibre.hitzorduaGehitu(h);
				m.hitzorduaKendu(h);
				h.setMedikua(mLibre.getId());
				System.out.println(gaixoa.getIzena() + " "
						+ gaixoa.getAbizena() + "-(e)ri " + data
						+ " eguneko zita " + mLibre.getIzena()
						+ " izena duen eta bere id " + mLibre.getId()
						+ " den medikua esleitu zaio");

			}
		} else {
			System.out.println("Ez dago hitzordurik id horrentzako");
		}
	}
	public void datuakSartu(){

			// Hitzorduak kargatu
			Hitzordua h1 = new Hitzordua("2014/11/21", "7959595", 123);
			Hitzordua h2 = new Hitzordua("2014/11/22", "8674353", 123);
			Hitzordua h4 = new Hitzordua("2014/11/24", "1235552", 189);
			Hitzordua h5 = new Hitzordua("2014/11/25", "7876864", 456);
			Hitzordua h6 = new Hitzordua("2014/11/29", "6484846", 456);
			Hitzordua h7 = new Hitzordua("2014/11/26", "9676888", 987);
			Hitzordua h8 = new Hitzordua("2014/11/26", "7876544", 987);
			Hitzordua h9 = new Hitzordua("2014/11/27", "6433455", 987);
			Hitzordua h10 = new Hitzordua("2014/11/27", "637537", 123);
			Hitzordua h11 = new Hitzordua("2014/11/27", "37383", 189);
			Hitzordua h12= new Hitzordua("2014/11/27", "7563543", 456);
			

			
			//Medikuen hitzordu zerrendak 
			HitzorduZerrenda hitzorduZerrenda1 = new HitzorduZerrenda();
			hitzorduZerrenda1.gehituHitzordua(h1);
			hitzorduZerrenda1.gehituHitzordua(h2);
			hitzorduZerrenda1.gehituHitzordua(h10);
			
			HitzorduZerrenda hitzorduZerrenda2 = new HitzorduZerrenda();
			hitzorduZerrenda2.gehituHitzordua(h4);
			hitzorduZerrenda2.gehituHitzordua(h11);

			HitzorduZerrenda hitzorduZerrenda3 = new HitzorduZerrenda();
			hitzorduZerrenda3.gehituHitzordua(h5);
			hitzorduZerrenda3.gehituHitzordua(h6);
			hitzorduZerrenda3.gehituHitzordua(h12);
			
			HitzorduZerrenda hitzorduZerrenda4 = new HitzorduZerrenda();
			hitzorduZerrenda4.gehituHitzordua(h7);
			hitzorduZerrenda4.gehituHitzordua(h8);
			hitzorduZerrenda4.gehituHitzordua(h9);

			Medikua m1=new Medikua(123, "kepa",20,hitzorduZerrenda1);
			Medikua m2=new Medikua(189, "unai",20, hitzorduZerrenda2);
			Medikua m3=new Medikua(456, "leire",15, hitzorduZerrenda3 );
			Medikua m4=new Medikua(987, "ainhoa", 20, hitzorduZerrenda4 );
			

			medikuak.gehituMediku(m1);
			medikuak.gehituMediku(m2);
			medikuak.gehituMediku(m3);
			medikuak.gehituMediku(m4);

			Gaixoa g1 = new Gaixoa("12", "7959595", "maria", "martin");
			Gaixoa g2 = new Gaixoa("13", "8674353", "peio", "martinez");
			Gaixoa g3 = new Gaixoa("14"," 9765745", "joxe","gomez"  );
			Gaixoa g4 = new Gaixoa("15", "1235552", "jesus", "fernandez");
			Gaixoa g5 = new Gaixoa("16", "7876864", "iñaki", "perez" );
			Gaixoa g6 = new Gaixoa("17", "6484846","peru", "hernandez" );
			Gaixoa g7 = new Gaixoa("18", "9676888","manolo", "sanchez");
			Gaixoa g8 = new Gaixoa("19", "7876544","juan", "pastor");
			Gaixoa g9 = new Gaixoa("20", "6433455", "mikel", "mateo");
			Gaixoa g10 = new Gaixoa("21", "637537", "aitor", "mondeo");
			Gaixoa g11 = new Gaixoa("22", "37383", "unai", "iglesias");
			Gaixoa g12= new Gaixoa("23", "7563543", "pepe", "zabala");
			
			gaixoak.gehituGaixoa(g1);
			gaixoak.gehituGaixoa(g2);
			gaixoak.gehituGaixoa(g3);
			gaixoak.gehituGaixoa(g4);
			gaixoak.gehituGaixoa(g5);
			gaixoak.gehituGaixoa(g6);
			gaixoak.gehituGaixoa(g7);
			gaixoak.gehituGaixoa(g8);
			gaixoak.gehituGaixoa(g9);
			gaixoak.gehituGaixoa(g10);
			gaixoak.gehituGaixoa(g11);
			gaixoak.gehituGaixoa(g12);

		}
			
	}
	
