package Praktik;

public class kokaltiii {
	public static double dustur(int a,int b, int c){
		int yc = (a + b + c) / 2;
		return Math.sqrt(yc * (yc - a)*(yc - b)*(yc - c));
	} 
}
