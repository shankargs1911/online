class BulbTester{
		public static void main(String[] values){
		System.out.println("////////////---------1st Bulb---------////////////");
		Bulb bulb=new Bulb();
		//1st instances
		System.out.println(bulb.color);
		System.out.println(bulb.size);
		System.out.println(bulb.name);
    
	String nm=bulb.name;
	int year=3;
	String color="wheat color";
	String name="Pilips";
	System.out.println(year);
	System.out.println(color);
	System.out.println(name);
	
	//2nd instances
			System.out.println("////////------------2nd bulb--------///////////");
			Bulb bulb2=new Bulb();
			System.out.println(bulb2.color);
		    System.out.println(bulb2.size);
		    System.out.println(bulb2.name);
	
	System.out.println("............2nd bulb............");
	new Bulb();
	int year2=2;
	String color1="red color";
	String name1="Polycarbonate";
	System.out.println(year2);
	System.out.println(color1);
	System.out.println(name1);
	}
}