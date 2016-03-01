public class StringDemo {
	public static void main(String[] args) {
		String s1 = "abc";
		StringBuilder s2 = new StringBuilder("pqr");
		s1.concat("xyz");
		s2.append("xyz");
		

		System.out.println(s1);
		System.out.println(s2);
		
	}

}
