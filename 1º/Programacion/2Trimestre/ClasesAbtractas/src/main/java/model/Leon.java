package model;

public class Leon extends Animal{

	private int legs;
	
	public Leon(String diet, boolean isMale, boolean isMammal, int legs) {
		super(diet, isMale, isMammal);
		this.legs=legs;
	}
	
	public Leon() {
		this("",false,false,-1);
	}
	
	
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String getPlanningFood() {
		// TODO Auto-generated method stub
		return "2 kg de carne cada dos semanas";
	}

}
