public abstract class Reptile {
	private int age;
	public Reptile(int age){
		this.age = age;
	}
	public void layEggs(){
		System.out.println("The reptile is laying eggs");
	}
	public abstract void bite(String name);
}