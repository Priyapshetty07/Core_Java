class HeadsetStarter{

	public static void main (String...args){
	
		String com = "OnePlus";
		int amt = 1000;
		new Headset(com,amt);
		
		boolean sound = true;
		boolean voice = true;
		new Headset(sound,voice);
		
		new Headset();
		
		String nam = "Boat";
		new Headset(nam);
		
		boolean vol = true;
		new Headset(vol);
		
		String wire = "wireless bluetooth";
		boolean but = true;
		new Headset(wire,but);
		
		int cor = 2;
		int doll = 50;
		new Headset(cor,doll);
		
		String ipo = "apple";
		String wir = "3.5mm";
		new Headset(ipo,wir);
		
		int len = 3;
		new Headset(len);
		
		float free = 22.0f;
		new Headset(free);
		
	}



}