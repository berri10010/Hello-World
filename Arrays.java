public class Arrays {
	public static void main(String[] args) {
		int x; // We are creating that one box that can store one int value
		int[] MyArray; // We are declaring an array that will stores ints
		//MyArray = new int[80000]; // We are initializing our array to e capable of holding 8 ints
		MyArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//Person[] people; is an example of an array
		
		/*x = 5;
		
		MyArray[0] = x;
		MyArray[1] = 10;
		MyArray[2] = 15;
		MyArray[3] = 20;
		MyArray[4] = 25;
		MyArray[5] = 30;
		MyArray[6] = 35;
		MyArray[7] = 40;
		
		System.out.println(MyArray[4]);*/
		
		/*for (int counter = 0; counter < 80000; counter++) {
			MyArray[counter] = counter;
			}*/
		
		//. inserting over an array
		/*for (int i = 0; i < MyArray.length; i++) {
			System.out.println(MyArray[i]);
		}*/
		
		for (int number : MyArray) {
			System.out.println(number);
		}

	}

}
