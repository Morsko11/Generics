package org.example;

import java.time.LocalDate;

public class BankAcc<A,C>{
    A schet;
   String onername;
    C date;

    @Override
    public String toString() {
        return "BankAcc{" +
                "schet='" + schet + '\'' +
                ", onername='" + onername + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public A getSchet() {
        return schet;
    }

    public void setSchet(A schet) {
        this.schet = schet;
    }

    public String getOnername() {
        return onername;
    }

    public void setOnername(String onername) {
        this.onername = onername;
    }

    public C getDate() {
        return date;
    }

    public void setDate(C date) {
        this.date = date;
    }

    public BankAcc(A schet, String onername, C date) {
        this.schet = schet;
        this.onername = onername;
        this.date = date;
    }
    public void wh(){
        System.out.println(schet.getClass().getSimpleName());
        System.out.println(onername.getClass().getSimpleName());
        System.out.println(date.getClass().getSimpleName());

    }
}
