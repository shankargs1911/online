class PersonTester{
	public static void main(String[] values){
		System.out.println("////////////----------1st person----------/////////////");
		Person person=new Person();
		//1st instances
		System.out.println(person.color);
		System.out.println(person.fragnance);
		System.out.println(person.size);
		System.out.println(person.name);
		
	String nm=person.name;
	int age=22;
	String color="wheat color";
	String name="Shankar";
	System.out.println(age);
	System.out.println(color);
	System.out.println(name);

			//2nd instances
			System.out.println("//////////----------2nd person------////////////////");
			Person person2=new Person();
			System.out.println(person2.color);
		    System.out.println(person2.fragnance);
		    System.out.println(person2.size);
		    System.out.println(person2.name);
			
	System.out.println("2nd person");
	new Person();
	int age1=20;
	String color1="wheat color";
	String name1="my girl friend";
	System.out.println(age1);
	System.out.println(color1);
	System.out.println(name1);
		}
}