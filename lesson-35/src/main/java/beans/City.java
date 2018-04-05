package beans;
public class City {
	public City() {}

	@Override
	public String toString() {
		return decorator.decorate(name, population, countryName);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setDecorator(PrintService service) {
		this.decorator = service;
	}

	private String name;
	private String countryName;
	private int population;
	private PrintService decorator;
}
