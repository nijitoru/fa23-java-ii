
public class TestAutomobiles {
	
	public static void main(String[] args) {
		
		Automobile am1 = new Automobile(24, 2007, 35, "Toyota", "Tacoma", "Grey");
        System.out.printf("ID Number: %d\nYear: %d\nMiles per Gallon: %d\nMake: %s\nModel: %s\nColor: %s",
                am1.getIdNum(), am1.getYear(), am1.getMpg(), am1.getMake(), am1.getModel(), am1.getColor());
		
	}
	
}
