package com.example.commerce;

import java.util.List;

public class Category {
    //속성
    private String name;
    private List<Product> list;

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 여러개가 존재할 수 있다.
    //3. 반환 데이터 타입이 없다.
    public Category(String name, List<Product> list) {
        this.name = name;
        this.list = list;
    }

    //기능
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return this.list;
    }

    public void setProducts(List<Product> list) {
        this.list = list;
    }
}
