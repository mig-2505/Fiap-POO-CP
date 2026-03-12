package br.com.fiapride.model;

public class Veiculo {
	private String individuo;
	private String placa;
	private double gasolina;
	
	public Veiculo(String individuo, String placa, int gasolina) {
		this.setIndividuo(individuo);
		this.setPlaca(placa);
		this.setGasolina(gasolina);
	}

	public String getIndividuo() {
		return individuo;
	}

	private void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public String getPlaca() {
		return placa;
	}

	private void setPlaca(String pl) {
		this.placa = pl;
	}

	public double getGasolina() {
		return gasolina;
	}

	private void setGasolina(double gas) {
		this.gasolina = gas;
	}
	
	public void adicionar(double v) {
		 this.gasolina = gasolina + v;
	}
		
	public void gasta(double v) {
		 this.gasolina = gasolina - v;
	}
	
}
