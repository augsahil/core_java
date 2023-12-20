package org.sahil;

public class Main {
    public static int k = 9999;
    public static int l = 55;// class level or global variable can have same name.but method level variabl can not.
    public static void main(String[] args) {
        int i;//this i can be accessed inside for loop and outside for loop as well
        for(i=0; i<9; i++){
            System.out.println(i);
        }
        System.out.println("********");
        System.out.println(i);// here we can access the above used i.

        for(int j = 0; j<8; j++){// this j can not be accessed outside the for loop.
            System.out.println("j = "+j);
        }

        int k = 89;
        {
            int l = 90;
            System.out.println("k = "+k + "and l = "+ l);//here we can access k but l can not be access outside the scope of {}
        }
        System.out.println("printing value of l from class lever variable: "+l);// since l of inner scope can not be accessed so, it'll take value of global or class level variable l.
        System.out.println("printing value of k from method lever variable: "+k);// since variable k of this method can be accessed so, it'll not take value of global or class level variable k.
        // if method level variable is present then it is preferred otherwise it will use global or class level variable.
        System.out.println(new Main().k);
    }
}