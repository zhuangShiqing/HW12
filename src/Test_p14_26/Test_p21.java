package Test_p14_26;

public class Test_p21 {
	public static void main(String[] args) {
		try {
			int[] test=new int[5];
			System.out.println("將值指定給test[10]");
			
			test[10]=56;
			System.out.println("將56指定給test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("超過囉!");
		}
		System.out.println("順利!");
	}
}
