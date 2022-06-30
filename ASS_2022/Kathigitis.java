import java.util.ArrayList;

public class Kathigitis {

	private String Email;
	private ArrayList<Aitish> MyRequests = new ArrayList<>();

	public Kathigitis(String Email) {
		this.Email = Email;
	}
	
	public void AddRequestToMyList(Aitish aRequest) {
		MyRequests.add(aRequest);
	}
	
	public void PrintMyList() {
		for(int i = 0; i < MyRequests.size(); i++) {   
		    System.out.print(MyRequests.get(i).getRequestData()+" "+MyRequests.get(i).getDate()+" "+MyRequests.get(i).getProfessorID()+" "+MyRequests.get(i).getProtocolID()+" "+MyRequests.get(i).getCondition()+"\n");
		}  
	}

}