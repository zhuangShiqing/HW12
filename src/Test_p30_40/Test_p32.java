package Test_p30_40;

public class Test_p32 {
	public static void main(String[] args)throws CarException {
		Car32 car1=new Car32();
		car1.setCar(456, -88.9);
		car1.show();
	}
}
class CarException extends Exception{ }
class Car32{
	private int num;
	private double gas;
	
	public Car32() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F�T��");
	}
	public void setCar(int n,double g)throws CarException{
		if(g<0) {
			CarException e=new CarException();
			throw e;
		}
		else {
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
		}
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}