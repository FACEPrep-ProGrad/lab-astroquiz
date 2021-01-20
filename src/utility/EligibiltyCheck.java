package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user)==true) {return true;}
		else {return false;}
	}

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		boolean result=true;
		if(user.getAge()>=18 && user.getAge()<=35 && result==true) 
		{
			result=true;
			System.out.println("age"+result);
		}
		else 
		{
			result=false;System.out.println("age"+result);
		}
		
		if(user.getHeight()>=155 && user.getHeight()<=170 && result==true) 
		{
			result=true;System.out.println("height"+result);
		}
		else 
		{
			result=false;System.out.println("height"+result);
		}
		
		if(user.getWeight()>=55 && user.getWeight()<=90 && result==true) 
		{
			result=true;System.out.println("we"+result);
		}
		else 
		{
			result=false;System.out.println("we"+result);
		}
		
		String country=user.getCountry();
		if(country.equals("ProGrad")==true && result==true) 
		{
			result=true;System.out.println("count"+result);
		}
		else 
		{
			result=false;System.out.println("count"+result);
		}
		
		return result;
		
		
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		boolean result=true;
		int point=Integer.parseInt(points);
		if(point>=80) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}
	
}










