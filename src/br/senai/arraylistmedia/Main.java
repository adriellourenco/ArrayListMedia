package br.senai.arraylistmedia;

public class Main {
	
	public static void main(String[] args) {
		
		Media objMedia = new Media();
		
		objMedia.ReceberNotas();
		objMedia.exibirNotas();
		System.out.println("M�dia Final: " + objMedia.calcularMedia());
		
	}
	
}
