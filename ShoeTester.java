class ShoeTester{
public static void main(String[] args){
	Shoe shoe=new Shoe(1000,"white");
	{
		shoe.size=Size.Seven;
		shoe.brand="Adidas";
		shoe.type=Type.Sports;
		shoe.displayDetails();
    shoe.changePrice();
	}
}
}