// abstract class Computer
interface Computer
{
	 void code();
	// public abstract void code();
}

// class Laptop extends Computer
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

// class Desktop extends Computer
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}

class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class InterfaceDemo {
    public static void main(String[] args) {
//		Laptop lap=new Laptop();
//      Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}