class MachineTester{
	public static void main(String[] args){
		WashingMachine machine=new WashingMachine("IFB",30,30000d);{
			machine.type=WashingMachineType.TOP_LOAD;
			machine.color=Color.GREEN;
			System.out.println(machine.brand);
			System.out.println(machine.liters+" LITERS");
			System.out.println(machine.price);
			System.out.println(machine.type);
			System.out.println(machine.color);
		}
		
	}
}