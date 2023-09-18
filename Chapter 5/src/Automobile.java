
public class Automobile {
	private int idNum, year, mpg;
	String make, model, color;
	
	// constructor
	public Automobile(int idNum, int year, int mpg, String make, String model, String color) {
		setIdNum(idNum);
		setYear(year);
		setMpg(mpg);
		setMake(make);
		setModel(model);
		setColor(color);
	}

	// getters & setters
	public int getIdNum() {
		return this.idNum;
	}
	
	public void setIdNum(int idNum) {
		// 0 to 9999
		if(idNum < 0 || idNum > 9999)
			idNum = 0;
		
		this.idNum = idNum;
	}
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		// 2005 - 2019
		if(year < 2005 || year > 2019)
			year = 0;
		
		this.year = year;
	}
	
	public int getMpg() {
		return this.mpg;
	}
	
	public void setMpg(int mpg) {
		// 0 to 60
		if(mpg < 0 || mpg > 60)
			mpg = 0;
		
		this.mpg = mpg;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
