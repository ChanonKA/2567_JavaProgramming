
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileAge;
	
	//Default Constructor
	Car(){
	/*	companyName="Unknow";
		modelName="Unknow";
		year = 2000;
		mileAge = 0.0; */
		this("Unknow","Unknow",2000,0.0);
	}
	
	//Parameterize Constructor
	Car(String companyName,String modelName,int year,double mileAge){
		this.companyName=companyName;
		this.modelName=modelName;
		//Default year create 2000 if input wrong
		this.year=year <=1886? 2000 : year;
		this.mileAge=mileAge;
	}
	
	//getters and setters method()
	public String getCompanyName() {
		return this.companyName;
		
	}
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}
		else {
			System.out.println("Error: Invalid company name!");
		}
	}
	public String setModelName() {
		return this.companyName;
	}
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}
		else {
			System.out.println("Error: Invalid model name!");
		}
	}
	public int getYear() {
		return this.getYear();
	}
	public void setYear(int year) {
		
		if(year<1886) {
			System.out.println("Error: Invalid year!");
		}
		else {
		
		this.year=year;
		}
	}
	public double getmileAge() {
		return this.mileAge=mileAge;
	}
	public String toString() {
		return "CompanyName: "+ this.companyName+ "\nModel Name: "+this.modelName+"\nYear: "+this.year;
	}

}

