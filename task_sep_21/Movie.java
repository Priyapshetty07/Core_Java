class Movie{
	public static void entertain(String movieName,double ticketPrice,float movieLength,double MovieRating,String actors[])
	{
		System.out.println("invoked Movie");
		System.out.println("Name of movie :"+movieName);
	    System.out.println("Price of ticket is :"+ticketPrice);
	    System.out.println("Duration of movie :"+movieLength);
	    System.out.println("Rating :"+MovieRating);
		
		for(int actorName=0;actorName<actors.length;)
		{                                             
		  String actor=actors[actorName];
	      System.out.println("Actors :"+actor);
		  actorName++;
		}
	}
	
}