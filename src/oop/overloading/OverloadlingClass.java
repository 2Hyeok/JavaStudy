package oop.overloading;

public class OverloadlingClass {
    public OverloadlingClass() {
        getName();
        getName("홍길동");
        getName("홍길동", 24);
    }
    
    public void getName() {
        System.out.println("이름 : 김유신");
        System.out.println();
    }
    
    public void getName(String name) {
        System.out.println("이름 : " + name);
        System.out.println();
    }

    public void getName(String name, int age) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        new OverloadlingClass();
    }
}
