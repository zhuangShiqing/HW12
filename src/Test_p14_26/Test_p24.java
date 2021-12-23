package Test_p14_26;

public class Test_p24 {
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
		finally {
			System.out.println("最後一定執行!");
		}
		System.out.println("順利!");
	}
}
