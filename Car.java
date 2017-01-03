//Jose Mora
//CS 141
public class Car {
	private String make, model;
	private int year;
	private int location = 0;
	
	public Car(){
		this.make = "";
		this.model = "";
		this.year = 0;
		this.location = 0;
	}
	
	public Car(String make, String model, int year, int location){
		this.make = make;
		this.model = model;
		this.year = year;
		this.location = location;
	}
	public int getYear(){
		return year;
	}
	
	public void setMake(String m){
		make = m;
	}
	public String getMake(){
		return make;
	}
	public void setModel(String mod){
		model = mod;
	}
	public String getModel(){
		return model;
	}
	public void depressHorn(){
		System.out.println("HONK");
	}
	public void drive(int drive){
		location += drive;
	}
	public void reverse(int reverse){
		location += reverse;
	}

public static void main(String[] args){
	Car[] car = new Car[3];
	for(int i=0;i<3;i++){
		car[i] = new Car();
		car[i].setMake("make" + i);
		car[i].setModel("model" + i);
		}
	for(int j=0; j < car.length; j++) {
		car[j].drive(10);
		car[j].reverse(-5);
		System.out.println("Car" + j+ ": " + "\nModel:" + car[j].getModel() + "\nMake: " + car[j].getModel());
		car[j].depressHorn();
		}
	Car BMW = new Car("BMW", "I8", 2017,0);
	System.out.println("Car: " + BMW.getMake() + "\nModel:" + BMW.getModel() + "\nMake: " + BMW.getYear());
	}
}

