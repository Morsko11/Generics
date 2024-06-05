package org.example;

public class ChetInpo<B extends Number> implements Chet<B> {
    @Override
    public void met(Number[] b) {
        int a = b[0].intValue();
        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}
