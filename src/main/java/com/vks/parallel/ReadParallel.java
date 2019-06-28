package com.vks.parallel;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ReadParallel {

//	https://stackoverflow.com/questions/9093888/fastest-way-of-reading-relatively-huge-byte-files-in-java

	private static final int LIMIT = 1024;

	public static void writeToArrayList(ArrayList<byte[]> outputArr, String fileName) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream reader = null;
		try {
			reader = new BufferedInputStream(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] buffer = new byte[LIMIT];

		int i = 0;
		while (reader.available() != 0) {
			reader.read(buffer);
			i++;
			if (i <= LIMIT) {
				outputArr.add(buffer);
				i = 0;
				buffer = null;
				buffer = new byte[LIMIT];

			} else
				continue;

		}
		System.out.println("FileReader-Elements: " + outputArr.size() + " w. " + buffer.length + " byte each.");

		readFromArrayList(outputArr);
		
	}

	public static void readFromArrayList(ArrayList<byte[]> outputArr) {
		// TODO Auto-generated method stub
		for (Iterator iterator = outputArr.iterator(); iterator.hasNext();) {
			byte[] bs = (byte[]) iterator.next();
			String str = new String(bs, StandardCharsets.UTF_8);
			System.out.println(str);
		}

	}

	public static void main(String[] args) throws IOException {

		String fileName = "C:\\git\\java-basics\\src\\main\\resources\\people.csv";

		ArrayList<byte[]> outputArr = new ArrayList<byte[]>();

		writeToArrayList(outputArr, fileName);
		

	}

}
