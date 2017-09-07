public class Turtle implements Pet{
	private String name;
	public Turtle(String name){
		this.name = name;
	}
	@Override
	public void makeNoise(String noise){
		System.out.println(noise);
	}
}