package com.example.commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //속성
    private List<Category> categoryList;
    private Scanner input = new Scanner(System.in);

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    //기능

    public void start() {
        int num = 0;
        int num2 = 0;
        do {
            System.out.println("[실시간 커머스 플랫폼 메인]");
            for (int i = 0; i < categoryList.size(); i++) {
                int categoryNumber = i + 1;
                Category foundCategory = categoryList.get(i);
                String foundCategoryInfo = foundCategory.getName();
                System.out.println(categoryNumber + ". " + foundCategoryInfo);
            }
            System.out.println("0. 종료");
            num = input.nextInt();
            if (num == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
            } else if (num > 0 && num <= categoryList.size()) {
                Category selectedCategory = categoryList.get(num - 1);
                do {

                    System.out.println("[" + selectedCategory.getName() + " 카테고리]");
                    List<Product> product = selectedCategory.getProducts();

                    for (int i = 0; i < product.size(); i++) {
                        int productsNumber = i + 1;
                        Product foundProduct = product.get(i);
                        String foundProductInfo = foundProduct.getShowProduct();
                        System.out.println(productsNumber + ". " + foundProductInfo);
                    }
                    System.out.println("0. 뒤로가기");
                    num2 = input.nextInt();
                    if (num2 > 0 && num2 <= product.size()) {
                        Product foundProduct = product.get(num2 - 1);
                        System.out.println("선택한 상품: " + foundProduct.getShowProduct());
                        return;

                    } else if (num2 == 0) {
                        System.out.println("뒤로 돌아갑니다.");
                    }
                } while (num2 != 0);
            }

        } while (num != 0);
    }
}


