package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	
	public boolean basicEligibilityCheck(User user) {
	return checkUser(user);
		// TODO Auto-generated method stub
	}


@Override
public boolean checkUser(User user) {
	if((18 <= user.getAge() && user.getAge() <= 35) && (155 <=user.getHeight() && user.getHeight()<=170 ) && (55<= user.getWeight() && user.getWeight() <= 90) && user.getCountry() == "ProGrad") {
		
		System.out.println("Name : "+user.getName());
		System.out.println("Age : "+user.getAge());
		System.out.println("Height : "+user.getHeight());
		System.out.println("Weight : "+user.getWeight());
		System.out.println("Country : "+user.getCountry());
		return true;
}
	return false;
}
@Override
public boolean checkQuizAnswer(String points) {
	// TODO Auto-generated method stub
	int point =Integer.parseInt(points);
	if(point>80)
		return true;
	return false;
}}





