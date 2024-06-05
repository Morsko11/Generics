package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* BankAcc<Integer,LocalDate> bankAcc = new BankAcc<>(123,"Name", LocalDate.now());
        BankAcc<String,Date> bankAcc1 = new BankAcc<>("123","Name", Date.from(Instant.now()));
*/
     /*   List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("wwww");
        for (int i = 0; i < list.size() ; i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
*/
     /*   Animal animal = new Cat();
        ((Cat)animal).catMetod();


Main main = new Main();
main.getClass();
if (main.getClass() == Main.class)
{
    System.out.println("true");
}
List<Object> list = new ArrayList<>();
list.add("1234");
list.add(21421);
        for (int i = 0; i < list.size() ; i++) {
            Integer.parseInt(list.get(i).toString());
        }
    }

    static void choistype(Animal animal){
    //    BengalCat bengalCat =(BengalCat)animal;
    //bengalCat.bengalMetod();
        ((BengalCat)animal).bengalMetod();
      //  ((Cat)).makeVoic();*/
        //  Paire<String> paire = new Paire();
        // paire.paireArray(new String[]{"24","421421"});

        //  Average average = new Average(new Double[]{1.1,12.2,3.3});
        //System.out.println(average.avg());

        //   PrintableInp<Integer,String> printableInp = new PrintableInp();
        // System.out.println(printableInp.print("42"));
        //   MetodDemo metodDemo = new MetodDemo();
        //     metodDemo.exzistIn(new Integer[]{3,2,3,4,5});


        MetodSch metodSch = new MetodSch();
        // metodSch.sch(5, new Integer[]{5,4,3,2,5,6,7,5,4,2,5});
      //  System.out.println(metodSch.sch2(new Integer[]{1, 1, 3, 4, 5, 6, 7}));
        System.out.println(Arrays.toString(metodSch.Shafl(new Integer[]{1,2,3,4,5,6,7,8,9})));
    }

}