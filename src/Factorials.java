/**
 * Awhina Git workshop Excercise
 * @author langephil
 *
 */
public class Factorials {

	public static  long iterFactorial(int n) {
	    long fact = 1;
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    return fact;
	}

	public static  long recursiveFactorial(int n) {
		if (i <= 2 ) { return i; }
		return i * recursiveFactorial(i-1);
	}

	public static  long streamFactorial(int n) {
		//FIXME: Your implementation here
		return 0;
	}

	public static void main(String[] args) {
		int a;
		if(args.length == 1) {
			a = Integer.parseInt(args[0]);
		}
		else a = 10;
		System.out.println(a+"! = " + iterFactorial(a));
		System.out.println(a+"! = " + recursiveFactorial(a));
	}



}
