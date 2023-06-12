package Java8HW;

public class Car implements Parking{
	public static void main(String[] args) {
		Car c=new Car();
		if(c instanceof Parking) {
			System.out.println("allowed to enter");
		}
		else {
			System.out.println("not toallowed");
		}
	}

}
