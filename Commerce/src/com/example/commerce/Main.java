package com.example.commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //속성
        Product productA = new Product("Galaxy S24", 1200000,"최신 안드로이드 스마트폰", 50);
        Product productB = new Product("iPhone 16", 1350000,"Apple의 최신 스마트폰", 50);
        Product productC = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product productD = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 70);

        List<Product> products = new ArrayList<>();
        products.add(productA);
        products.add(productB);
        products.add(productC);
        products.add(productD);


        CommerceSystem commerceSystemA = new CommerceSystem();
        commerceSystemA.pickupList(products);

        commerceSystemA.start();

    }
}
