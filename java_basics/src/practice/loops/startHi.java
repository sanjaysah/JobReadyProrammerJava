package practice.loops;

public class startHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	public boolean startHi(String str) {
		  if(str.length()>=2)
		    return false;
		  return ((str.substring(0,2)).equals("hi"));
		}

}
