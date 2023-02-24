package oo.encapsulamento.equipe2;

import oo.encapsulamento.equipe1.Ferrari;

public class Williams {

	String compartilhamentoDoMotor = "Utiliza o mesmo motor da Mercedes.";
	public String pilotosWilliams = "Piloto 1: Aleander Albon Piloto 2: Logan Sargeant";

	public static void main(String[] args) {

		Mercedes parceira = new Mercedes();
		System.out.println(parceira.novoPiloto);
		System.out.println(parceira.pilotosMercedes);

		System.out.println("\n");

		Ferrari rival = new Ferrari();
		System.out.println("A Ferrari compartilhou a seguinte informção... " + rival.nossaHistoria);
		System.out.println(rival.pilotosFerrari);

//		AlphaRomeo rival2 = new AlphaRomeo();
//		System.out.println(rival2.passadoDaEquipe);
	}
}
