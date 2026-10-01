package com.example.commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product productA = new Product("Galaxy S24", 1200000,"최신 안드로이드 스마트폰", 50);
        Product productB = new Product("iPhone 16", 1350000,"Apple의 최신 스마트폰", 50);
        Product productC = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product productD = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 70);

        List<Product> products = new ArrayList<>();
        products.add(productA);
        products.add(productB);
        products.add(productC);
        products.add(productD);

        Product productE = new Product("사과", 2000, "청송사과", 300);
        Product productF = new Product("배", 3000, "나주 배", 51);
        Product productG = new Product("등심 1kg",200000, "한우", 20);
        Product productH = new Product("삼겹살 200g", 5000, "스페인산", 30);


        List<Product> food = new ArrayList<>();
        food.add(productE);
        food.add(productF);
        food.add(productG);
        food.add(productH);



        Category categoryEle = new Category("전자 제품", products);
        Category categoryFood = new Category("식품", food);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(categoryEle);
        categoryList.add(categoryFood);



//        List<List<Product>> list = new ArrayList<>();
//        list.add(products);



        CommerceSystem commerceSystemA = new CommerceSystem(products,categoryList);

        commerceSystemA.start();

    }
}
