package oo.encapsulamento.equipe2;

import oo.encapsulamento.equipe1.AlfaRomeo;
import oo.encapsulamento.equipe1.Ferrari;

public class Mercedes extends AlfaRomeo {

	public String pilotosMercedes = "Piloto 1: Lewis Hamilton Piloto 2: George Russell ";
	private String segredoDaEquipe = "Fizeram uma repaginada no motor para liderar o campeonato novamente.";
	String novoPiloto = "Antigo piloto da Williams se torna o segundo piloto da equipe da Mercedes.";

	public static void main(String[] args) {
		Mercedes mercedes = new Mercedes();
		System.out.println("A mídia não pode saber que... " + mercedes.segredoDaEquipe);
		System.out.println("Compartilhamos moementos com a equipe rival: " + mercedes.passadoDaEquipe);

		System.out.println("\n");
		
		Ferrari rival = new Ferrari();
		System.out.println("A Ferrari disse que... " + rival.nossaHistoria);
		System.out.println(rival.pilotosFerrari);

		System.out.println("\n");
		
		Williams parceiraDeNegocios = new Williams();
		System.out.println("Temos parceria com a Williams: " + parceiraDeNegocios.compartilhamentoDoMotor);
		System.out.println(parceiraDeNegocios.pilotosWilliams);
	}
}
