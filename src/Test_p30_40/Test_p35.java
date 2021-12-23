package Test_p30_40;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Test_p35 {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("test1.txt");
			PrintWriter pw=new PrintWriter(new BufferedWriter(fw));
			pw.println("Hello");
			pw.println("GoogBye!");
			pw.close();
			System.out.println("資料已經寫入檔案");
		}catch(IOException e){
			System.out.println("輸出有錯誤");	
		}
	}
}
