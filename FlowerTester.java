class FlowerTester{
		public static void main(String[] args){
		System.out.println("/////////////--------------1st flower---------/////////////////");
		Flower flower=new Flower();
		//1st instances
		System.out.println(flower.color);
		System.out.println(flower.size);
		System.out.println(flower.name);
		
		String fl=flower.name;
	int month=2;
	String color="red color";
	String name="rose";
	System.out.println(month);
	System.out.println(color);
	System.out.println(name);
	
			
			//2nd instances
			System.out.println("/////////////---------------2nd flower--------------///////////");
			Flower flower2=new Flower();
			System.out.println(flower2.color);
		    System.out.println(flower2.size);
		    System.out.println(flower2.name);
			
	System.out.println(".....2nd Flower......");
	new Flower();
	int month1=1;
	String color1="white color";
	String name1="white rose";
	System.out.println(month1);
	System.out.println(color1);
	System.out.println(name1);
		}
}