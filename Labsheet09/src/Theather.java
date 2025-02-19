public class Theather extends Movie {
	
	private int theaterNo;
	
	Theather(String id,String name,Director director, int theaterNo){
		super(id,name,director);
		this.theaterNo=theaterNo;
	}
	Theather (){
		this.theaterNo=0;
	}
	String getTheaterName() {
		if(theaterNo==15)return "Premium Theater";
		if((theaterNo>=12) && (theaterNo<=14))return "Sweet Theater";
		if((theaterNo>=1)&&(theaterNo<=11))return "Basic Theater";
		return null;
	}
	public String toString() {
		return String.format("%s %s",this.getTheaterName(), super.toString());
	}

}