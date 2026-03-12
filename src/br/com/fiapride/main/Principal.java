package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Carlos", "ABC-1234", -10);
		v1.adicionar(50);
		v1.gasta(100);
		v1.adicionar(200);
		v1.gasta(180);
		System.out.println("Dono: " + v1.getIndividuo() + " | Placa: " + v1.getPl() + " | Gasolina: " + v1.getGas());
		
		Veiculo v2 = new Veiculo("João", "DEG-5678", 100);
		v2.adicionar(50);
		v2.gasta(130);
		System.out.println("Dono: " + v2.getIndividuo() + " | Placa: " + v2.getPl() + " | Gasolina: " + v2.getGas());
	}	
}
