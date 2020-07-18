package utility;
import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface {

	public boolean checkQuizAnswer(String points) {
		if (Integer.parseInt(points) > 80) {
			return true;
		} else
			return false;
	}

	public boolean checkUser(User user) {
		if ((user.getAge() >= 18 && user.getAge() <= 35) && (user.getHeight() >= 155 && user.getHeight() <= 170)
				&& (user.getWeight() >= 55 && user.getWeight() <= 90)
				&& (user.getCountry().equalsIgnoreCase("ProGrad"))) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if (checkUser(user)) {
			return true;
		} else
			return false;

	}

}