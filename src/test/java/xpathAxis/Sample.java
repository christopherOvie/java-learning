package xpathAxis;

public class Sample {

	int x,y,z;
	
	public void add(int x,int y,int z) {
		System.out.println(x+ y-z);
	}
	
	public void sub(int x,int y, int z) {
		System.out.println(x-y-z);
	}
	
	public void multiply(int x,int z) {
		System.out.println(x*z);
	}
	public void divide(int y,int z) {
		System.out.println(y/z);
	}
	public static void main(String[] args) {
		Sample s = new Sample();
	
		s.add(4, 20, 10);
		s.multiply(6, 7);
		s.divide(20, 5);

	}

}
