package com.bptn.course._08_inheritance;

public class Member extends Registration {
    private int id;
    public Member(String name, int id) {
       super(name);
       this.id = id;
    }
    public String toString() {
       return super.toString() + " " + id;
    }
}


