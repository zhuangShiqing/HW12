package Test_p44_55;

public class Test_p55 {
	public static void main(String[] args) {
		Company1 cmp =new Company1();
		Driver1 div1=new Driver1(cmp);
		div1.start();
		Driver1 div2=new Driver1(cmp);
		div2.start();
		}
}
class Company1{
	private int sum=0;
	public void add(int a) {
		int tmp=sum;
		System.out.println("目前合計金額是"+tmp+"元");
		System.out.println("賺錢"+a+"元了");
		sum=tmp;
	}
}
class Driver1 extends Thread{
	private Company1 comp;
	public Driver1(Company1 c) {
		comp =c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}