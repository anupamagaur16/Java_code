package AbstractionDemo;

public class Abstraction {
	
	public static void main(String[] args)
	{
		Vehicle car = new Vehicle("WB26BC7337",4,"Midnight blue");
		//car.Wheels = 4;
		System.out.println("Brand : "+Vehicle.Brand);
		System.out.println("Vehicle No. : "+car.VehicleNo);
		System.out.println("Wheels : "+car.Wheels);
		System.out.println("Color : "+car.Color);
		//Vehicle.Brand = "Maruti";
	}

}
 class Vehicle
{
	String VehicleNo;
	final int Wheels;
	static String Brand;
	String Color;
	static 
	{
		Brand = "Maruti";
	}
	public Vehicle(String VehicleNo, int Wheels, String color)
	{
		//Brand = "Maruti";
		this.VehicleNo = VehicleNo;
		this.Wheels = Wheels;
		Color = color;
	}
}
