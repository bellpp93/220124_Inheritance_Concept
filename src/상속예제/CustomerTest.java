package ��ӿ���;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerHong = new Customer(10010, "ȫ�浿");
		customerHong.bonusPoint = 1000;
		System.out.println(customerHong.showCustomerInfo());
		//ȫ�浿���� �� ����� GENERAL�̸�, ���ʽ� ����Ʈ�� 1000�Դϴ�.
		
		int priceHong = customerHong.calcPrice(20000);
		System.out.println("��ǰ ���� �ݾ�: " + priceHong);
		//��ǰ ���� �ݾ�: 20000 => �Ϲݰ��̶� ���η� ����.
		
		System.out.println();
		
		VIPCustomer customerSon = new VIPCustomer(10020, "�����", 12345);
		customerSon.bonusPoint = 50000;
		System.out.println(customerSon.showCustomerInfo());
		//����δ��� �� ����� VIP�̸�, ���ʽ� ����Ʈ�� 50000�Դϴ�.
		
		int priceSon = customerSon.calcPrice(20000);
		System.out.println("��ǰ ���� �ݾ�: " + priceSon);
		//��ǰ ���� �ݾ�: 18000 => VIP�� 10% ���ε� �ݾ�.
		
		int agentID = customerSon.getAgentID();
		System.out.println("VIP �� ��� ���� ID: " + agentID);
		//VIP �� ��� ���� ID: 12345
	}
}
