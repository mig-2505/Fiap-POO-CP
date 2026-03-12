package br.com.fiapride.model;

public class Veiculo {
	private String individuo;
	private String pl;
	private double gas;
	
	public Veiculo(String individuo, String pl, int gas) {
		this.setIndividuo(individuo);
		this.setPl(pl);
		this.setGas(gas);
	}

	public String getIndividuo() {
		return individuo;
	}

	private void setIndividuo(String individuo) {
		this.individuo = individuo;
	}

	public String getPl() {
		return pl;
	}

	private void setPl(String pl) {
		this.pl = pl;
	}

	public double getGas() {
		return gas;
	}

	private void setGas(double gas) {
		this.gas = gas;
	}
	
	public void adicionar(double v) {
		 this.gas = gas + v;
	}
		
	public void gasta(double v) {
		 this.gas = gas - v;
	}
	
}
