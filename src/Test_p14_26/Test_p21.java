package Test_p14_26;

public class Test_p21 {
	public static void main(String[] args) {
		try {
			int[] test=new int[5];
			System.out.println("�N�ȫ��w��test[10]");
			
			test[10]=56;
			System.out.println("�N56���w��test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�W�L�o!");
		}
		System.out.println("���Q!");
	}
}
