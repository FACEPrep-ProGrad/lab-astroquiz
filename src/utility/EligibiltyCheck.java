package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user)==true) {
			return true;	
		}
		return false;
		
	}
	public boolean checkUser(User user) {
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		if((18<=age) &&(age<=35)&&(155<=height)&&(height<=170)&&(55<=weight)&&(weight<=90)&&(country.equals("ProGrad"))) {
			//System.out.println("You made it!!!");
			return true;
		}
		
		return false;
		
	}
	public boolean checkQuizAnswer(String points) {
		if(Integer.parseInt(points)>80) {
			return true;
		}
		return true;
		
	}

	
	
	
	
}






