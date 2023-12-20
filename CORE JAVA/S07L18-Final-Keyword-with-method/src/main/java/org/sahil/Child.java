package org.sahil;

public class Child extends Parent{// we can not extends/inherit FinalParent class because it is marked as final class.
    @Override
    public void India(){
        System.out.println("India is great and Indians are nice");
    }

//    public void USA(){// we can not Override this method because this is final method in parent class.
//        System.out.println("USA is great and People are nice");
//    }
}
