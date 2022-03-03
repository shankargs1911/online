class HeadSetTester{
	public static void main(String[] args){
		HeadSet headSet=new HeadSet("Low Volume");{
			headSet.brand="Boat";
			headSet.price=2000;
			headSet.color="Black";
			headSet.type=HeadSetType.Wire_less;
			headSet.displayDetails();
			headSet.changeVolume();
		}
	}
}