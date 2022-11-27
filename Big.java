
public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int a = 25;
	        int b = 70;
	        int c = 100;

	        if (a > b) {
	            if (a > c) {
	                System.out.println(a + " is Big");
	            } else {
	                System.out.println(c + " is big");
	            }
	        } else {
	            if (b > c) {
	                System.out.println(b + " is Big");
	            } else {
	                System.out.println(c + " is Big");
	            }
	        }
	int ans = a > b ? a > c ? a : c : b > c ? b : c;
	        System.out.println(ans + "is big");//20
	    }

	        	}

