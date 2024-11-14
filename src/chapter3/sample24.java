package chapter3;

public class sample24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("宣告了car1");
		Car23 car1 = new Car23();
		car1.setCar(1234, 20.5);
		
		System.out.println("宣告了car2");
		Car23 car2;
		
		System.out.println("將car1指定給了car2");
		car2 = car1;
		
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(5678, 30.5);
		
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
	}
}

class Car23
{
	private int num;
	private double gas;
	
	public Car23()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n, double g)
	{
		
		num = n;
		gas = g;
		System.out.println("車號為"+ num +"，汽油量為"+ gas);
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}
