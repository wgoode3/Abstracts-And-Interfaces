public class Saccharomyces implements SingleCelledOrganism, Pet{
	private String name;
	public Saccharomyces(String name){
		this.name = name;
	}
	public void makeNoise(String noise){
		System.out.println(noise);
	}
	public void cellularMitosis(){
		System.out.println(this.name + " is mitosising!");
	}
}