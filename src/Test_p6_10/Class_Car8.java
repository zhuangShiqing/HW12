package Test_p6_10;

class Class_Car8 {
	private int num;
	private double gas;
	
	public Class_Car8() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F�T��");
	}
	public Class_Car8(int n ,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
