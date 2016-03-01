
public class MyDistinctElement {
    private static boolean isDistinct;
	public static void printDisElement(int[] arr){
         for(int i=0;i<arr.length;i++){
        	 setDistinct(false);
        	  for(int j=0;j<i;j++){
        		  if(arr[i]==arr[j]){
        			  setDistinct(true);
        			 break;
        			  
        		  }
        	  }
         }
    }
	public static void main(String[] args) {
		int[] num = {5,2,7,2,4,7,8,2,3};
		MyDistinctElement.printDisElement(num);
	}
	public static boolean isDistinct() {
		return isDistinct;
	}
	public static void setDistinct(boolean isDistinct) {
		MyDistinctElement.isDistinct = isDistinct;
	}

}
