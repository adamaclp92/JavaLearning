package com.adamrago;

 interface Accessible { //package-private
    int SOME_CONSTANT = 100;  //public
    public void methodA();
    void methodB();  //public
    boolean methodC();  //public
}
