class Lighter{
    
	public static boolean on(){
		System.out.println("invoked on");
		return true;
	}
	public static boolean off(){
		System.out.println("invoked off");
		return false;
	}
	public static boolean light(int width){
		if(width>0){
			return true;
		}
		else{
			return false;
		}
	}
}