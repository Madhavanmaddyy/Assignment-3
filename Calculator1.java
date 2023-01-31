package week2.day1;

public class Calculator1 {
	public void additionTwoNum(int a, int b) {
		int c= a+b+b;
		System.out.println("add of c:"+c);
	}
	public void subractionTwoNum(int d, int e,int f) {
		int g= d+f-e;
		System.out.println("sub of c:"+g);
	}
	public void multipleTwoNum(double h, double i,double j) {
		double k=h*-i*-j;
		System.out.println("mul of k:"+k);
	}
	public void divideTwoNum(float x, float y) {
		float z=x/-y;
		System.out.println("div of z:"+z);
		
	}
	public static void main(String[] args) {
		Calculator1 calci=new Calculator1();
		calci.additionTwoNum(353,866);
		calci.subractionTwoNum(4546,5644,5000);
		calci.multipleTwoNum(384.45,748.78,74.98);
		calci.divideTwoNum(4646.83f,646.84f);
		
		
		
	}
	

}
