class Manager{
  public static void meeting(){
     System.out.println("Schedules meeting with client and team");
  }
  public static void monitor(){
    System.out.println("Monitoring the team and plan");
	organizing();
  }
  public static void planning(){
    System.out.println("Manager plans schedule for completing the project in time");
	Developer.run();
  }
  public static void organizing(){
    System.out.println("organizing the team based in requriment of project");
	Developer.testing();
  }
  public static void decidesalary(){
    System.out.println("Manager decides salary depending on performance of developer");
  }
  
}