class LockerTester{
	public static void main(String[] args){
	Locker locker=new Locker();
	System.out.println("print all Lock");
	System.out.println(Locker.lock);
	System.out.println(locker.colour);
	System.out.println(locker.amount);
	System.out.println(locker.sides);
	System.out.println(locker.noOflock);
	
	Locker locker2=new Locker();
	System.out.println("print all Lock2");
	locker2.lock="Brand2";
	System.out.println(Locker.lock);
	System.out.println(locker2.lock);
	locker.colour="Silver";
	System.out.println(locker2.colour);
	locker.amount=150;
	System.out.println(locker2.amount);
	locker.sides=2;
	System.out.println(locker2.sides);
	locker.noOflock=1000;
	System.out.println(locker2.noOflock);
	}
}