package multiThread;

public class CookingSection {

	public static void main(String args[]) {
		
		try{
			
			RamenCook ramenCook = new RamenCook(Integer.parseInt(args[0]));
						
			new Thread(ramenCook, "A").start();
			new Thread(ramenCook, "B").start();
			new Thread(ramenCook, "C").start();
			new Thread(ramenCook, "D").start();

			System.out.println(ramenCook);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

class RamenCook implements Runnable{
	
	private int ramenCount;
	private String[] burners = {"_","_","_","_"};

	public RamenCook(int count) {
		ramenCount = count;
	}

	@Override
	public void run() {
		while(ramenCount > 0) {
			
			synchronized(this) {
				ramenCount --;
				System.out.println(
						Thread.currentThread().getName() + ":" + ramenCount + "개 남음");
			}
			
			for (int i = 0; i < burners.length; i++) {
				if(!burners[i].equals("_"))
					continue;
				
				//한번에 한 스레드만 작동할 수 있도록 직렬화
				synchronized(this) {
					if(burners[i].equals("_")) {
						burners[i] = Thread.currentThread().getName();
						System.out.println("%n" + Thread.currentThread().getName() + 
								": [" + (i+1) + "]번 버너 ON");
						showBurners();
					}
				}
				
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				synchronized(this) {
					burners[i] = "_";
					System.out.println("%n" + Thread.currentThread().getName() + ": [" + 
					(i+1) + "] 번 버너 OFF");
					showBurners();
				}
				break;
			}
			
			try {
				Thread.sleep(Math.round(1000 * Math.random()));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	private void showBurners() {
		String stringToPrint = "                                     ";
		for(int i =0; i < burners.length; i++) {
			stringToPrint = (" " + burners[i]) + stringToPrint;
		}
		System.out.println(stringToPrint);
	}
	
}