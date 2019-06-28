package com.vks.parallel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {

	public static void main(String[] args) throws IOException {

		String fileName = "C:\\git\\java-basics\\src\\main\\resources\\people.csv";
		FileChannel channel = null;
		try {
			channel = new FileInputStream(fileName).getChannel();
			MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// when finished
		channel.close();
	}
}
