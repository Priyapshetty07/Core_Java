class Monitor{
	String brand;
	int price;
	int inches;
	boolean lcd;
	int ratings;
	
	Monitor(String brand){
		System.out.println("the brand of monitor: " +brand);
		this.brand=brand;
	}

	Monitor(int price){
		System.out.println("The price of LG is: " +price);
		this.price=price;
	}
	
	Monitor (boolean lcd){
		System.out.println("the monitor is lcd:" +lcd);
		this.lcd=lcd;
	}
	
	Monitor(String brand,int ratings){
		System.out.println("the Ratings is:" +ratings);
		System.out.println("the brand is :" +brand);
		this.brand=brand;
		this.ratings=ratings;
	}
	
	Monitor(int inches,boolean lcd){
		System.out.println("the monitor size is :"+inches);
		System.out.println("the monitor lcd :" +lcd);
		this.inches=inches;
		this.lcd=lcd;
	}
}