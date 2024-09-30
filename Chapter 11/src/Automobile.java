
public class Automobile {
	private int id, year, miles;
	private String make, model, color;
	
	public Automobile(int id, int year, int miles, String make, String model, String color) {
		// id: 0 - 9999, year: 2005 - 2019, miles: 10 - 60
		setId(id);
		setYear(year);
		setMiles(miles);
		this.make = make;
		this.model = model;
		this.color = color;
	}
	//overload equal method
	public boolean equals(Automobile obj) {
		boolean result = false;
		if(id == obj.id && year == obj.year && miles == obj.miles && make.equalsIgnoreCase(obj.make) && 
				model.equalsIgnoreCase(obj.model) && color.equalsIgnoreCase(obj.color)){
			result = true;
		}
		return result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0 || id > 9999)
			this.id = 0;
		else {
			this.id = id;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 2005 || year > 2019)
			this.year = 0;
		else
			this.year = year;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		if(miles < 10 || miles > 60)
			this.miles = 0;
		else
			this.miles = miles;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Automobile [id=" + id + ", year=" + year + ", miles=" + miles + ", make=" + make + ", model=" + model
				+ ", color=" + color + "]";
	}
	
}
