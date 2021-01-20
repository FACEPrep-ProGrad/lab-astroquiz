package utility;

import model.User;

public class EligibiltyCheck  extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		if(user.getAge()== 0) {
			System.out.println("Invalid Age");
			return false;
		}
		if(user.getHeight()== 0) {
			System.out.println("Invalid Height");
			return false;
		}
		if(user.getWeight()== 0) {
			System.out.println("Invalid Weight");
			return false;
		}
		if(user.getCountry()== null) {
			System.out.println("Invalid Country");
			return false;
		}
			
		if ((user.getAge() >= 18 && user.getAge() <= 35) && (user.getHeight() >= 155 && user.getHeight() <= 170) && (user.getWeight() >= 55 && user.getWeight() <= 90) && user.getCountry().equals("ProGrad"))
			return true;
		return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		if (Integer.parseInt(points) > 80)
			return true;
		return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		if (checkUser(user))
			return true;
		return false;
	}
	
}







