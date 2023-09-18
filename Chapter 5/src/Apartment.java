
public class Apartment {
	int aptNum, bedNum, bathNum;
	double rent;
	
	public Apartment(int num, int bed, int bath, double rent) {
		this.aptNum = num;
		this.bedNum = bed;
		this.bathNum = bath;
		this.rent = rent;
	}

	public int getAptNum() {
		return aptNum;
	}

	public int getBedNum() {
		return bedNum;
	}

	public int getBathNum() {
		return bathNum;
	}

	public double getRent() {
		return rent;
	}

	

}
