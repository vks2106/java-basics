package com.vks.design.factory;

public class ConfigFactory {

	public ConfigInterface createConfig(String env) {
		// TODO Auto-generated method stub

		switch (env) {
		case "dev":
			return new ConfigDev();

		case "prod":
			return new ConfigProd();

		}
		
		return null;

	}
}
