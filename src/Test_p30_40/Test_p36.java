package Test_p30_40;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class Test_p36 {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("test1.txt"));
			String str1=br.readLine();
			String str2=br.readLine();
			System.out.println("�g���ɮפ�����Ӧr��O");
			System.out.println(str1);
			System.out.println(str2);
			br.close();
		}catch(IOException e){
			System.out.println("��J��X�����~");	
		}
	}
}
