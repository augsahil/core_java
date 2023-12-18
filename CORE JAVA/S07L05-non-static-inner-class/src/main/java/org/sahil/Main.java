package org.sahil;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.shopStatus();
        shop.getLock().setLocking(false);
        shop.shopStatus();

//        shop.getPrivateLock().setLocking(false) // we cant access to private inner class outside of outer class.
    }
}