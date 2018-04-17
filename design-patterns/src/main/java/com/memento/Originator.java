package com.memento;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Originator.java
//  @ Date : 2016/9/30
//  @ Author : 
//
//

public class Originator {
    public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
        state = memento.state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void show() {
        System.out.println("当前状态为    "+state);
    }
}