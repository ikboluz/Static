package initialization;

public class Numbers {
	static int count=10;
	static {
		count*=2;
	}
	
	{
		count--;
	}
	
	public Numbers() {
		count=count+10;
	}
	
	public static void main(String[] args) {
		Numbers n= new Numbers();
		System.out.println(n.count);
		
		n= new Numbers();
		System.out.println(n.count);
	}

}
