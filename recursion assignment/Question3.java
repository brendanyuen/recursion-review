public class Question3 {
    public static void main (String[] args) {
        Question3 rever=new Question3();
        System.out.println(rever.reverse("Hello"));
    }
    private static String str="";
    public String reverse (String word) {

        if(word.length()>0){
            str+=word.substring(word.length()-1);
            return reverse(word.substring(0,word.length()-1));
        }

        if (word.length()==0){
            return str;
        }

        return"";

    }
}

