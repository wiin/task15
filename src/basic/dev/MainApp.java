package basic.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.78;
		double esp = 0.001;
		double first = 1;
		int n = 1;
		double second = first + giaiThuaChan(n) * Math.pow(x,n) / giaiThuaChan(2*n);
		while (Math.abs(second - first) > esp) {
			n++;
			first = second;
			second = first + giaiThuaChan(n) * Math.pow(x,n) / giaiThuaChan(2*n);
		}
		System.out.format("Math.sqrt(1 + %f) = %.2f", x, first).println();
		exc1(x);
	}

	
	
	static double giaiThua(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n * giaiThua(n-1);
		}
	}
	
	static void exc1 (double x) {
		int n = 1;
		double first = 1 ;
		double second = first + Math.pow(x, n) / giaiThua(n);
		double esp = 0.001;
		while (Math.abs(first - second) > esp) {
			n++;
			first = second;
			second = first + Math.pow(x, n) / giaiThua(n);
		}
		System.out.format("e^%f = %.2f", x, first);
	}
	
	static double exc2 (double x) {
		double esp = 0.001;
		double first = 1;
		int n = 1;
		double second = n + ((n+1)*(n+2) * Math.pow(x ,n)) / (2 * Math.pow(-1, n));
		while (Math.abs(second - first) > esp) {
			n++;
			first = second;
			second = first + ((n+1)*(n+2) * Math.pow(x ,n)) / (2 * Math.pow(-1, n));
		}
		System.out.format("1/ (1+%f)^3 = %.2f", x, first);
	}
	
	static double exc3 (double x) {
		double first = - x;
		int n = 1;
		double second = - Math.pow(x, n) / n;
		while (Math.abs(second - first) > esp) {
			n++;
			first = second;
			second =  first + Math.pow(x, n) / n;
		}
		System.out.format("ln(1 - %f) = %.2f", x, first);
		
	}
	
	static double exc4 (double x) {
		double first = 1;
		int n = 0;
		double second = first + Math.pow(x, n) / n;
		while (Math.abs(second - first) > esp) {
			n++;
			first = second;
			second =  first + Math.pow(x, n) / n;
		}
		System.out.format("ln(1 - %f) = %.2f", x, first);
	}
	static double exc5 (double x) {
		double first = 1;
		int dau = -1;
		int n = 1;
		double second = first + dau * giaiThuaChan(n) * Math.pow(x,n) / giaiThuaChan(2*n);
		while (Math.abs(second - first) > esp) {
			n++;
			dau = -dau;
			first = second;
			second = first + dau * giaiThuaChan(n) * Math.pow(x,n) / giaiThuaChan(2*n);
		}
		System.out.format("Math.sqrt(1 + %f) = %.2f", x, first);
	}
	
	static int giaiThuaChan(int n) {
		if (n < 1) {
			return 1;
		}else {
			return n * giaiThuaChan(n-2);
		}
	}
	}

