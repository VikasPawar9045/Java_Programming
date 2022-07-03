/*
 * 05. Create two interfaces with the same method (same signature) in both the interfaces.
 * Implement these two interfaces in one class. Call the method.
 */

package com.interfaces;

//interface 1
interface Hello_5 {
    void sameMethod();
}

//interface 2
interface Hello_05 {
    void sameMethod();
}

//Implemented these two interfaces in one class
class TwoInterfaceSameMethod implements Hello_5, Hello_05 {
    @Override
    public void sameMethod() {
        System.out.println("This is same method in both the interfaces");
    }

    //main method
    public static void main(String[] args) {
        TwoInterfaceSameMethod if5 = new TwoInterfaceSameMethod();
        if5.sameMethod();
    }
}
