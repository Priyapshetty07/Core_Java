class HotelRunner{
	public static void main(String...value){
	
      Hotel hotel = new	Hotel("kimmane",499.5);
		//String nm = hotel.name; //kimmane
		//System.out.println(nm);
		
		//double price= hotel.price; //499.5
		//System.out.println(price);
		
		HotelItems items = hotel.items; //POORI
		System.out.println(items);
		
		String loc = hotel.location; //null
		System.out.println("its print null value for location:" +loc);
		
		long cont = hotel.contact; //0
		System.out.println("its print zero value for contact:" +cont);
		
		//update the items 
		hotel.items = HotelItems.DOSA;
		items = hotel.items;
		System.out.println("update the Food items :" +items);
		
		hotel.contact=9876543210l;
		System.out.println("its remove the null value and print the contact number: " + hotel.contact);
		
		hotel.location="shimoga";
		System.out.println("its remove the zero value and print the location: " + hotel.location);
		
		Hotel hotel1 = new	Hotel("MoonLight");
		Hotel hotel2 = new	Hotel(999.5);
		Hotel hotel3 = new Hotel(HotelItems.DOSA);
		
		
    }
}