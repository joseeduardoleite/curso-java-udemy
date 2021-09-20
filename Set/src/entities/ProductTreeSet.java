package entities;

public class ProductTreeSet implements Comparable<ProductTreeSet> {
	
	private String name;
	private Double price;

	public ProductTreeSet(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(ProductTreeSet other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}
