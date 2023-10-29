/**
 * 
 */
package devpack;

/**
 * @author kunal
 * 
 */
public class VotingNotAllowedException extends Exception {
	
	public VotingNotAllowedException(){
		super("Under 18 - Voting Not Allowed");
	}
}

