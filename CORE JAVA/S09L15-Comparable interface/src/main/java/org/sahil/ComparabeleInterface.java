package org.sahil;

import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
    private String name;
    public Name(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int compareTo(Name obj){
        if(name.length() == obj.name.length()){
            return 0;
        }
        else if(name.length() > obj.name.length()){
            return 1;
        }else{
            return -1;
        }
    }

}
public class ComparabeleInterface {
    public static void main(String[] args){
        List<Object> elements = new LinkedList<>();
        elements.add(new Name("sahil"));
        elements.add(new Name("kumar"));
        elements.add(new Name("sah"));
        elements.add(new Name("sahi"));
        elements.add(new Name("sahil kumar"));

        System.out.println(elements);
        elements.sort(null);
        System.out.println(elements);
    }
}
