public class Demo26 {
    public static void main(String[] args) {
        short s = 5;
        myMethod(s,s);
    }
    
    static void myMethod(int x, float f){
    	System.out.println("A. myMethod(int,float)");
    }
    
    static void myMethod(long x, long f){
    	System.out.println("B. myMethod(long,long)");
    } 
    
    static void myMethod(long x, double f){
    	System.out.println("C. myMethod(long,double)");
    }        
}