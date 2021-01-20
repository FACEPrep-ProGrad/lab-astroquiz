package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface
{

	
	public boolean checkUser(User user) {
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		if((age>=18 && age<=35) && (height>=155 && height<=150) && (weight>=55 && weight<=90 ) && country.equals("ProGrad"))
	    return true;
		return false;
	}

	
	public boolean checkQuizAnswer(String points) {
		int score=Integer.parseInt(points);
		if(score>80)
			return true;
		return false;
	}

	
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user))
			return true;
		return false;
		
	}
}








