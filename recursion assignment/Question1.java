class Question1{


public static void main(String [] args){
   System.out.println(GCF(252,105)); 
    
    
}


public static int GCF(int n, int m){
    
    if(n>m){
     n=n-m;
     return GCF(n,m);
    }
    else if(m>n){
     m-=n;
     return GCF(n,m);
    }
    else 
    return n;
    
}
}