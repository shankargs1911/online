class SongTester{
public static void main(String[] args){
	Song song=new Song();
	song.name="Bhgavdgita";
	song.length=06.5;
	song.type=SongType.DEVOTIONAL;
	song.singerName="Vijay Prakash";
	song.lang="Sanskrit";
	song.writer="Krishna";
		song.about();
		song.upDateName();
				song.upDateName("hu antava huhu antava");
		song.upDateLength();
		song.updateLength(08.00);
		song.upDateSingerName();
		song.upDateSingerName("Raghu Dixit");
		song.upDatelang();
		song.upDatelang("hindi");
		song.upDateWriter();
		song.upDateWriter("Yogaraj Bhat");
		song.upDateSongType();
        song.updateAll("Chak de India",04.43,Mass,"Sukhavindar Sing","Hindi","Jaideep Sahini"){
		}
}//update(name,length,type,singerName,lang,writer);