package com.example.commerce;

public class Customer {
    //속성
    private String name;
    private String email;
    private int grade;

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public Customer(String name, String email, int grade) {
        this.name = name;
        this.email = email;
        this.grade = grade;
    }
    //기능
}
