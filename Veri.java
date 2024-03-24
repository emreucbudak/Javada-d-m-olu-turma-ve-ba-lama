package test;

public class Veri {

	public static void main(String[] args) {
		Yapı nesne1 = new Yapı();
		Yapı nesne2 = new Yapı();
		Yapı nesne3 = new Yapı();
		Yapı nesne4 = new Yapı();
		nesne1.data = 10;
		nesne2.data = 20;
		nesne3.data = 30;
		nesne4.data = 40;
		nesne1.next = nesne2;
		nesne2.next = nesne3;
		nesne3.next = nesne4;
		nesne4.next = null;
		Yapı ref = nesne1;
		while (ref != null ) {
			System.out.println(ref.data);
			ref = ref.next;
		}
		

		

	}

}
