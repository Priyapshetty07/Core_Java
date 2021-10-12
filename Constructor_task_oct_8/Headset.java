class Headset{
	String brand;
	int price;
	String type;
	boolean noiseCancellation;
	boolean mic;
	int length;
	float hz ;
	
	Headset(String bran,int amount){
		System.out.println("invoked headset string & int constructor");
	
		System.out.println("the brand is:"+bran);
		System.out.println("the price is:"+amount);
		brand = bran;
		price= amount;
    }

	Headset(boolean noise,boolean mi){
		
		System.out.println("Invoked headset of boolean constructor");
		System.out.println("the noise"+noise);
		System.out.println("MIC:"+mi);
	}

	Headset(){
	   System.out.println("Default constructor");
	}
	
	Headset(String name){
		System.out.println("the brand of headset is :"+name);
		brand = name;
	}
	
	Headset (boolean volume){
		System.out.println("the volume is high or low:"+volume);
		noiseCancellation = volume;
	}
	
	Headset (String wireless,boolean button){
		System.out.println("the wirless is :"+wireless);
		System.out.println("the wirless is :"+button);
		type= wireless;
		mic = button;
	}
	
	Headset(int cord,int dollar){
		System.out.println("the cord length is :"+cord);
		System.out.println("the price of earphone:"+dollar);
		length = cord;
		price = dollar;
		}
	
	Headset (String ipod,String wired){
		System.out.println("the ipod name is :"+ipod);
		System.out.println("the wired jack is :"+wired);
		brand = ipod;
		type= wired;
	}
	
	Headset (int cordLength){
		System.out.println("the cordLength is :"+cordLength);
		length = cordLength;
	}
	
	Headset(float frequncy){
		System.out.println("the frequncy range is :"+frequncy);
		hz = frequncy;
	}
	
}