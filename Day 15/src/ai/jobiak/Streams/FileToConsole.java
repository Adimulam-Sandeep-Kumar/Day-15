package ai.jobiak.Streams;

import java.io.*;
public class FileToConsole {
	public static void main(String[] args)throws IOException {
		FileInputStream fis =  new FileInputStream("D:\\jobiak\\core\\Day 15\\src\\ai\\jobiak\\Streams\\FileToConsole.java");
		int data = fis.read();
		while(data != -1) {
		System.out.println((char)data);
		data = fis.read();
		}
	}
}
