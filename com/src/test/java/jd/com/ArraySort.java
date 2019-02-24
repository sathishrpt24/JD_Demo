package jd.com;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int[] myarray = new int[5];
		
		myarray[0] = 2;
		myarray[1] = 1;
		myarray[2] = 4;
		myarray[3] = 4;
		myarray[4] = 6;
						
		
		for(int i = 0; i<myarray.length;i++) {
			
			int temp;
			
			for(int j=i+1; j<myarray.length;j++) {
				
				if(myarray[i]>myarray[j]) {
					
					temp = myarray[i];
					
					myarray[i] = myarray[j];
					
					myarray[j] = temp;
					
				}
				
			
				
			}
		}
		for(int x: myarray) {
			
			System.out.println(x);
		}
		
	}

}
