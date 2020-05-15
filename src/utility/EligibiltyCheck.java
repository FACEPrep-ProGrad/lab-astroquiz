package utility;

import model.User;

public class  EligibiltyCheck  extends BasicEligibility  implements EligibilityInterface
{

	@Override
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user)&&checkQuizAnswer("points"))
			return true;
		else
		   return false;

	
	}

	@Override
	public boolean checkUser(User user) {
		
		int age=user.getAge();
		int height=user.getHeight();
		int weight=user.getWeight();
		String country=user.getCountry();
		
		if((18<=age && age<=35)&&(155 <= height && height<=170)&&(55<=weight&&weight<=90)&&(country.equals("ProGrad")))
			return true;
			else
			return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
int num = Integer.parseInt(points);
		
		if(num>80) 
			return true;
		else
		
		   return false;
		}
}