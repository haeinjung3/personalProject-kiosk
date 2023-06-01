package personalProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Order {
static LinkedList<Product> Basket = new LinkedList<Product>();

static int waitNumber = 1;
static void mainMenuPage(ArrayList<Menu> menuList) {
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

    ArrayList<Product> product;

    switch (select){
        case 1:
            productMenu(menuList, 0);
            break;
        case 2:
            productMenu(menuList, 1);
            break;
        case 3:
            productMenu(menuList, 2);
            break;
        case 4:
            productMenu(menuList, 3);
            break;
        case 5:
            productMenu(menuList, 4);
            break;
        case 6:
            showBasket(menuList);
            break;
        case 7:
            cancel(menuList);
            break;
    }
}

static void productMenu(ArrayList<Menu> menuList, int selectMenu){
    System.out.println("MEGA COFFEE에 오신걸 환영합니다.");
    System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요");

    System.out.println();
    System.out.println("[ " + menuList.get(selectMenu).name + " MENU ]");

    ArrayList<Product> products = new ArrayList<Product>();
    products = menuList.get(selectMenu).productList;

    for (int i = 0; i < products.size(); i++){
        System.out.println((i+1) + ". " + products.get(i).name + "   | W " + products.get(i).price + " | " + products.get(i).explan);
    }
    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();

    orderSelect(menuList, selectMenu, select-1);
}
static void orderSelect(ArrayList<Menu> menuList, int selectMenu, int selectProduct){
    Product product = menuList.get(selectMenu).productList.get(selectProduct);

    System.out.println(product.name + "   | W " + product.price + " | " + product.explan);
    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
    System.out.println("1. 확인      2. 취소");

    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();
    switch (select){
        case 1:
            Basket.add(product);
//            System.out.println(Basket.get(0).name);
            orderComplete(menuList, product.name);
        case 2:
            mainMenuPage(menuList);
    }
}
static void orderComplete(ArrayList<Menu> menuList,String orderName){
    System.out.println(orderName + "(이)가 장바구니에 추가되었습니다.");
    System.out.println();
    mainMenuPage(menuList);
}

static void showBasket(ArrayList<Menu> menuList){
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
            orderComplete(menuList);
        case 2:
            mainMenuPage(menuList);
    }
}
static void orderComplete(ArrayList<Menu> menuList){
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
static void cancel(ArrayList<Menu> menuList){
    System.out.println("진행하던 주문을 취소하시겠습니까?");
    System.out.println("1. 확인    2. 취소");
    Scanner sc = new Scanner(System.in);
    int select = sc.nextInt();

    switch (select){
        case 1:
            Basket.clear();
            cancelComplete(menuList);
        case 2:
            mainMenuPage(menuList);
    }
}
static void cancelComplete(ArrayList<Menu> menuList){
    System.out.println("진행하던 주문이 취소되었습니다.");
    System.out.println();
    mainMenuPage(menuList);
}
}
