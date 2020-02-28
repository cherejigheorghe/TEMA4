package main;

public class Imobil {
	public String tipCasa;
	public int numarEtaje;
	public double pretImobil;
	
	
	public Imobil(String tipCasa, int numarEtaje, double pretImobil) {
		this.tipCasa = tipCasa;
		this.numarEtaje = numarEtaje;
		this.pretImobil = pretImobil;
	}
	public String getType(){	
		return tipCasa;
	}
	public void setType(String tip){
		this.tipCasa = tip;
	}
	public int getLevels(){	
		return numarEtaje;
	}
	public void setLevels(int etaje){
		this.numarEtaje = etaje;
	}
	public double getPrice() {
		return pretImobil;
	}
	public void setPrice(double pret){
		this.pretImobil = pret;
	}
}
