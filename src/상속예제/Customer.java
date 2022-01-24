package ��ӿ���;

//�θ� Ŭ���� ����
public class Customer {
	
	//������� ����(��ü�� �������� �Ӽ�)
	protected int customerID;		//�� ���̵�
	protected String customerName;	//����
	protected String customerGrade;	//�����
	protected int bonusPoint;		//���ʽ� ����Ʈ
	protected double bonusRatio;	//���ʽ� ����Ʈ ��������
	
	//������
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "GENERAL";
		bonusRatio = 0.01;  //1%
	}
	
	//�ʿ� �޼ҵ� ����
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;  //'a = a + b;'�� 'a += b;'�� ����.
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� �� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	//������� �ϳ��� getter, setter �޼ҵ� �ѽ־� ����
	public int getCustomerID() {  //getter�� ��ȯŸ�� �ִ� = ����Ÿ���� �ִ�.(ex.int)
		return customerID;
	}

	public void setCustomerID(int customerID) {  //setter�� ��ȯŸ�� ���� = ����Ÿ�� ����.(void)
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
