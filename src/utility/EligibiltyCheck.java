package utility;

import model.User;


public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	
	public boolean checkUser(User user) {
		int age = user.getAge();
		int height = user.getHeight();
		int weight = user.getWeight();
		String country = user.getCountry();
		if ((age>=18 && age <= 35) && (height>=155 && height<=170) && (weight>=55 && weight<=90) && (country.equals("ProGrad")))
			return true;
		else 
			return false;
	}

	
	public boolean checkQuizAnswer(String points) {
		int pointsNo;
		pointsNo=Integer.parseInt(points);
		if(pointsNo >50)
			return true;
		else
			return false;
		
	}


	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user))
			return true;
		else
			return false;
		
	}
	
}
