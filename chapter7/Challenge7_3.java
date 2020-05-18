//class used for credit card validation
import java.util.ArrayList;
public class Challenge7_3{
	private ArrayList<Integer> accounts;

	public Challenge7_3(ArrayList<Integer> accounts){
		this.accounts = accounts;
	}//end constructor
	
	public boolean validate(int account){
		boolean found = false;
		
		for(int acct: accounts){
			if(acct == account){
				found = true;
			}
		}//end for
		
		return found;
	}
}//end class