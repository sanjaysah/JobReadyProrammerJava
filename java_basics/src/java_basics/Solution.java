package java_basics;

class Solution {
    public int numberOfSteps(int num) {
        int minuscount=0, dividecount=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                dividecount++;
            }
            else{
                num--;
                minuscount++;
            }

        }
        return (minuscount+dividecount);
        }
    public static void main(String[] args) {
    	Solution s1 = new Solution();
    	int count = s1.numberOfSteps(123);
    	System.out.println(count);
    }
}
