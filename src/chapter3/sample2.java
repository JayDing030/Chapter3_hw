package chapter3;

public class sample2 {
	public static void main(String[] args) {
		Car1 car1;
		car1 = new Car1();
		car1.num = 1234;
		car1.gas = 20.5;
		System.out.println( "型號是" + car1.num);
		System.out.println("汽油量是" + car1.gas);
	}
}

class Car1
{
	int num;
	double gas;
}