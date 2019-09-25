package leetCode;

public class Main {

	public static void main(String[] args) {
		
		//771. JewelsAndStones
		JewelsAndStones js = new JewelsAndStones();
		
		System.out.println(
				"numJewelsInStones1 : " + js.numJewelsInStones("aA","aAAbbbb"));
		System.out.println(
				"numJewelsInStones2 : " + js.numJewelsInStones("z","ZZ"));
		
		//709. ToLowerCase
		ToLowerCaseTest tlc = new ToLowerCaseTest();
		
		System.out.println(
				"Output : " + tlc.toLowerCase("Hello Java"));
		System.out.println(
				"Output : " + tlc.toLowerCase("Here"));
		

	}
}
