package com.example.commerce;

public class Product {
    //속성
    // name: 제품 이름
    // price: 제품 가격
    // explanation: 제품 설명
    // stock: 제품 재고
    private String name;
    private int price;
    private String explanation;
    private int stock;
    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public Product(String name, int price, String explanation, int stock) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
        this.stock = stock;
    }

    //기능
    public void showProduct() {
        System.out.println(name + " | " + price + "원" + " | " + explanation);

    }

    public String getShowProduct() {
        return (name + " | " + price + "원" + " | " + explanation);
    }

}
