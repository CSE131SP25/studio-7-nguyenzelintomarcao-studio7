package studio7;

/**
 * @param int n - the number of sides on the die
 * @return int result - a random int from rolling the die
 */

public class Die {

		private int n;
		
		public Die (int initn) {
			n = initn;
		}
		
		public int result () {
			
			return (int) (Math.random()*this.n)+1;
		}


	public static void main(String[] args) {
		Die d20 = new Die (20);
		System.out.println(d20.result());
	
	
	}

}
