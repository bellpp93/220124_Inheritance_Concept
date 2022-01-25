package 상속예제;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerHong = new Customer(10010, "홍길동");
		customerHong.bonusPoint = 1000;
		System.out.println(customerHong.showCustomerInfo());
		//홍길동님의 고객 등급은 GENERAL이며, 보너스 포인트는 1000입니다.
		
		int priceHong = customerHong.calcPrice(20000);
		System.out.println("상품 결제 금액: " + priceHong);
		//상품 결제 금액: 20000 => 일반고객이라 할인률 없음.
		
		System.out.println();
		
		VIPCustomer customerSon = new VIPCustomer(10020, "손흥민", 12345);
		customerSon.bonusPoint = 50000;
		
		int priceSon = customerSon.calcPrice(20000);
		System.out.println(customerSon.showCustomerInfo());
		//손흥민님의 고객 등급은 VIP이며, 보너스 포인트는 51000입니다.
		System.out.println("상품 결제 금액: " + priceSon);
		//상품 결제 금액: 18000 => VIP라서 10% 할인된 금액.
		
		int agentID = customerSon.getAgentID();
		System.out.println("VIP 고객 담당 상담원 ID: " + agentID);
		//VIP 고객 담당 상담원 ID: 12345
		
		System.out.println();
		
		GOLDCustomer customerLee = new GOLDCustomer(10030, "이강인");
		customerLee.bonusPoint = 30000;
		
		int priceLee = customerLee.calcPrice(20000);
		System.out.println(customerLee.showCustomerInfo());
		//이강인님의 고객 등급은 GOLD이며, 보너스 포인트는 30400입니다.
		System.out.println("상품 결제 금액: " + priceLee);
		//상품 결제 금액: 18000
	}
}
