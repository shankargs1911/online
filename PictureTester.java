class PictureTester{
	public static void main(String[] arg){
		String[] photo={"kgf","kgf2","pushpa","bahubali","bahubali2"};
		String video=Picture.movie(photo);
		System.out.println(video);
		String[] webcam={"resident evil","johny english","final destination","wonder women","hollow man"};
		String cam=Picture.lastMovie(webcam);
		System.out.println(cam);
		
	}
}