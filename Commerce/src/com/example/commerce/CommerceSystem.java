package com.example.commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //속성
    private List<Category> categoryList;
    private Scanner input = new Scanner(System.in);

    private Category selectedCategory;
    private int command;

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    //기능

    public void start() {
        while (true) {
            // 1. 카테고리 목록 출력
            for (int i = 0; i < categoryList.size(); i++) {
                int categoryNumber = i + 1;
                Category foundCategory = categoryList.get(i);
                String foundCategoryInfo = foundCategory.getName();
                System.out.println(categoryNumber + ". " + foundCategoryInfo);
            }
            System.out.println("0. 종료");

            // 2. 입력값 받기
            this.command = input.nextInt();

            // 3. 카테고리 찾기
            if (command == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            } else if (0 < command && command <= categoryList.size()) {
                this.selectedCategory = categoryList.get(command - 1);
                String selectedCategoryName = selectedCategory.getName();
                System.out.println(selectedCategoryName + "카테고리");
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 4. 상품 목록 출력
            List<Product> product = this.selectedCategory.getProducts();
            for (int i = 0; i < product.size(); i++) {
                int productsNumber = i + 1;
                Product foundProduct = product.get(i);
                String foundProductInfo = foundProduct.getShowProduct();
                System.out.println(productsNumber + ". " + foundProductInfo);
            }
            System.out.println("0. 뒤로가기");

            // 5. 입력값 받기
            this.command = input.nextInt();

            // 6. 상품 찾기
            if (0 < command && command <= product.size()) {
                Product selectedProduct = product.get(command - 1);
                String selectedProductInfo = selectedProduct.getShowProduct();
                System.out.println("선택한 상품: " + selectedProductInfo);
                break;
            } else if (command == 0) {
                System.out.println("뒤로 돌아갑니다.");
            }
        }
    }
}
