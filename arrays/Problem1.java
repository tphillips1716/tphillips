class Problem1{
	public static void main(String args[]){
		int array1[] = new int [10];
		for(int i = 0;i< array1.length;i++){
			double x = Math.random();
			x = (x * 9) + 1;
			int y = (int)x;
			array1[i] = y;
		}
			
		printArray(array1);	
               	for(int i = 0; i <= array1[i];i++){
			
			 if(array1[i] % 2 == 0){
                  		array1[i] = 0;
			 }
		}
		
		printArray(array1);
		for(int i = 0;i< array1[i];i++){
			if(array1[i]>5){
			        array1[i] = 11;
			}
		}		
		printArray(array1);	
			System.out.printf("%d", array1[i]);
		int array2[] = new int [array1.length];
		int i = 9;
			while(i> array2.length){
				i--;
			}
	}		printArray(array2[]);
			
				
				
				
	static void printArray(int arr[]){
                for(int i = 0; i< arr.length; i++){
			System.out.printf("%d " , arr[i]);

		}
		 

	}

}
