package com.spring;

public class Member {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }*/

    public static void main(String[] args) {
        Member member=new Member();
        member.setId(123);
    }
}
