package Test_p44_55;

public class Test_p50 {
	public static void main(String[] args) {
		Car50 car1=new Car50("1����");
		Thread th1=new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��main()���B�z");
		}
	}
}
class Car50 implements Runnable{
	private String name;
	public Car50(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z");
		}
	}
}