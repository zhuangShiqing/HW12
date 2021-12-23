package Test_p30_40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_p40 {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		try {
			BufferedReader br=new BufferedReader(new FileReader(args[0]));
			String str1;
			while((str1=br.readLine())!=null) {
				System.out.println(str1);
			}
			br.close();
		}catch(IOException e){
			System.out.println("輸入輸出有錯誤");	
		}
	}
}
