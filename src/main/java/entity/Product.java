package entity;

public class Product {
	private int id;
    private String name;
    private double price;
    private String description;
    private Brand brand;
    private Console console;
    private int amount;
    private String tag;
    private String type;
    private String image; 
    

    public Product(int id, String name, double price, String description, Brand brand, Console console, int amount, String tag, String type, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
        this.console = console;
        this.amount = amount;
        this.tag = tag;
        this.type = type;
        this.image = image;
    }



	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Brand getBrand() {
		return brand;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public Console getConsole() {
		return console;
	}


	public void setConsole(Console console) {
		this.console = console;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
    
	
}
