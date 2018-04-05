package services;

import beans.PrintService;

public class XmlPrintServiceImpl implements PrintService {
	XmlPrintServiceImpl() {}
	@Override
	public String decorate(String cityName, int population, String countryName) {
		return "<city>"
				+ "<name>" + cityName + "</name>"
				+ "<country>" + countryName + "</country>"
				+ "<population>" + population + "</population>"
				+ "</city>";
	}
}
