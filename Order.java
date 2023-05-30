package personalProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Order {
static LinkedList<Product> Basket = new LinkedList<Product>();

static int waitNumber = 1;
static void mainMenuPage(ArrayList<Menu> menuList, ArrayList<Product> product) {
    System.out.println("\"메가커피에 오신 걸 환영합니다.\"");
    System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");

    System.out.println();
    System.out.println("[ MEGA COFFEE ]");

    for (int i = 0; i < menuList.size(); i++) {
        System.out.println(menuList.get(i).number + ". " + menuList.get(i).name + "    | " + menuList.get(i).explan);
    }

    System.out.println();
    System.out.println("[ ORDER MENU ]");
    System.out.println("6. Order      | 장바구니를 확인 후 주문합니다.");
    System.out.println("7. Cancel     | 진행 중인 주문을 취소합니다.");

    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();

    switch (select){
        case 1:
            productMenu(menuList, product, 0);
            break;
        case 2:
            productMenu(menuList, product, 1);
            break;
        case 3:
            productMenu(menuList, product, 2);
            break;
        case 4:
            productMenu(menuList, product, 3);
            break;
        case 5:
            productMenu(menuList, product, 4);
            break;
        case 6:
            showBasket(menuList, product);
            break;
        case 7:
            cancel(menuList, product);
            break;
    }
}

static void productMenu(ArrayList<Menu> menuList, ArrayList<Product> product, int number){
    System.out.println("MEGA COFFEE에 오신걸 환영합니다.");
    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");

    System.out.println();
    System.out.println("[ " + menuList.get(number).name + " MENU ]");
    product = menuList.get(number).products;
    for (int i = 0; i < product.size(); i++){
        System.out.println((i+1) + ". " + product.get(i).name + "   | W " + product.get(i).price + " | " + product.get(i).explan);
    }
    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();

    orderSelect(menuList, product, number, select-1);
}
static void orderSelect(ArrayList<Menu> menuList, ArrayList<Product> product, int selectMenu, int selectProduct){
    System.out.println(product.get(selectProduct).name + "   | W " + product.get(selectProduct).price + " | " + product.get(selectProduct).explan);
    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
    System.out.println("1. 확인      2. 취소");

    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();
    switch (select){
        case 1:
            Basket.add(product.get(selectProduct));
//            System.out.println(Basket.get(0).name);
            orderComplete(menuList, product, product.get(selectProduct).name);
        case 2:
            mainMenuPage(menuList, product);
    }
}
static void orderComplete(ArrayList<Menu> menuList, ArrayList<Product> product,String orderName){
    System.out.println(orderName + "(이)가 장바구니에 추가되었습니다.");
    System.out.println();
    mainMenuPage(menuList, product);
}

static void showBasket(ArrayList<Menu> menuList, ArrayList<Product> product){
    System.out.println("아래와 같이 주문하시겠습니까?");
    System.out.println();
    System.out.println("[ Orders ]");
    double total = 0.0;
    for(int i = 0; i < Basket.size(); i++){
        System.out.println(Basket.get(i).name + "  | W " + Basket.get(i).price + " | " + Basket.get(i).explan);
        total += Basket.get(i).price;
    }
    System.out.println();
    System.out.println("[ Total ]");
    System.out.println("W " + total);
    System.out.println();
    System.out.println("1. 주문    2. 메뉴판");

    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();

    switch (select){
        case 1:
            Basket.clear();
            orderComplete(menuList, product);
        case 2:
            mainMenuPage(menuList, product);
    }
}
static void orderComplete(ArrayList<Menu> menuList, ArrayList<Product> product){
    System.out.println("주문이 완료되었습니다!");
    System.out.println();
    System.out.println("대기번호는 [ " + waitNumber + " ]번 입니다.");
    waitNumber += 1;
    System.out.println("(3초 후 메뉴판으로 돌아갑니다.");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}
static void cancel(ArrayList<Menu> menuList, ArrayList<Product> product){
    System.out.println("진행하던 주문을 취소하시겠습니까?");
    System.out.println("1. 확인    2. 취소");
    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();

    switch (select){
        case 1:
            Basket.clear();
            cancelComplete(menuList, product);
        case 2:
            mainMenuPage(menuList, product);
    }
}
static void cancelComplete(ArrayList<Menu> menuList, ArrayList<Product> product){
    System.out.println("진행하던 주문이 취소되었습니다.");
    System.out.println();
    mainMenuPage(menuList, product);
}
}
