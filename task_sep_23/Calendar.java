class Calendar{
	public static int getBirthMonth(String personName){
        
		if(personName=="Priya"){
			return 10;
		}
		else if(personName=="Diya"){
			return 1;
		}
		else if(personName=="Evaa"){
			return 8;
		}
		else if(personName=="Aravi"){
			return 2;
		}
		
		else{
			return 5;
		}
		
	}
	
	public static String getBirthDay(String personName){
	    if(personName=="Priya"){
			return "Wendnesday";	
	    }
	    
		else if(personName=="Diya"){
			return "Tuesday";
		}
		
		else if(personName=="Evaa"){
			return "Friday";
		}
		
		else if(personName=="Aravi"){
			return "Monday";
		}
		
		else{
			return "Sunday";
		}
    }
}