package Test_p44_55;

public class Test_p52 {
	public static void main(String[] args) {
		Company cmp =new Company();
		Driver div1=new Driver(cmp);
		div1.start();
		Driver div2=new Driver(cmp);
		div2.start();
		}
}
class Company{
	private int sum=0;
	public void add(int a) {
		int tmp=sum;
		System.out.println("目前合計金額是"+tmp+"元");
		System.out.println("賺錢"+a+"元了");
		sum=tmp;
	}
}
class Driver extends Thread{
	private Company comp;
	public Driver(Company c) {
		comp =c;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}