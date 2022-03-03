class BirdTester{
	public static void main(String[] fly){
		System.out.println("1st Bird");
		Bird bird=new Bird();
		//1st instances
		System.out.println(bird.color);
		System.out.println(bird.size);
		System.out.println(bird.name);
				
		String nm=bird.name;
	int year=1;
	String color="blue color";
	String name="Sparrow";
	bird.name=Bird;
	System.out.println(year);
	
	System.out.println(color);
	System.out.println(name);


				//2nd instances
			System.out.println("//////////----------2nd bird------////////////////");
			Bird bird2=new Bird();
			System.out.println(bird2.color);
		    System.out.println(bird2.size);
		    System.out.println(bird2.name);
			
	System.out.println("..............2nd Bird..........");
	new Bird();
	int year1=2;
	String color1="red color";
	String name1="parrot";
	System.out.println(year1);
	System.out.println(color1);
	System.out.println(name1);
	}
}