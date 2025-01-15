
public class student {
	//private two attribute
	private String name;
	private double[] scores;
	
	//method to set student detail
	public void setStudentDetail(String stdName,double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	//method to calculate average score
	public double calculateAverageScore() {
		double total = 0;
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
			
		
		}
		return total/scores.length; //return average of scores
		
	}
	//method to get grade based on average score
	public String getGrade() {
		double average = calculateAverageScore();
		if(average>= 90) {
			return "A";			
		}else if (average>= 80) {
			return "B";
		}else if(average>= 70) {
			return "C";
		}else if(average>= 60) {
			return "D";
		}else {
			return "F";
		}
	}//end of method
	public void displayStudentDetail() {
		System.out.println("Name: "+name);
		System.out.println("Scores: ");
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
			
		}
		System.out.println("\nAverage Score: "+calculateAverageScore());
		System.out.println("Grode:: "+getGrade());
		
		
		
	}

}
