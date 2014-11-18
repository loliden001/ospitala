package ospitalea;

import java.util.Scanner;


public class Interfazea {

	public static void main(String[] args) {
		OspitalKudeatzailea ok=new OspitalKudeatzailea();
		ok.datuakSartu();
		System.out.println("Datuak kargatu dira\n");
		Scanner sc= new Scanner(System.in);
		System.out.println("Sartu zure id zenbakia mesedez");
		int id=sc.nextInt();
		System.out.println("Sartu ezazu ezabatu nahi duzun hitzorduaren data");
		String data=sc.next();
		sc.close();
		try {
			ok.medikuBatenHitzorduaEzeztatu(id, data);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}
