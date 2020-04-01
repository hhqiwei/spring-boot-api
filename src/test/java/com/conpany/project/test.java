package com.conpany.project;

import com.google.common.base.Joiner;

public class test {
    public static void main(String[] args) {
       test t=new test();
        System.out.println(t.soulation());
    }

    public String soulation() {

        Joiner joiner = Joiner.on(";").skipNulls();
        return joiner.join("Harry", null, "Ron", "Hermione");

    }
}
