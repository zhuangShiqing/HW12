package Test_p6_10;

public class Test_p6 {
	public static void main(String[] args) {
		Car6 car1;
		car1=new Car6();
		car1.show();
	}
}
class Car6{
	private int num;
	private double gas;
	
	public Car6() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F�T��");
	}
	public Car6(int n ,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}