package com.example.commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //속성
    private List<Product> list;

    //생성자
    //1. 클래스와 이름이 같다.
    //2. 반환 데이터 타입이 없다.
    //3. 여러개가 존재할 수 있다.


    //기능
    public void addList(List list) {
        this.list = list;
    }

    public void start() {
        System.out.println("실시간 커머스 플랫폼 - 전자제품");
        for (int i = 0; i < list.size(); i++) {
            int prdouctNumber = i + 1;
            Product foundProduct = list.get(i);
            String foundProductinfo = foundProduct.getShowProduct();
            System.out.println(prdouctNumber + ". " + foundProductinfo);
        }
        System.out.println("0. 종료");

        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();
        if (str == 0) {
            System.out.println("커머스 플랫폼을 종료합니다.");
        }
    }
}

