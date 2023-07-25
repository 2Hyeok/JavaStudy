package oop.overriding;

public interface Market { // 인터페이스는 공통 적으로 사용하고자 하는 공통된 기능을 하나로 묶을 수 있음
    public void stack(String product, int quantity, int value);
    public void buy(String product);
}
