class RingTester{
	public static void main(String[] arg){
		System.out.println("///////--------1st Ring--------////////");
		Ring ring=new Ring();
		//1st instances
		System.out.println(ring.color);
		System.out.println(ring.size);
		System.out.println(ring.name);
	
		String fl=ring.name;
	    int num=2;
     	String color="Gold color";
	    String name="ring";
	    System.out.println(num);
	    System.out.println(color);
	    System.out.println(name);
		
		
			
			//2nd instances
			System.out.println("/////////////---------------2nd Ring--------------///////////");
			Ring ring2=new Ring();
			System.out.println(ring2.color);
		    System.out.println(ring2.size);
		    System.out.println(ring2.name);
			
			System.out.println(".....2nd Ring......");
	new Ring();
	int num1=1;
	String color1="silver color";
	String name1="my ring";
	System.out.println(num1);
	System.out.println(color1);
	System.out.println(name1);
	
	}
}