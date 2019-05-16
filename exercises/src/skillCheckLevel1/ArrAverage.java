package skillCheckLevel1;

public class ArrAverage {
	public static void main(String[] args) {
		 int arr [] = {1,2,3,4};
		 double answer = 0;
	      int sum = 0;
	      for(int i=0; i<arr.length; i=i+1){
	          int su = arr[i];
	          sum = sum + su;
	      }
	      
	      System.out.println(sum);
	      System.out.println(arr.length);
	      answer = (double)sum/arr.length;
	      System.out.println(answer);
	      
	  }
		
	}


