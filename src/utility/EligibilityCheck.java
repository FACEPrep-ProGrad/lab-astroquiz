package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		return checkUser(user);
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(user.getAge() >=18 && user.getAge() <=35
				   && user.getHeight() >=155 && user.getHeight() <=170
				   && user.getWeight() >=55 && user.getWeight() <= 90
				   && user.getCountry().contentEquals("ProGrad")) {
					
					return true;
				}
		return false;
	}
	@Override
	 public boolean checkQuizAnswer (String points) {
		if(Integer.parseInt(points)>80) {
			return true;
		}return false;
	}
	
	
	
}