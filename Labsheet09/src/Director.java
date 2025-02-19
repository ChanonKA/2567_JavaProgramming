public class Director {
	private String name;
	private String email;
	private char gender;
	
	Director(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	Director (String name,String email){
		this.name=name;
		this.email=email;
	}
		
	public String getName() {
		return this.name;
		
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(Character.toLowerCase(gender)== 'f') return "Female" ;
		if(Character.toLowerCase(gender)== 'm') return "Male" ;
		return null;
		}
	public String toString() {
		return String.format("%s (%s,%s)",getName(),getEmail(),getGenderName());
		
	}




}