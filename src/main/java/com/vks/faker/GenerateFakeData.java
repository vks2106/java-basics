package com.vks.faker;

import com.github.javafaker.Faker;

import au.com.anthonybruno.Gen;
import au.com.anthonybruno.generator.defaults.IntGenerator;

public class GenerateFakeData {

	private static final int LIMIT = 10;

	public static void main(String[] args) {

		System.out.println("Created Faker instance .... ");
		Faker faker = Faker.instance();

		System.out.println("Generating data ...... ");
		Gen.start().addField("First Name", () -> faker.name().firstName())
				.addField("Last Name", () -> faker.name().lastName())
				.addField("Age", new IntGenerator(18, 80))
				.addField("Country", () -> faker.country().capital())
				.addField("FunnyName", () -> faker.date().birthday())
				.generate(LIMIT).asCsv().toFile("C:\\git\\java-basics\\src\\main\\resources\\people.csv");

	}

}
