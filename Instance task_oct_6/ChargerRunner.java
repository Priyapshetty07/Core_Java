class ChargerRunner{
	public static void main(String[] args){
		Charger charger = new Charger();
		charger.color = "white"; //reference
		charger.price = 1500.00; //reference
		System.out.println(" Charger brand: " + charger.brand); //literals
		System.out.println(" Charger capacity:" +charger.capacity); //literals
		System.out.println(" Charger color:" +charger.color); //reference
		System.out.println(" Charger price:" +charger.price); //reference
		System.out.println(" Charger noOfPorts:" +charger.noOfPorts); //default
	}
}