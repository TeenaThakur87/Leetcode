public class Palindrome {
        public static boolean isPalindrome(int x) {
            int k=x;
            int f=0;
            int l=0;
            
            while(x>0){
                f=x%10;
                l=(l*10)+f;
                x=x/10;
            }
            if(l==k){
                return true;
            }
            else{
                return false;
            }
            
        }
        public static void main (String [] args){
            
           System.out.println( isPalindrome(1221));
        }
    }

