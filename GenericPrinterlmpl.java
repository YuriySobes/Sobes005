package jjjj;


import jjjj.GenericPrinter;

import java.util.Collection;

public class GenericPrinterlmpl implements GenericPrinter<Printabl> {

    @Override
    public void printlt(Printabl toPrint) {
        System.out.println(toPrint.printMe());



      //  .forEach(System.out::println);
    }
    public void element <T extends Collection<Printabl>> {

    }



}


