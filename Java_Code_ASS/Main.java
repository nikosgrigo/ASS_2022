//����������� 2 ������� ��� ���������������� ��� ����������
// 1-'������� ������� ��� ��� �������� ��� � �������� ��� �������� ��� ��� �������'
// 2- '��������� ���������� ������� ��� ��� ����������'
//������� �������� ��� ������ ������� ��� ����� �������������

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Kathigitis Kathigitis_1 = new Kathigitis("dai23968@uom.gr");  //���������� 2 ���������
			Kathigitis Kathigitis_2 = new Kathigitis("dai12345@uom.gr");
			
			Aitish Aitish_1 = new Aitish("textfiles","22/5/20","dai23968");		//���������� 4 �������� �� �� ��������-����������-������
			Aitish Aitish_2 = new Aitish("textfiles","03/7/20","dai23968");
			Aitish Aitish_3 = new Aitish("textfiles","15/10/22","dai12345");
			Aitish Aitish_4 = new Aitish("textfiles","13/9/22","dai12345");
			
			Kathigitis_1.AddRequestToMyList(Aitish_1);							//�������� �������� ���� ����� �������� ��� ���� ��������
			Kathigitis_1.AddRequestToMyList(Aitish_2);
			Kathigitis_2.AddRequestToMyList(Aitish_3);
			Kathigitis_2.AddRequestToMyList(Aitish_4);
			
		
			Grammateia Grammateia = new Grammateia("dai98765@uom.ehde.gr");		//���������� 1 ����������� ��� ��������� ��� ��������� ��������
			
			Grammateia.AddRequestToMyList(Aitish_1);
			Grammateia.AddRequestToMyList(Aitish_2);							//�������� �������� ���� ����� �������� ��� �����������
			Grammateia.AddRequestToMyList(Aitish_3);
			Grammateia.AddRequestToMyList(Aitish_4);
			
			Grammateia.UpdateRequest(Aitish_1,"���-�������");					//� ���������� ���������� ��� ��������� 2 �������� ��� ����� ���������
			Grammateia.UpdateRequest(Aitish_3,"�����������");
			
			Kathigitis_1.PrintMyList();											//�������� ���� ��� �������� ��� ���� ��������� � �������� ���������
			Kathigitis_2.PrintMyList();
			
			
			
	}

}
