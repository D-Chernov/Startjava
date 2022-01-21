public class Cycle {
	public static void main(String[] args) {

		for (int i = 0; i < 21; i++ ) {
			System.out.println(i + "");	
		}

		System.out.println(" ");

		int j = -6;
		while (j <= 6) {
			System.out.println(j + "");
			j++;
		}

		System.out.println(" ");

		int d = 10;
		int r = 0;
		do {
			//System.out.println(d + "");
			if (d % 2 != 0) {
				r = r + d;
			}
			d++;
		} while (d < 21);
		System.out.println(r);
	}
}