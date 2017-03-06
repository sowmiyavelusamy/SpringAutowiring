package Com.Autowiring;

public class Elephant {

	
     private String elephantName;
     private Color color;
     private Behaviour behaviour;
	public String getElephantName() {
		return elephantName;
	}
	public void setElephantName(String elephantName) {
		this.elephantName = elephantName;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Behaviour getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(Behaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	public String toString(){
		return "Elephant info:" + behaviour.toString() + " " + color.toString();
	}
}
