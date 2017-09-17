package NumberPlay;

import java.util.Random;

class NumberPlay {
	public static void main(String[] args) {
		
		NumberGen numGen = new NumberGen(4, 44);
		/* for (int i = 0; i < 50; i++) {
			System.out.println("Random number: "+ numGen.nextRand());
		}	 */
		int[] myArr = createArray(50, numGen);

		for (int num : myArr) {
			System.out.print(num+ " ");
		}
		System.out.println("\nAnd this is a sorted array: ");
		int[] sortedArr = NumberGen.bubbleSort(myArr);
		for (int num : sortedArr) {
			System.out.print(num+ " ");
		}
	}
	
	public static int[] createArray(int howMany, NumberGen numGen) {
		int [] myArray= new int[howMany];
		
		for (int i =0; i < howMany; i++) {
			int newNum = numGen.nextRand();
			if (i > 0) {
				while (newNum != myArray[i - 1]) {
					myArray[i] = newNum;
				}
			}
		}
		return myArray;
	}
}

class NumberGen {
	
	private int theNum;
	private int min;
	private int max;
	
	NumberGen(int min, int max){
		this.min = min;
		this.max = max;
		theNum = randInt(min, max);		
	}
	
	public int randInt(int min, int max) {
		Random rand = new Random();
		
		// nextInt is exclusive of the top value, hence adding 1
		int randomNum = rand.nextInt((max - min) + min);
		
		return randomNum;
	}
	
	public int showNum() {
		return theNum;
	}
	public int nextRand() {
		return randInt(min, max);
	}

	public static int[] bubbleSort(int[] arr) {

		int n = arr.length;
		int temp = 0;
		for (int i=0; i < n; i++) {
			for (int j = 1; j < (n-1); j++) {
				if(arr[j-1] > arr[j]) {
					//swap elements
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}

