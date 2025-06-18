package Encapsulation;

public class CarRental {
	
	private String model;
	private String RegNo;
	private boolean isAvailable;
	
	public CarRental (String model, String RegNo, boolean isAvailable) {
		this.model = model;
		this.RegNo= RegNo;
		this.isAvailable = isAvailable;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getRegNo() {
		return RegNo;
	}
	
	public boolean getisAvailable() {
		return isAvailable;
	}
	
	public void rentCar()
	{
		if (isAvailable) {
			isAvailable=true;
			System.out.println(model+" "+RegNo+" Car is available");
		}else {
			System.out.println(model+" "+RegNo+"it is been taken");
		}
		
	}
	public static void main(String[] args) {
		CarRental obj= new CarRental("Tata","KA89MN007",true);
		System.out.println("CarModel : "+obj.getModel());
		System.out.println("RegNo : "+obj.getRegNo());
		System.out.println("is the car avail "+obj.getisAvailable());
		
		obj.rentCar();
		 	
		
	}

}
