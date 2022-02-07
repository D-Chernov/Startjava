public class Calculator{
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		char calcul = '^';
		if (a>b) {

		if (calcul == '+') {
			System.out.println(a + b);
		} else if (calcul == '-') {
		 	System.out.println(a - b);	
		} else if (calcul == '*') {
			System.out.println(a * b);
		} else if (calcul == '/') {
			System.out.println(a / b);
		} else if (calcul == '^') {
			int r = 1;
			for (int i = 1; i <= b; i++){
				r = r * a;
			}
			System.out.println(r);
		} else if (calcul == '%') {
			System.out.println(a % b);
		}
		}
		//System.out.println(calcultor);

	}
}