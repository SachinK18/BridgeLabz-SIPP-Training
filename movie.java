import java.util.Scanner;
public class movie {
    public static void main(String[] args) {
        int n=10;
        int totalPrice=0;
        while(n>0){
            System.out.println("select your ticket type");
            System.out.println("1.platinum");
            System.out.println("2.gold");
            System.out.println("3.silver");
            System.out.println("4.total price");
            System.out.println("5.exit");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            int price=0;
            switch(choice){
                case 1:
                price=platinum();
                totalPrice += price;
                System.out.println("price of ticket is "+price);
                n--;
                break;
                case 2:
                price=gold();
                totalPrice += price;
                System.out.println("price of ticket is "+price);
                n--;
                break;
                case 3:
                price=silver();
                totalPrice += price;
                System.out.println("price of ticket is "+price);
                n--;
                break;
                case 4:
                amount(totalPrice);
                break;
                case 5:
                System.out.println("Final total price for all tickets: "+totalPrice);
                System.exit(0);
                break;
                default:
                System.out.println("invalid choice");
                break;
            }
            if(choice >= 1 && choice <= 3) {
                System.out.println("seats remaining "+n);
            }
        }
        System.out.println("cinema is full");
        System.out.println("Final total price for all tickets: "+totalPrice);
    }
    public static int platinum(){
        return 500;
    }
    public static int gold(){
        return 400;
    }
    public static int silver(){
        return 300;
    }
    public static void amount(int totalPrice){
        System.out.println("total price is "+totalPrice);
    }
}
