class TrainRunner{
	public static void main(String...values){
	
	Train train = new Train();
		train.coach = "A1 to S4"; //reference
		train.numberOfBogie =20; //reference
		System.out.println("Train name: " +train.name);
		System.out.println("Train trainNumber: " +train.trainNumber);
		System.out.println("Train color: " +train.color);
		System.out.println("Train coach: " +train.coach);
		System.out.println("Train numberOfBogie: " +train.numberOfBogie);
   
	}
}