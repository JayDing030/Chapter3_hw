package chapter3;

public class sample13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car12 car1 = new Car12();
		car1.setCar(1234, 20.5);
		car1.show();
		System.out.println("只變更車號");
		car1.setCar(5678);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(40.5);
		car1.show();
	}
}

class Car12
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("將車號設為:"+ this.num);
	}
	public void setCar(double g)
	{
		gas = g;
		System.out.println("將汽油輛設為:"+this.gas );
	}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為:"+ this.num +",將汽油輛設為:"+this.gas );
	}
	
	public void show()
	{
		System.out.println("車號是:"+this.num);
		System.out.println("汽油量是:"+this.gas);
	}
}