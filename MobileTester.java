class MobileTester{
	public static void main(String[] args){
	Mobile mobile=new Mobile();
	System.out.println("print all the states of Mobile");
	System.out.println(Mobile.brand);
	System.out.println(mobile.brand);
	System.out.println(mobile.price);
	System.out.println(mobile.colour);
	System.out.println(mobile.noOfMobail);
	System.out.println(mobile.working);
	
	Mobile mobile2=new Mobile();
	System.out.println("print all the states of Mobile2");
	mobile2.brand="Intex";
	System.out.println(Mobile.brand);
	System.out.println(mobile2.brand);
	mobile.price=10000f;
	System.out.println(mobile2.price);
	mobile.colour="Black";
	System.out.println(mobile2.colour);
	mobile.noOfMobail=5;
	System.out.println(mobile2.noOfMobail);
	mobile.working=true;
	System.out.println(mobile2.working);
	}
}