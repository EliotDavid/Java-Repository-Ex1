package Extend;

import com.sun.security.jgss.GSSUtil;

public class Child extends Parent{

    void walk(){
        System.out.println("자식이 걷는다");
    }

    void run(){
        System.out.println("자식이 달린다");
    }
    
    void eat(){
        System.out.println("자식이 먹는다");
    }
}
