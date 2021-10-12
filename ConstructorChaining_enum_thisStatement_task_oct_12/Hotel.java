class Hotel{
	String name;
	HotelItems items = HotelItems.POORI; 
	double price;
	String location;
	long contact;
	
    Hotel(String name,double price)
	{
		this();
        System.out.println("invoked String name,double price");
	    
		this.name=name;
		System.out.println("name of hotel: " +name);
	    
		this.price=price;
		System.out.println("price of food items: " +price);
	}
	
	Hotel()
	{
		System.out.println("invoked no-arg constructor of Hotel");
	}
	
	
	Hotel(String name)
	{
		this.name=name;
		System.out.println("invoked string name constructor of Hotel : " + name);
	}
	
	Hotel(double price)
	{
		this.price=price;
        System.out.println("invoked double price constructor of Hotel : " + price);
	}
	
	Hotel(String location,long contact,HotelItems items)
	{
		//this.location="Udupi";
		//this.contact=987456315l;
		//this.items=items;
		//items=HotelItems.CHAPATHI;
        System.out.println("invoked three constructor chaining of Hotel : " + location );
	    System.out.println("invoked three constructor chaining  of Hotel : " + contact);
	    System.out.println("invoked three constructorchaining  of Hotel : " + items);
	}
	
	Hotel(HotelItems items)
	{
		this("Udupi",987456315l,HotelItems.CHAPATHI);
		System.out.println(" invoked enum : " + items);
	}
}