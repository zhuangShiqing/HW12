package Test_p44_55;

public class Test_p48 {
	public static void main(String[] args) {
		Car48 car1=new Car48("1����");
		car1.start();
		try {
			car1.join();
		}catch(InterruptedException e) {
			
		}
		
			System.out.println("����main()���B�z�u�@");
	}
}
class Car48 extends Thread{
	private String name;
	public Car48(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("���b�i��"+name+"���B�z�u�@");
		}
	}
}