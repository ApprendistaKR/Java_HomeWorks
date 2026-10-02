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

        Product foodA = new Product("사과", 2000, "청송사과", 300);
        Product foodB = new Product("배", 3000, "나주 배", 51);
        Product foodC = new Product("등심 1kg",200000, "한우", 20);
        Product foodD = new Product("삼겹살 200g", 5000, "스페인산", 30);

        List<Product> food = new ArrayList<>();
        food.add(foodA);
        food.add(foodB);
        food.add(foodC);
        food.add(foodD);

        Product clothA = new Product("검은 반팔 티", 5000, "검은색 단색 티셔츠", 612);
        Product clothB = new Product("찢어진 청바지", 15000, "무릎 부분이 찢어진 청바지", 112);
        Product clothC = new Product("검정 카디건", 10000, "기모 재질의 카디건", 225);
        Product clothD = new Product("MA-1 자켓", 150000, "검정색 항공 자켓", 117);

        List<Product> cloth = new ArrayList<>();
        cloth.add(clothA);
        cloth.add(clothB);
        cloth.add(clothC);
        cloth.add(clothD);


        Category categoryEle = new Category("전자 제품", products);
        Category categoryFood = new Category("식품", food);
        Category categoryCloth = new Category("의류", cloth);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(categoryEle);
        categoryList.add(categoryFood);
        categoryList.add(categoryCloth);








        CommerceSystem commerceSystemA = new CommerceSystem(categoryList);

        commerceSystemA.start();

    }
}
