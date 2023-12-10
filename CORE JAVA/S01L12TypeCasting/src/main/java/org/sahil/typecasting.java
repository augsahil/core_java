package org.sahil;

/*
IMPLICIT CASTING(WIDENING): Byte(8bit)->short(16bit)->int(32bit)->long(64bit)->float(32bit)->double(64bit)
EXPLICIT CASTING(NARROWING): double(64bit)->float(32bit)->long(64bit)->int(32bit)->short(16bit)->Byte(8bit)

IF IMPLICIT CASTING IS THERE THEN TYPECASTING IN JAVA IS POSSIBLE without any concern, IF EXPLICIT CASTING be cautious.
 */

public class typecasting {
    public static void main(String[] args) {
        //IMPLICIT CASTING
        short a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        //EXPLICIT CASTING
        short a1 = 100;
        byte b1 = (byte) a1;
        System.out.println(a1);
        System.out.println(b1);

        //EXPLICIT CASTING
        short a2 = 200;
        byte b2 = (byte) a2;
        System.out.println(a2);
        System.out.println(b2);

    }
}
