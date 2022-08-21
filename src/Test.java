public class Test {

    public static void main(String[] args) {
        System.out.println(isPalindrome("rotazor"));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int index1=0;
        int index2=str.length()-1;
        boolean isPal=false;
        while(index1 <= index2){
            if(str.charAt(index1) == str.charAt(index2)){
                index1++;
                index2--;
                isPal=true;
            }else {
                return false;
            }
        }


        return isPal;
    }
}
