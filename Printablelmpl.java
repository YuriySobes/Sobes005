package jjjj;

import jjjj.Printabl;

public class Printablelmpl implements Printabl {

    private final String filed;

    public Printablelmpl(String filed) {
        this.filed = filed;
    }


    public String printMe(){
    return "Some text"+ filed;
    }



}
