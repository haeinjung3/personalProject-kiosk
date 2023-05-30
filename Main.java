package personalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        Menu coffee = new Menu(1, "coffee", "향긋한 커피");
        Menu tea = new Menu(2, "tea", "깊은 맛의 차");
        Menu adeJuice = new Menu(3, "ade&juice", "시원한 에이드와 주스");
        Menu smoothie = new Menu(4, "smoothi&frappe", "과일과 우유를 넣은 스무디와 프라페");
        Menu dessert = new Menu(5, "dessert", "맛있는 디저트");
        menuList.add(coffee);
        menuList.add(tea);
        menuList.add(adeJuice);
        menuList.add(smoothie);
        menuList.add(dessert);

        Product Americano = new Product(1, "Americano", "메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피.", 2.0);
        Product Espresso = new Product(2, "Espresso", "메가MGC커피 원두의 향미를 온전히 즐길 수 있는 에스프레소", 2.0);
        Product GelatoAffogato = new Product(3, "Gelato Affogato", "바닐라 젤라또에 진한 에스프레소를 부어 만든 디저트", 4.5);
        Product VanillaLatte = new Product(4, "Vanilla Latte", "바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼.", 3.9);
        Product CaffeLatte = new Product(5, "Caffe Latte", "진한 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 라떼.", 3.5);
        coffee.addProducts(Americano);
        coffee.addProducts(Espresso);
        coffee.addProducts(GelatoAffogato);
        coffee.addProducts(VanillaLatte);
        coffee.addProducts(CaffeLatte);
        Product GreenTea = new Product(1, "Green Tea", "고소한 감칠맛과 부드러운 목넘김으로 산뜻하게 마음을 위로하는 국내산 녹차.", 3.5);
        Product PeachIcedTea = new Product(2, "Peach Iced Tea", "깊은 맛의 홍차와 달콤한 복숭아의 은은한 향이 어우러진 시원한 여름철 인기 음료.", 3.0);
        Product CitronTea = new Product(3, "CitronTea", "비타민이 가득 든 상큼달콤한 유자를 듬뿍 넣어 향긋한 즐거움을 전하는 과일티.", 2.5);
        Product Chamomile = new Product(4, "Chamomile", "마음을 진정 시켜주는 산뜻한 풀내음을 느낄 수 있는 허브티.", 3.4);
        Product PeppermintTea = new Product(5, "Peppermint Tea", "멘톨향의 묵직한 청량감, 상쾌한 맛과 향이 인상적인 허브티.", 3.9);
        tea.addProducts(GreenTea);
        tea.addProducts(PeachIcedTea);
        tea.addProducts(CitronTea);
        tea.addProducts(Chamomile);
        tea.addProducts(PeppermintTea);
        Product LemonAde = new Product(1, "Lemon Ade", "시트러스향 가득한 레몬의 상큼함과 톡쏘는 탄산의 상쾌함이 만난 청량 에이드.", 3.0);
        Product GrapefruitAde = new Product(2, "Grapefruit Ade", "자몽의 달콤쌉싸름한 맛과 탄산의 톡쏘는 목넘김이 어우러진 트로피컬 에이드.", 3.0);
        Product UnicornMagicAde = new Product(3, "Unicorn Magic Ade", "섞으면 마법처럼 색이 변하는 재미에 레몬의 상큼함으로 입까지 즐거운 이색 에이드.", 3.2);
        Product CherryCoke = new Product(4, "Cherry Coke", "체리의 새콤함과 청량감을 동시에 즐길 수 있는 환상적인 에이드.", 2.9);
        Product MEGAAde = new Product(5, "MEGA Ade", "상큼한 레몬, 상쾌한 라임, 달콤쌉싸름한 자몽의 3색 맛을 한데 어우른 메가MGC커피 시그니처 에이드.", 3.0);
        adeJuice.addProducts(LemonAde);
        adeJuice.addProducts(GrapefruitAde);
        adeJuice.addProducts(UnicornMagicAde);
        adeJuice.addProducts(CherryCoke);
        adeJuice.addProducts(MEGAAde);
        Product CookieFrappe = new Product(1, "Cookie Frappe", "바삭하고 달콤한 오레오와 고소한 우유, 부드러운 바닐라향의 조화를 느낄 수 있는 프라페.", 4.0);
        Product RealChocolateFrappe = new Product(2, "Real Chocolate Frappe", "진한 초코소스와 부드러운 바닐라향의 만남으로 질리지 않는 달콤함을 완성한 프라페.", 3.9);
        Product StrawberryYogurtSmoothie = new Product(3, "Strawberry Yogurt Smoothie", "요거트의 상큼함과 딸기의 상큼함을 상냥하게 어우른 상큼 스무디.", 4.4);
        Product CoffeeFrappe = new Product(4, "Coffee Frappe", "바삭한 쿠키와 부드러운 바닐라에 향긋한 에스프레소를 섞어 만든 힐링 프라페.", 4.5);
        Product PlainPongcrush = new Product(5, "Plain Pongcrush", "우유에 죠리퐁 씨리얼이 믹싱 된 얼음을 갈아 만든 시원한 프라페음료", 5.0);
        smoothie.addProducts(CookieFrappe);
        smoothie.addProducts(RealChocolateFrappe);
        smoothie.addProducts(StrawberryYogurtSmoothie);
        smoothie.addProducts(CoffeeFrappe);
        smoothie.addProducts(PlainPongcrush);
        Product MeatPie = new Product(1, "Meat Pie", "풍미 가득한 치즈와 바비큐 소스로 맛을 낸 소고기를 듬뿍 담은 미트파이", 3.5);
        Product Croissant = new Product(2, "Croissant", "바삭하고 부드러운 식감에 고소한 버터향을 가득 담은 베이커리 메뉴.", 2.0);
        Product MacadamiaCookie = new Product(3, "Macadamia Cookie", "고소한 마카다미아를 넣어 만든 메가MGC커피 시그니처 쿠키.", 1.5);
        Product PlainCroffle = new Product(4, "Plain Croffle", "버터풍미가 가득한 크루와상의 바삭함과 와플의 부드러움을 합친 겉바속촉 베이커리 메뉴.", 2.0);
        Product CroqueMonsieur = new Product(5, "Croque Monsieur", "고소한 식빵 사이에 햄과 치즈를 샌드하고, 빵 윗면에 멜팅치즈를 토핑해 든든한 한끼를 선물하는 샌드위치.", 1.8);
        dessert.addProducts(MeatPie);
        dessert.addProducts(Croissant);
        dessert.addProducts(MacadamiaCookie);
        dessert.addProducts(PlainCroffle);
        dessert.addProducts(CroqueMonsieur);

        ArrayList<Product> product = menuList.get(0).products;
//출력 부분
        Order.mainMenuPage(menuList, product);
    }

}
