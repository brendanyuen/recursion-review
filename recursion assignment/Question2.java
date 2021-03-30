class Question2 {
    public static void main (String[] args) {
        triangle(5);
        reverseTriangle(5);
    }
    public static void printStars(int n) {
        
         for (int i = 0; i < n; i++) {
          System.out.print("*");
       }
        System.out.println("");
    }
     public static void triangle(int n){
         if(n>0){
       printStars(n);
       n--;
       triangle(n);
    }
    }
    private static int x=0;
    public static void reverseTriangle(int n){
        if(x<=n){
            printStars(x);
            x++;
            reverseTriangle(n);
            
        }
       
    }
}