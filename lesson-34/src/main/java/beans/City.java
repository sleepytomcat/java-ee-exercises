package beans;
public class City {
	public City() {}

	@Override
	public String toString() {
		return "City [" 
				+ (name != null ? "name=" + name + ", " : "")
				+ (countryName != null ? "countryName=" + countryName + ", " : "") 
				+ "population=" + population + "]";
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

	private String name;
	private String countryName;
	private int population;
}
