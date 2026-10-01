package com.example.commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //속성
    private List<Product> list;
    private List<Category> listB;
    private Scanner input = new Scanner(System.in);

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.
    public CommerceSystem(List<Product> list,List<Category> listB) {
        this.list = list;
        this.listB = listB;
    }



    //기능

    public void start() {
        System.out.println("실시간 커머스 플랫폼");
        int i = 1;
        for (Category category : listB) {
            System.out.println(i+ " ." + category.listName());
            i++;
        }

//        for (int i = 0; i < list.size(); i++) {
//            int prdouctNumber = i + 1;
//            Product foundProduct = list.get(i);
//            String foundProductinfo = foundProduct.getShowProduct();
//            System.out.println(prdouctNumber + ". " + foundProductinfo);
//        }
        System.out.println("0. 종료");


        int num = input.nextInt();
        if (num == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        } else if (num == 1) {
            i = 1;
            for (Product ele : list) {
                System.out.println(i + " ." + ele.getShowProduct());
                i++;
            }
//            for (int a = 0; a < list.size(); a++) {
//            int prdouctNumber = a + 1;
//            Product foundProduct = list.get(a);
//            String foundProductinfo = foundProduct.getShowProduct();
//            System.out.println(prdouctNumber + ". " + foundProductinfo);
        }
        }
    }

