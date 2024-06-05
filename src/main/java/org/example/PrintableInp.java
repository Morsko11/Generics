package org.example;

public class PrintableInp<A,B> implements Printable<A,B>{



    @Override
    public A print(B B) {
        String str = (String) B;

        return (A) str;
    }
}
