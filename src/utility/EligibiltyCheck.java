package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface
{

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		
		
		return checkUser(user);
		
	}

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		
		if((user.getAge()>=18 &&user.getAge()<=35) && (user.getHeight()>=155 && user.getHeight()<=170) &&(user.getWeight()>=55 && user.getWeight()<=90)
				&&(user.getCountry().contentEquals("ProGrad")))
		{
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int p= Integer.parseInt(points);
		if(p>60)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
}







