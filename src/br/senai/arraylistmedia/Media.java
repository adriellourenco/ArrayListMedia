package br.senai.arraylistmedia;

import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	
	ArrayList<Double> arrNotas = new ArrayList<Double>();
	
	double soma;
	double media;
	
	public void exibirNotas() {
		
		for (int i = 0; i < arrNotas.size(); i++) {
			
			System.out.println("Nota: " + (i + 1) + " = " +arrNotas.get(i));
		}
		
	}
	
	public void ReceberNotas(){
		Scanner leitor = new Scanner(System.in);
					
		System.out.println("Quantas notas você deixa adicionar? - (Digite um número!)");
		int resposta;
		resposta = leitor.nextInt();
		
		int cont = 1;
		while (cont<=resposta) {
			
			System.out.println("Digite a " +cont + "º nota!");
			arrNotas.add(leitor.nextDouble());
			cont++;
			
		}
		
		leitor.close();
	}
	
	public double calcularMedia() {
	
		arrNotas.forEach(nota->{
			soma += nota;
		});
		
		media = soma / arrNotas.size();
		
		return media;
		
	}
	
	
}
