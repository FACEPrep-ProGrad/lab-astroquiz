package utility;

import model.User;

/*
Create a class called EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface
Implement the method basicEligibilityCheck (User user)
The basicEligibilityCheck method should in turn invoke checkUser(User user)
Return true if the candidate is eligible for space journey, return false otherwise.
 */

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		if( 18<= user.getAge() && user.getAge() <=35) {
			if(155 <=user.getHeight() && user.getHeight()<=170 ) {
				if(55<= user.getWeight()&&user.getWeight() <= 90) {
					if(user.getCountry() == "ProGrad")
						return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean checkQuizAnswer(int points) {
		if(points>80)
			return true;
		return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
			if(checkUser(user))
				return true;
			return false;
	}
	
}