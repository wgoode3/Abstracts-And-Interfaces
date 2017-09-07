public class Test{
	public static void main(String[] args){
		Pet raphael = new Turtle("Raphael");
		raphael.makeNoise("turtle turtle...");
		System.out.println(raphael.age);

		SingleCelledOrganism blobby = new Saccharomyces("Blobby");
		blobby.cellularMitosis();

		Snake hissy = new Snake(4, "Python", "Hissy");
		hissy.layEggs();
		hissy.bite("Java");
	}
}