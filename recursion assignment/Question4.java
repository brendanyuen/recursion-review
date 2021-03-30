 public class Question4 {
    public static void main (String[] args) {
        Question4 pal=new Question4();
        System.out.println(pal.isPalindrome("Hello"));
        System.out.println(pal.isPalindrome("kayak"));
    }
    private static String str="";
    private static String str2="";
    public boolean isPalindrome(String word)  {
        
        if(word.substring(0,1).equals(word.substring(word.length()-1))) return true;
        
        else return false;
        
        
    }
}

