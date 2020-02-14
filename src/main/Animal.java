package main;

public class Animal {
	
	public String tipAnimal;
	public String culoareAnimal;
	public int varstaAnimal;
	
	public String getType(){	
		return tipAnimal;
	}
	public void setType(String tip){
		this.tipAnimal = tip;
	}
	public String getColor(){	
		return culoareAnimal;
	}
	public void setColor(String culoare){
		this.culoareAnimal = culoare;
	}
	public int getAge() {
		return varstaAnimal;
	}
	public void setAge(int varsta){
		this.varstaAnimal = varsta;
	}
}
