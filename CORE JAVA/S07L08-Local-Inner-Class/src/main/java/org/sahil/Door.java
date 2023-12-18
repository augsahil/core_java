package org.sahil;

public class Door {
    public boolean isLocked(String key){
        class Lock{
            public boolean isLocked(String key){
                if(key.equals("qwerty")){
                    return false;
                }
                else {
                    return true;
                }
            }
        }
        return new Lock().isLocked(key);//Anonymous class, as we are not storing the object in any reference.
    }
}
