package com.vks.process;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaProcess {

	public static int exec(Class clazz, List<String> jvmArgs, List<String> args)
			throws IOException, InterruptedException {
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
		String classpath = System.getProperty("java.class.path");
		String className = clazz.getName();

		List<String> command = new ArrayList<>();
		command.add(javaBin);
		command.addAll(jvmArgs);
		command.add("-cp");
		command.add(classpath);
		command.add(className);
		command.addAll(args);

		System.out.println(command);
		System.out.println("className : " + className);

		ProcessBuilder builder = new ProcessBuilder(command);
		Process process = builder.inheritIO().start();
		process.waitFor();
		return process.exitValue();

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		List<String> jvmArgs = Arrays.asList();
		List<String> wordList = Arrays.asList(args);  
		exec(com.vks.logging.App.class, jvmArgs, wordList);
	}

}
