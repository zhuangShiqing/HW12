package pc_p10;

public class pc_class_p10{
	private int num;
	private double gas;
	
	public pc_class_p10() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F�T��");
	}
	public pc_class_p10(int n ,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}