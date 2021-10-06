class PlantRunner{
  public static void main(String[] args)
  {
    //Plant.grow();
	String name="Neem";
	Plant.grow(name);//arugments is ref passed during invocation 
	
	// 2 ways to pass the arugments->VALUE or REF
	
	int lit=1; //ref->arugments
	Plant.watering(lit);
	
	//or 
	Plant.watering(3);//value->arugments
  }
}