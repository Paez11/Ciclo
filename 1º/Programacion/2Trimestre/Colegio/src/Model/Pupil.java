package Model;

public class Pupil {
	
	private String name;
	private Double note;
	
	public Pupil(String name, Double note) {
		super();
		this.name = name;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return " \n Alumno --> \n\t"
				+ "(name: " + name + ", note: " + note + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		if(obj!=null){
			if(this == obj) {
				result=true;
			}else if(this.getClass()==obj.getClass()) {
				Pupil tmp=(Pupil)obj;
				if(this.name!=null && this.name.equals(tmp.name)) {
					result=true;
				}
			}
		}
		
		return result;
	}
	
	
}
