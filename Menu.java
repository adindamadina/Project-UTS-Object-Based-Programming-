import java.util.Scanner;

public class Menu {
    Scanner scn = new Scanner(System.in);
    public double total = 0, Drink=0, diskon , h_diskon, tax, h_tax;
    public boolean back = true;
    public int Item, Flavours, choose;
    public int Sweetness;


    public void Rasa() {
        do {
            System.out.print("How much  do you want? : ");
            Item = scn.nextInt();

            if (Item < 1) {
                System.out.println("Error!!!");
                back = true;
            } else {
                for (int a = 0; a < Item; a++) {
                    System.out.println("Menu of drink");
                    System.out.println("1. Hazelnut Chocolate Milktea");
                    System.out.println("2. Brown Sugar Milk Vanilla");
                    System.out.println("3. Brown Sugar Fresh Milk");
                    System.out.println("4. Strawberry Frappucino");


                    System.out.print("Choose Item: ");
                    Flavours = scn.nextInt();
                    System.out.println();

                    switch (Flavours) {
                        case 1, 2 -> {
                            Drink = 25000;
                            System.out.println("Price Rp." + Drink);
                            back = false;
                        }
                        case 3 -> {
                            Drink = 28000;
                            System.out.println("Price Rp." + Drink);
                            back = false;
                        }
                        case 4 -> {
                            Drink = 30000;
                            System.out.println("Price Rp." + Drink);
                            back = false;
                        }
                        default -> {
                            System.out.println("please choose ur flavor first");
                            back = true;
                        }
                    }

                    System.out.println();
                    total += Drink;
                    System.out.println();
                }

            }


        }while (back) ;
    }

    public void Gula() {
        for (int a = 0; a < Item; a++) {

            System.out.println("Sweetness Level");
            System.out.println("1. Normal (100%)");
            System.out.println("2. Less Sugar (80%)");
            System.out.println("3. Half Sugar (50%)");
            System.out.println("4. light Sugar (30%)");
            System.out.println("5. No Sugar (0%)");

            System.out.print("Choose Sweetness level of your drink: ");
            Sweetness = scn.nextInt();
            System.out.println();

            switch (Sweetness) {
                case 1 -> System.out.println("Sweetness Level is : Normal" );
                case 2 -> System.out.println("Sweetness Level is : Less Sugar" );
                case 3 -> System.out.println("Sweetness Level is : Half Sugar" );
                case 4 -> System.out.println("Sweetness Level is : Light Sugar" );
                case 5 -> System.out.println("Sweetness Level is : No Sugar" );

            }
        }
    }

    public void payment(){

        do{
            System.out.println("Do you have a member card? : ");
            System.out.println("1.Yes, Sure!");
            System.out.println("2.No,Sorry. ");
            System.out.print("Choose  : ");
            choose=scn.nextInt();


            switch (choose) {
                case 1 -> {
                    diskon= total * 17 / 100;
                    h_diskon = total-diskon;
                    tax= h_diskon *10/100;
                    h_tax= total-diskon+tax;
                    System.out.print("Diskon 17% : " + diskon);
                    System.out.print("Total Payment : " + h_tax);
                    back = false;
                }
                case 2 -> {
                    tax= total *10/100;
                    h_tax= total+tax;
                    System.out.print("Total Payment : " + h_tax);
                    back = false;
                }
                default -> System.out.print("Pilihan salah ");
            }
        }while(back);
    }


}



