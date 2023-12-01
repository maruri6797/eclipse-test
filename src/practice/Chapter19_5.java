package practice;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Chapter19_5 {
	public static void main(String[] args) throws IOException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(0x41);
		bos.write(0x42);
		bos.write(0x43);
		byte[] data = bos.toByteArray();
		for(byte b : data) {
			System.out.print(Integer.toHexString(b) + " ");
		}
	}

}
