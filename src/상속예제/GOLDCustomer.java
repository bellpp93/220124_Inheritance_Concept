package ��ӿ���;

public class GOLDCustomer extends Customer {
	//�������
	private double saleRatio;  //���η�
	
	//������
	public GOLDCustomer(int customerID, String customerName) {
		super(customerID, customerName);  //super( )�� �ݵ�� �������� 'ù ����'�� �;���
		customerGrade = "GOLD";  //�����
		bonusRatio = 0.02;  //���ʽ� ���� 2%
		saleRatio = 0.1;  //���η� 10%
	}
	
	//�ʿ��� �޼ҵ� ����
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);  //���η� ����
	}
}
