package Test_p44_55;

public class Test_p47 {
	public static void main(String[] args) {
		Car47 car1=new Car47("1����");
		car1.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���b�i��main()���B�z�u�@");
			}catch(InterruptedException e) {
				
			}
		}
	}
}
class Car47 extends Thread{
	private String name;
	public Car47(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}