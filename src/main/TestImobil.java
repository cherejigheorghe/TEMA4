package main;

public class TestImobil {

	public static void main(String[] args) {
		
		Imobil imobil1 = new Imobil();
		imobil1.setType("casa");
		imobil1.setLevels(1);
		imobil1.setPrice(56500.800);
		
		Imobil imobil2 = new Imobil();
		imobil2.setType("bloc");
		imobil2.setLevels(10);
		imobil2.setPrice(30000.500);
		
		Imobil imobil3 = new Imobil();
		imobil3.setType("vila");
		imobil3.setLevels(2);
		imobil3.setPrice(15000.200);
	}

}
