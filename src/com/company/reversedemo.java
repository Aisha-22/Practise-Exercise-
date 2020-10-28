package com.company;

public class reversedemo {

    public void runString() {

        String s = "Aisha";
        String t = "";

//        'For Loop': As long as i>0 keep printing Aisha
        for(int i = s.length()-1 ; i >= 0; i--) {

// String Concatenation
            //The + operator can be used between strings to combine them. This is called concatenation:
            t = t + s.charAt(i);

            System.out.println(t);

    }
//if else conditions usage in Java

    }

}
