package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter19_3 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("C:\\pleiades\\workspace\\test.txt")){
			fos.write(0x41);
		} catch (FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}

}
