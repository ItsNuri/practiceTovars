import java.security.cert.CertificateRevokedException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Tovar tovar1 = new Tovar("Fanta", 70, "Napitok", "**");
        Tovar tovar2 = new Tovar("хлеб", 100, "Food", "***");
        Tovar tovar3 = new Tovar("7up", 64, "Napitok", "**");
        Tovar tovar4 = new Tovar("Sprit", 70, "Napitok", "******");
        Tovar tovar5 = new Tovar("Pepsi", 90, "Napitok", "*****");
        Tovar tovar6 = new Tovar("Kofta", 40, "M.odejda", "*");
        Tovar tovar7 = new Tovar("Cake", 34, "Food", "**");
        Tovar tovar8 = new Tovar("Bruki", 34, "M.odejda", "****");

        Tovar[] tovars = {tovar1, tovar2, tovar3, tovar4, tovar5, tovar6, tovar7, tovar8};
        Tovar[] food = {tovar2, tovar7};
        Tovar[] napitki = {tovar1, tovar3, tovar4, tovar5};
        Tovar[] modejda = {tovar6, tovar8};

        Category category1 = new Category("Napitok", napitki);
        Category category2 = new Category("M.odejda", modejda);
        Category category3 = new Category("Food", food);

        Category[] categories = {category1, category2, category3};

        Tovar[] tovarsUser1 = {tovar1, tovar2};
        Tovar[] tovarsUser2 = {tovar5, tovar4, tovar7};
        Tovar[] tovarsUser3 = {tovar6, tovar8};

        Basket basket1 = new Basket(tovarsUser1);
        Basket basket2 = new Basket(tovarsUser2);
        Basket basket3 = new Basket(tovarsUser3);

        User user1 = new User("Artur", 1234, basket1);
        User user2 = new User("Nurzhan", 5678, basket2);
        User user3 = new User("Andrei", 9087, basket3);

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин ");
        String log = sc.nextLine();
        System.out.println("Введите пароль ");
        int pas = sc.nextInt();

        User[] users = {user1, user2, user3};
        int just = 0;
        for (int k = 0; k < users.length; k++) {
            if (log.contains(users[k].getLogin()) && pas == users[k].getPassword()) {
                just++;
            }
        }
        if (just == 0) {
            System.out.println("Вы неправильно ввели пароль или логин");
        } else {
            System.out.println("Введите 1 для корзины, 2 для категории");
            int chetchik = sc.nextInt();
            if (chetchik == 1) {
                for (int j = 0; j < users[just].getBasket().getTovars().length; j++) {
                    System.out.println(users[just].getBasket().getTovars()[j].getName() + "" +
                            " " + users[just].getBasket().getTovars()[j].getPrice() + " " +
                            users[just].getBasket().getTovars()[j].getReiting());
                }
            } else if (chetchik == 2) {
                for (int i = 0; i < categories.length; i++) {
                    System.out.println(categories[i].getName());
                    if (i == categories.length - 1) {
                        System.out.println("Напишите имя категории чтобы увидеть товары в этой категории");
                        String name = scanner.nextLine();
                        int just3= 0;
                        for (int j = 0; j < categories.length; j++) {
                            if(name.contains(categories[j].getName())){
                                for (int k = 0; k < categories[j].getTovars().length; k++) {
                                    System.out.println(categories[j].getTovars()[k].getName() + " " +
                                            "" + categories[j].getTovars()[k].getPrice() + " " +
                                            "" + categories[j].getTovars()[k].getReiting());
                                }
                            }
                            else{
                                just++;
                            }
                        }
                        if(just==categories.length-1){
                            System.out.println("Такой категории нету");
                        }


                    }
                }
            }
        }

    }
}
