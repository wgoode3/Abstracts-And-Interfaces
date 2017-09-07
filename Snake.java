public class Snake extends Reptile implements Pet{
	private String species;
	private String name;
	public Snake(int age, String species, String name){
		super(age);
		this.species = species;
		this.name = name;
	}
	public void makeNoise(String noise){
		System.out.println(noise);
	}
	public void bite(String name){
		System.out.println(this.name + " bites " + name);
	}
}