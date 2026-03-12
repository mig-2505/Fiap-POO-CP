package br.com.fiapride.model;

public class Veiculo {
	private String individuo;
	private String placa;
	private double gasolina;
	
	public Veiculo(String individuo, String placa, int gasolina) {
		this.setIndividuo(individuo);
		this.setPl(placa);
		this.setGas(gasolina);
	}

	public String getIndividuo() {
		return individuo;
	}

	private void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public String getPlaca() {
		return pl;
	}

	private void setPlaca(String pl) {
		this.pl = pl;
	}

	public double getGasolina() {
		return gas;
	}

	private void setGasolina(double gas) {
		this.gas = gas;
	}
	
	public void adicionar(double v) {
		 this.gas = gas + v;
	}
		
	public void gasta(double v) {
		 this.gas = gas - v;
	}
	
}
