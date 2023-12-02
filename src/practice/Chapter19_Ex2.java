package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Chapter19_Ex2 {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("C:\\pleiades\\workspace\\personal.properties")){
			Properties p = new Properties();
			p.load(fr);
			System.out.println("名前：" + p.getProperty("name"));
			System.out.println("年齢：" + p.getProperty("age"));
			System.out.println("性別：" + p.getProperty("gender"));
		} catch(FileNotFoundException e) {
			System.out.println("ファイルがありませんでした");
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}

}
