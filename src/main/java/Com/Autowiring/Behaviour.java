package Com.Autowiring;

public class Behaviour {
	
	public String walk;

	public String getWalk() {
		return walk;
	}

	public void setWalk(String walk) {
		this.walk = walk;
	}
	
	 @Override
	 public String toString(){
		 return " animal can walk" + walk;
	 }

}
