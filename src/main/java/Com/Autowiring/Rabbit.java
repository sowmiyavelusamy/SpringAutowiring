package Com.Autowiring;

public class Rabbit {
	
	private String rabName;
	public String getRabName() {
		return rabName;
	}

	public void setRabName(String rabName) {
		this.rabName = rabName;
	}

	private Color color;
	
	public Rabbit(Color color1){
		this.color=color1;
	}
	
	public String toString(){
		return "Rabbit name:" + rabName + "  " + color.getBaseColor(); 
	}

}
