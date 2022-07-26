package com.will.MTDlearning;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FooRepo implements FooInterface{

    List<Foo> foos = new ArrayList<>();

    public List<Foo> getAllFoo() {
        return foos;
    }

    public void addFoo(Foo foo){
        foos.add(foo);
    }

    public Foo getFooById(String name) {
        for (Foo f : foos){
            if (name.equals(f.getName())){
                return f;
            }
        }
        return null;
    }
}
