package leetCode;

public class JewelsAndStones {
	
	public int numJewelsInStones(String J, String S) {
		int numJewelsInStones = 0;
		
		for(int i=0; i<J.length(); i=i+1) {
			char test = J.charAt(i);
			for(int j=0; j<S.length(); j++) {
				if(test == S.charAt(j)){					
					numJewelsInStones = numJewelsInStones + 1;
				}
			}
		}
		
		return numJewelsInStones;
        
    }

}
