package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{


	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(this.checkUser(user)) {
			return true;
		}
		return false;
	}

	
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if((user.getAge()>=18 && user.getAge() <= 35)&&(user.getHeight()>=155 && user.getHeight()<=170)&&(user.getWeight()>=55 && user.getWeight()<=90)&& user.getCountry().equals("ProGrad")) {
			return true;
		}
		return false;
	}


	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int point = Integer.parseInt(points);
		if(point>80) {
			return true;
		}
		return false;
	}
	
}







