class RandomExample{
	//main method
	public static void main(String[] args){
		// //Randomly generate numbers between 0-1
        // double max = 1.9;
        // double min = 0.0;
        // double range_one = max-min;
        // double random = (Math.random()*range_one)+min;
		// System.out.println((int)random);

		// //Activity 2: add codes here to generate integers 0,1,2,...,9
		// int range = 9; 
        // System.out.println((int)(Math.random()*range));
        
		
		// Homework 1.1: add codes to generate:
		// a) 0,1,2,3
		int rangeA = 3;
		System.out.println((int)(Math.random()*rangeA));

		// b) 1,2,3,4,5,6
		int maxB = 6;
		int minB = 1;
		int rangeB = maxB-minB;
		double randomB = (Math.random()*rangeB)+minB;
		System.out.println((int)randomB);


		// c) 2,4,6,8
		int maxC = 8;
		int minC = 2;
		int rangeC = maxC-minC;
		int randomC = (int)(Math.random()*rangeC)+minC;
		if (randomC%2 == 0){
			System.out.println(randomC);
		} else {
			randomC += 1;
			System.out.println(randomC);
		}

		// d) -5,-4,...,4,5
		int maxD = 5;
		int minD = -5;
		int rangeD = maxD-minD;
		int randomD = (int)(Math.random()*rangeD)+minD;
		System.out.println(randomD);
	}
}