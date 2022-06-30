import java.util.ArrayList;
import java.util.Random;



public class Aitish {


	private String Date;
	private String RequestData;
	private ArrayList<Aitish> AllRequests = new ArrayList<>();
	private String ProfessorID;
	private int ProtocolID;	
	private String Condition;
	private String Desicion;
	
	Random rand = new Random();

	
	public Aitish(String ReqeustData,String date,String ProfessorID) {
		this.RequestData = ReqeustData;
		this.Date= date;
		this.ProfessorID = ProfessorID;
		this.ProtocolID = rand.nextInt(100);
		this.Condition = "";
	}

	
	public void AddRequestToList(Aitish aRequest) {
		AllRequests.add(aRequest);
	}

	public String getFirstName() {
		return FirstName;
	}


	public String getLastName() {
		return LastName;
	}


	public String getDate() {
		return Date;
	}


	public String getRequestData() {
		return RequestData;
	}


	public String getProfessorID() {
		return ProfessorID;
	}


	public int getProtocolID() {
		return ProtocolID;
	}


	public String getCondition() {
		return Condition;
	}



	public String getDesicion() {
		return Desicion;
	}


	public void setRequestData(String requestData) {
		RequestData = requestData;
	}


	public void setCondition(String condition) {
		Condition = condition;
	}


	public void setDesicion(String desicion) {
		Desicion = desicion;
	}

	


}