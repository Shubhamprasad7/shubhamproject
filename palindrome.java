import java.util.Scanner;

class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        String str=sc.next();
        String str1=str;
        String rev="";
        int len=str.length();
        for (int i=len-1; i>=0; i--) {
            rev=rev+str.charAt(i);
        }
          if (str1.equals(rev)) {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
      
      
    }
}