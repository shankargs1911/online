/*Song — name,length,type:enum,singerName,lang,writer
about();updateName(),updateName(name),updateLength(),updateLength(length),update..,
update(name,length,type,singerName,lang,writer);

*/


class Song{
String name;
double length;
SongType type;
String singerName;
String lang;
String writer;

void about(){
System.out.println("Song Name - "+name);
System.out.println("Length of Song - "+length+"min");
System.out.println("Song Type - "+type);
System.out.println("Singer Name -"+singerName);
System.out.println("Song Writer - "+writer);
System.out.println("Language of the Song - "+lang);
}


void upDateName(){
System.out.println("Name before update - "+name);
name="Shiva Tandav Strotram";
System.out.println("Name after update - "+name);
}
void upDateName(String name){
	this.name=name;
	System.out.println("Name before update - "+name);
name="Mugaru Male";
System.out.println("Name after update - "+name);
}
void upDateLength(){
	System.out.println("Length of Song before update - "+length+"min");
length=06.00;
	System.out.println("Length of Song after update - "+length+"min");
}

void updateLength(double length){
	this.length=length;
	System.out.println("Length before update - "+length+"min");
	length=07.00;
		System.out.println("Length of Song after update - "+length+"min");
}

void upDateSongType(){
	
	System.out.println("Song Type before "+type);
type=SongType.ROMANTIC;
	System.out.println("Song after update type "+type);
}
void upDateSingerName(){
		System.out.println("Singer Name - "+singerName);
singerName="Sonu Nigam";
System.out.println("After upDate singer Name - "+singerName);
}

void upDateSingerName(String singer)
{
this.singerName=singerName;
System.out.println("Singer Name - "+singerName);
singerName="Shankar Mahadevan";
System.out.println("Singer Name UpDated - "+singerName);
}
void upDatelang(){
System.out.println("Language  - "+lang);
	lang="kannada";
	System.out.println("Updated Language - "+lang);
}
void upDatelang(String name){
System.out.println("Language  - "+lang);
this.lang="Hindi";
	System.out.println("Updated Language - "+lang);
}

void upDateWriter(){
	System.out.println("Writer   - "+writer);
writer="Yograj Bhat";
System.out.println("UpDated Language  -"+lang);
}
void upDateWriter(String writer){
		System.out.println("Writer  - "+writer);
writer="Jayant Kaykini";
System.out.println("UpDated Language  - "+lang);
}
void updateAll(String name,double length,SongType type,String singerName,String lang,String writer){
System.out.println("Song Name - "+name);
System.out.println("Length of Song - "+length+"min");
System.out.println("Song Type - "+type);
System.out.println("Singer Name -"+singerName);
System.out.println("Song Writer - "+writer);
System.out.println("Language of the Song - "+lang);
}
}