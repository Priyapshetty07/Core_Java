class FishRunner{
	public static void main(String[] args){
		Fish fish = new Fish();
		fish.color = "orange";//reference
		fish.family = "Minnows And Carps";//reference
		System.out.println(" Fish name: " +fish.name);
		System.out.println(" Fish gender: " +fish.gender);
		System.out.println(" Fish color: " +fish.color);
		System.out.println(" Fish family: " +fish.family);
		System.out.println(" Fish weight: " +fish.weight);
   
	}
}