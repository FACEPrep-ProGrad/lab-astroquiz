package utility;

import model.User;
//class called EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface
public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		//person is eligible if his (18 <= age <= 35, (155 <=height<=170 ) , (55<= weight <= 90) and Country == ProGrad.
		if((18<= user.getAge() && user.getAge() <=35) && (155 <= user.getHeight() && user.getHeight()<=170) && (55<= user.getWeight() && user.getWeight()<=90) && (user.getCountry().equals("ProGrad"))){
			return true;
		}
		else
			return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		//candidate clears the test only if he scores more than 80
		int score = Integer.parseInt(points);
		if(score > 80) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		
		if(checkUser(user)) {
			return true;
		}
		else
			return false;
	}
	
}





