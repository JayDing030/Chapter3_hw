package chapter3;

public class sample14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car13 car1 = new Car13();
		car1.show();
	}
}

class Car13
{
	private int num;
	private double gas;
	
	public Car13()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.print("汽油量是:"+this.gas);
	}
}