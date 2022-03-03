class TractorTester{
		public static void main(String[] args){
		System.out.println("////////---------1st Tractor----------//////////");
		Tractor tractor=new Tractor();
		//1st instances
		System.out.println(tractor.color);
		System.out.println(tractor.fragnance);
		System.out.println(tractor.size);
		System.out.println(tractor.name);
		
		
				String nm=tractor.name;
				int num=1;
				String color="red color";
				String name="Mahindra";
				System.out.println(num);
				System.out.println(color);
				System.out.println(name);
		
		//2nd instances
			System.out.println("/////////---------2nd Tractor--------/////////");
			Tractor tractor2=new Tractor();
			System.out.println(tractor2.color);
		    System.out.println(tractor2.size);
		    System.out.println(tractor2.name);
			
							System.out.println(".................2nd Tractor...........");
							new Tractor();
							int num1=2;
							String color1="blue color";
							String name1="Captain";
							System.out.println(num1);
							System.out.println(color1);
							System.out.println(name1);
		}
}