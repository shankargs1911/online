class BoardTester{
	public static void main(String[] values){
		KeyBoard board=new KeyBoard("Logitech",104,10,true);
		System.out.println(board.brand);
		System.out.println(board.noOfKeys);
		System.out.println(board.lifeSpan);
		System.out.println(board.working);
	}

}