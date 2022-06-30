import java.util.ArrayList;

public class Grammateia {

	private String Email;
	private ArrayList<Aitish> MyRequests = new ArrayList<>();


	public Grammateia(String Email) {
		this.Email = Email;
	}
	
	public void AddRequestToMyList(Aitish aRequest) {
		MyRequests.add(aRequest);
	}
	
	public void UpdateRequest(Aitish aRequest,String condition) {
		aRequest.setCondition(condition);
	}
}