import java.util.Random;

class ArrayPlay {
	public static void main(String[] args) {
		
		NumberGen numGen = new NumberGen(4, 44);
		/* for (int i = 0; i < 50; i++) {
			System.out.println("Random number: "+ numGen.nextRand());
		}	 */
		int[] myArr = createArray(500, numGen);	

		for (int num : myArr) {
			System.out.println(num);
		}
	}
	
	public static int[] createArray(int howMany, NumberGen numGen) {
		int [] myArray= new int[howMany];
		
		for (int i =0; i < howMany; i++) {
			myArray[i] = numGen.nextRand();
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
	
}

