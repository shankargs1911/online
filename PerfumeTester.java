class PerfumeTester{
	public static void main(String[] args){
	Perfume perfume=new Perfume();
	System.out.println("print all Perfume");
	System.out.println(Perfume.fume);
	System.out.println(perfume.colour);
	System.out.println(perfume.amount);
	System.out.println(perfume.sides);
	System.out.println(perfume.noOffume);
	
	Perfume perfume2=new Perfume();
	System.out.println("print all perfume2");
	perfume2.fume="Perfume";
	System.out.println(Perfume.fume);
	System.out.println(perfume2.fume);
	perfume.colour="black";
	System.out.println(perfume2.colour);
	perfume.amount=350;
	System.out.println(perfume2.amount);
	perfume.sides=2;
	System.out.println(perfume2.sides);
	perfume.noOffume=400;
	System.out.println(perfume2.noOffume);
	}
}