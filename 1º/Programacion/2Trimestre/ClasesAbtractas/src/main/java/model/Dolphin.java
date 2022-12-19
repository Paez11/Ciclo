package model;

public class Dolphin extends Animal{

	private int fins;
	
	public Dolphin(String diet, boolean isMale, boolean isMammal, int fins) {
		super(diet, isMale, isMammal);
		this.fins=fins;
	}
	
	public Dolphin() {
		this("",false,false,-1);
	}
	
	
	
	

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	@Override
	public String getPlanningFood() {
		// TODO Auto-generated method stub
		return "2 kg de pescado cada dos semanas";
	}

}
