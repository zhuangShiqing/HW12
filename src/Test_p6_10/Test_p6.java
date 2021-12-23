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
		System.out.println("生產了汽車");
	}
	public Car6(int n ,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}