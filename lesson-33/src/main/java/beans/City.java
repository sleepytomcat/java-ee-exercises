package beans;
public class City {
	public City() {}
	public City(String name, String countryName, int population) {
		this.name = name; 
		this.countryName = countryName;
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [" 
				+ (name != null ? "name=" + name + ", " : "")
				+ (countryName != null ? "countryName=" + countryName + ", " : "") 
				+ "population=" + population + "]";
	}
	
	private String name;
	private String countryName;
	private int population;
}
