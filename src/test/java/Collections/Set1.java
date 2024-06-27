package Collections;


public class Set1 {

	public static void main(String[] args) {
		int a[]= {6,9,2,2,3,3,3,4,5,5,1};
		int b[]= new int [a.length];
		int m=0;
//		LinkedHashSet<Integer> LH = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length - 1; i++) {

			for (int k = 0; k < a.length - 1; k++) {

				if (a[i] != a[k]) {
					b[m] = a[k];
					m++;
				}

			}
		}
			for (int k = 0; k < b.length-1; k++) {
				System.out.println(b[k]);

			}
	}		 
		 }
			
		 
		 

