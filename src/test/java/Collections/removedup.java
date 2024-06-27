package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removedup {

	public static void main(String[] args) {
		int a[]= {1,2,4,2,5,4,3};
		String s="Kiran Kumar Kiran";
		String p[] = s.split(" ");
		List l = new ArrayList();
		for(int i=0;i<p.length;i++) {
			l.add(p[i]);
			System.out.println(l);
		}
			
			Set y = new HashSet(l);
			System.out.println(y);
	}

}
