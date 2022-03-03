class CoinTester{
	public static void main(String[] args){
	Coin coin=new Coin();
	System.out.println("print all");
	System.out.println(Coin.shape);
	System.out.println(coin.shape);
	System.out.println(coin.colour);
	System.out.println(coin.amount);
	System.out.println(coin.sides);
	System.out.println(coin.sidename);
	
	Coin coin2=new Coin();
	System.out.println("print all2");
	coin2.shape="Intex";
	System.out.println(Coin.shape);
	System.out.println(coin2.shape);
	coin.colour="Silver";
	System.out.println(coin2.colour);
	coin.amount=1;
	System.out.println(coin2.amount);
	coin.sidename="Tail";
	System.out.println(coin2.sidename);
	}
}