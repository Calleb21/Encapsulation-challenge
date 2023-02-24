package oo.encapsulamento.equipe1;

import oo.encapsulamento.equipe2.Mercedes;

public class Ferrari {

	public String nossaHistoria = "Somos a equipe com mais fãns e tradição na história da F1!";
	public String pilotosFerrari = "Piloto 1: Charles Leclerc Piloto 2: Carlos Sainz.";
	
	public static void main(String[] args) {
		AlfaRomeo uniao = new AlfaRomeo();
		System.out.println(uniao.passadoDaEquipe);
		System.out.println(uniao.pilotosAlfa);

		System.out.println("\n");

		Mercedes rival = new Mercedes();
		System.out.println(rival.pilotosMercedes);
	}
}
