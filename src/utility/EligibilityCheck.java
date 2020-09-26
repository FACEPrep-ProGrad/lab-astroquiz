package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		int age = user.getAge();
		int height = user.getHeight();
		int weight = user.getWeight();
		String Country = user.getCountry();
		
		if ((age >= 18 && age<=35)&&(height>=155 && height <=170)) {
			
				if((weight>= 55 && weight <=90) && Country.equals("ProGrad")) {
					
					return true;
				}
				else {
					return false;
				}
			}
				else {
					return false;
				}
			}

	@Override
	public boolean checkQuizAnswer(String points) {
		System.out.println(points);
		if(Integer.parseInt(points) >= 80) {
			System.out.println(points);
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		
		boolean isEligible = checkUser(user);
		
		if(isEligible) {
			return true;
		}
		else {
			return false;
		}
		

	}
	
	
}
