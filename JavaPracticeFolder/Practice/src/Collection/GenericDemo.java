package Collection;

public class GenericDemo {
	 public static <E> void PrintArray(E[] inputArray) {
		 for(E e:inputArray) {
			 System.out.print(e+ " ");
		 }
		 System.out.println();
	 }
	 public static void main(String[] args) {
		Integer intArray[]= {1,2,3,4};
		Double DoubleArray[]= {1.2,2.6,3.8,4.0};
		Character charArray[]= {'T','O','P','S'};
		String strArray[]= {"Java","Testing","Python"};
		
		PrintArray(intArray);
		PrintArray(DoubleArray);
		PrintArray(charArray);
		PrintArray(strArray);
		
	}
}

