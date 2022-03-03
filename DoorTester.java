class DoorTester{
		public static void main(String[] values){
		System.out.println("////////////----------1st door------------//////////////");
		Door door=new Door();
		//1st instances
		System.out.println(door.color);
		System.out.println(door.size);
		System.out.println(door.name);
	
	String nm=door.name;
	int size=6;
	String color="wheat color";
	String name="Plain door";
	System.out.println(size);
	System.out.println(color);
	System.out.println(name);
			
			//2nd instances
			System.out.println("///////////-----------2nd Door----------////////////");
			Door door2=new Door();
			System.out.println(door2.color);
		    System.out.println(door2.size);
		    System.out.println(door2.name);
			
	System.out.println("...............2nd door...........");
	new Door();
	int size1=10;
	String color1="green color";
	String name1=" design door";
	System.out.println(size1);
	System.out.println(color1);
	System.out.println(name1);
		}
  }