package chapter3;

public class sample17 {
	public static void main(String[] args) {
		
		Car16.showSum();
		Car16 car1 = new Car16();
		car1.setCar(123444, 41.536);
		
		Car16.showSum();
		Car16 car2 = new Car16();
		car2.setCar(4563, 33.55);;
	}

}

class Car16
{
	public static int sum = 0;
	private int num;
	private double gas;
	
	public Car16()
	{
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num +"，汽油量為"+ gas);
	}
	
	public static void showSum()
	{
		System.out.println("車子總共有"+ sum +"台");
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}