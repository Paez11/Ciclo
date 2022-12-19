package model;

public abstract class Animal {
	private String diet;
	private boolean isMale;
	private boolean isMammal;
	
	
	
	public Animal(String diet, boolean isMale, boolean isMammal) {
		this.diet = diet;
		this.isMale = isMale;
		this.isMammal = isMammal;
	}
	
	public Animal() {
		this("",false,false);
	}
	
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public boolean isMammal() {
		return isMammal;
	}
	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}
	
	//abstract methods
	public abstract String getPlanningFood();

	@Override
	public String toString() {
		return "Animal [diet=" + diet + ", isMale=" + isMale + ", isMammal=" + isMammal + "]";
	}
	
	
	
	
}
