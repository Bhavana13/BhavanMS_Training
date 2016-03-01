
public class StringConcatenation {

	public static void main(String[] args) {
				//Concatenating string with another string
				String helloVariable = "hello ";
				String worldVariable = "world";
				System.out.println(helloVariable.concat(worldVariable)); //hello world

				//Appending string to string
				StringBuilder helloStrBuilderVariable = new StringBuilder("hello");
				StringBuilder worldStrBuilderVariable = new StringBuilder(" world");
				System.out.println(helloStrBuilderVariable.append(worldStrBuilderVariable)); //prints hello world

				//Appending char to string
				StringBuilder charVariable = new StringBuilder("Java");
				System.out.println(charVariable.append('D')); // prints JavaD

			
	}

}
