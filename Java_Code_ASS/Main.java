//Υλοποιήσαμε 2 κομμάτι της λειτουργικότητας του συστήματος
// 1-'Υποβολή αίτησης απο τον καθηγητή και η εμφάνιση των αιτήσεων του στο σύστημα'
// 2- 'Ενημέρωση κατάστασης αιτησης απο την γραμματεία'
//Λέιπουν κομμάτια του κώδικα συνεπώς δεν είναι ολοκλήρωμένος

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Kathigitis Kathigitis_1 = new Kathigitis("dai23968@uom.gr");  //Δημιουργία 2 καθηγητών
			Kathigitis Kathigitis_2 = new Kathigitis("dai12345@uom.gr");
			
			Aitish Aitish_1 = new Aitish("textfiles","22/5/20","dai23968");		//Δημιουργία 4 Αιτήσεων με τα δεδομένα-ημερομηνία-κάτοχο
			Aitish Aitish_2 = new Aitish("textfiles","03/7/20","dai23968");
			Aitish Aitish_3 = new Aitish("textfiles","15/10/22","dai12345");
			Aitish Aitish_4 = new Aitish("textfiles","13/9/22","dai12345");
			
			Kathigitis_1.AddRequestToMyList(Aitish_1);							//Προσθήκη Αιτήσεων στην λίστα αιτήσεων του κάθε καθηγητή
			Kathigitis_1.AddRequestToMyList(Aitish_2);
			Kathigitis_2.AddRequestToMyList(Aitish_3);
			Kathigitis_2.AddRequestToMyList(Aitish_4);
			
		
			Grammateia Grammateia = new Grammateia("dai98765@uom.ehde.gr");		//Δημιουργία 1 γραμματείας για προέλεγχο και ενημέρωση αιτήσεων
			
			Grammateia.AddRequestToMyList(Aitish_1);
			Grammateia.AddRequestToMyList(Aitish_2);							//Προσθήκη Αιτήσεων στην λίστα αιτήσεων της γραμματείας
			Grammateia.AddRequestToMyList(Aitish_3);
			Grammateia.AddRequestToMyList(Aitish_4);
			
			Grammateia.UpdateRequest(Aitish_1,"ΥΠΟ-ΕΞΕΤΑΣΗ");					//Η γραμματεία ενημερώνει την κατάσταση 2 αιτήσεων που έχουν υποβληθεί
			Grammateia.UpdateRequest(Aitish_3,"ΑΠΟΡΡΙΦΘΗΚΕ");
			
			Kathigitis_1.PrintMyList();											//Εμφάνιση όλων των αιτήσεων που έχει υποβάλλει ο εκάστοτε καθηγητής
			Kathigitis_2.PrintMyList();
			
			
			
	}

}
