package oo.encapsulamento.equipe1;

public class AlfaRomeo {

	protected String passadoDaEquipe = "Utiliza motor ferrari e o piloto mais experiente era da Mercedes.";
	public String pilotosAlfa = "Piloto 1: Valtteri Bottas Piloto 2: Guanyu Zhou ";

	public static void main(String[] args) {
		Ferrari parceiraNegocio = new Ferrari();
		System.out.println(parceiraNegocio.nossaHistoria);
		System.out.println(parceiraNegocio.pilotosFerrari);
	}
}
