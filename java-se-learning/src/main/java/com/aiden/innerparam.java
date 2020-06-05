package com.aiden;

public class innerparam {
    public static void main(String[] args) {
        Change change= method();
        change.change();
    }
    public static Change method(){
        final int a=10;
        class inner implements Change{
            @Override
            public void change() {
                System.out.println("a"+a);
            }
        }
        Change in=new inner();
        return in;
    }
}
interface Change{
    void change();
}