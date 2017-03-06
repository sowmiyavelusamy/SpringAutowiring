package Com.Autowiring;

public class Dog {
	
	private String dogName;
	private Color color;
	private Behaviour behaviour;
	
	public Behaviour getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String toString(){
		 return "The "+  dogName + " has "+ color.toString()  + "dog" + behaviour.toString();
	 }

}
