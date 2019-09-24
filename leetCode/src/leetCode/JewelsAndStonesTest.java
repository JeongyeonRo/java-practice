package leetCode;

public class JewelsAndStonesTest {


	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		
		int count = 0;
		
		for(int i=0; i<jewels.length(); i=i++) {
			
			char test = jewels.charAt(i);
			//System.out.println(test); 
			
			for(int j=0; j<stones.length(); j++) {
				//System.out.println(stones.charAt(j));
				if(test == stones.charAt(j)){					
					count = count + 1;
				}
			}
		}
		
		System.out.println(count);
	
	}
	

}
