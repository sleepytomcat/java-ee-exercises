package services;

import beans.PrintService;

public class JsonPrintServiceImpl implements PrintService {
	@Override
	public String decorate(String cityName, int population, String countryName) {
		return "{"
				+ "\"name\":" + "\"" + cityName + "\"" + ","
				+ "\"country\":" + "\"" + countryName + "\"" + ","
				+ "\"population\":" + population
				+ "}";
	}
}
