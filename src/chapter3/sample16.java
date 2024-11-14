package chapter3;

public class sample16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15 car1 = new Car15();
		car1.show();
		Car15 car2 = new Car15(1234, 20.5);
		car2.show();
	}

}

class Car15
{
	private int num;
	private double gas;
	
	public Car15()
	{
		
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public Car15(int n, double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num +"，汽油量為"+ gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}