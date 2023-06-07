package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {
		
		String str = "We have a large invnetory of things in our warehouse falling"
				+ " in the category:apperal and the slightly more in demand"
				+ " category:makeup along with the category:furniture and ...";
		String str1 = "asfdsfgdfggdfgdfgg";
		int range=100;
		
		printCategories(str);
		reversePrint(str1);
		printEven(range);
	}

public static void printEven(int range) {
		// TODO Auto-generated method stub
		for(int i=0; i<=100; i+=2) {
			System.out.println("Even Number: "+i);
		}
	}

public static void reversePrint(String str) {
		// TODO Auto-generated method stub
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

//	public static void printCategories(String str) {
//		
//		String[] arr = str.split(":");
//		for(int i=1;i<arr.length;i++) {
//			int j = arr[i].indexOf(" ");
//			System.out.println(arr[i].substring(0, j));
//		}
//		
//	}
	
	public static void printCategories(String str) {
		
		int startIndex=0;
		while(true) {
			int found = str.indexOf("category:",startIndex);
			int start = found+9;
			int end = str.indexOf(" ",start);
			
			if(found!=-1) {
				System.out.println(str.substring(start, end));
				startIndex=end;
			}
			else
				break;
		}
		
	}

}
