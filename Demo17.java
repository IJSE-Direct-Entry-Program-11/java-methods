public class Demo17 {
    public static void main(String[] args) {
        byte myByte = 10;
        myMethod1(myByte);
        // myMethod1(10);
        myMethod1((byte) 10);
        // myMethod2(20);
        myMethod2((short) 20);
        myMethod3('A');
        // myMethod3(65);
        myMethod3((char) 65);
        myMethod4(40);
        myMethod5(10);
        myMethod6(10);
        // myMethod6(10.25);
        myMethod6(10.25f);
        myMethod6((float) 10.25);
        myMethod7(15);
        myMethod7(25.2);
    }

    static void myMethod1(byte myByte) {
        System.out.println("myMethod1()");
    }

    static void myMethod2(short myShort) {
        System.out.println("myMethod2()");
    }

    static void myMethod3(char myChar) {
        System.out.println("myMethod3()");
    }

    static void myMethod4(int myInt) {
        System.out.println("myMethod4()");
    }  
    
    static void myMethod5(long myLong) {
        System.out.println("myMethod5()");
    }   
    
    static void myMethod6(float myFloat) {
        System.out.println("myMethod6()");
    } 
    
    static void myMethod7(double myDouble) {
        System.out.println("myMethod7()");
    }     
}