package javaConditionalStatements;


import java.util.Scanner;

public class MobileShopping {

    public static void main(String[] args) {
        System.out.println("Welcome to SVN Mobile Shopping");
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0;
        double mobilePrice = 0;
        double laptopPrice = 0;
        double accessoriesPrice = 0;
        String yn = "";
        do {
            System.out.println("Enter the Category");
            String catg = sc.next();
            switch (catg) {
            case "mobile" -> {
                String myn = "";
                do {
                    System.out.println("Enter Mobile Name");
                    String item = sc.next();
                    switch (item) {
                    case "samsung" -> {
                        System.out.println("Samsung Mobile Price is 25000 rs");
                        double samsungPrice = 25000;
                        mobilePrice = mobilePrice + samsungPrice;
                    }
                    case "iphone" -> {
                        System.out.println("iPhone Price is 60000 rs");
                        double iphonePrice = 60000;
                        mobilePrice = mobilePrice + iphonePrice;
                    }
                    case "oneplus" -> {
                        System.out.println("OnePlus Mobile Price is 35000 rs");
                        double oneplusPrice = 35000;
                        mobilePrice = mobilePrice + oneplusPrice;
                    }
                    case "vivo" -> {
                        System.out.println("Vivo Mobile Price is 20000 rs");
                        double vivoPrice = 20000;
                        mobilePrice = mobilePrice + vivoPrice;
                    }
                    case "oppo" -> {
                        System.out.println("Oppo Mobile Price is 22000 rs");
                        double oppoPrice = 22000;
                        mobilePrice = mobilePrice + oppoPrice;
                    }
                    default -> {
                        System.out.println("Entered Mobile is not available !!");
                    }
                    }
                    System.out.println(
                            "Do you want to continue with Mobiles? Click Y or N");
                    myn = sc.next();
                } while (myn.equalsIgnoreCase("y"));
                System.out.println("Exit from Mobiles !!");
                System.out.println("Total Mobile Price is : " + mobilePrice);
            }
            case "laptop" -> {
                String lyn = "";
                do {
                    System.out.println("Enter Laptop Name");
                    String item = sc.next();
                    switch (item) {
                    case "hp" -> {
                        System.out.println("HP Laptop Price is 50000 rs");
                        double hpPrice = 50000;
                        laptopPrice = laptopPrice + hpPrice;
                    }
                    case "dell" -> {
                        System.out.println("Dell Laptop Price is 60000 rs");
                        double dellPrice = 60000;
                        laptopPrice = laptopPrice + dellPrice;
                    }
                    case "lenovo" -> {
                        System.out.println("Lenovo Laptop Price is 55000 rs");
                        double lenovoPrice = 55000;
                        laptopPrice = laptopPrice + lenovoPrice;
                    }
                    default -> {
                        System.out.println("Entered Laptop is not available !!");
                    }
                    }
                    System.out.println(
                            "Do you want to continue with Laptops? Click Y or N");
                    lyn = sc.next();
                } while (lyn.equalsIgnoreCase("y"));
                System.out.println("Exit from Laptops !!");
                System.out.println("Total Laptop Price is : " + laptopPrice);
            }
            case "accessories" -> {
                String ayn = "";
                do {
                    System.out.println("Enter Accessory Name");
                    String item = sc.next();
                    switch (item) {
                    case "mouse" -> {
                        System.out.println("Mouse Price is 500 rs");
                        double mousePrice = 500;
                        accessoriesPrice = accessoriesPrice + mousePrice;
                    }
                    case "keyboard" -> {
                        System.out.println("Keyboard Price is 1000 rs");
                        double keyboardPrice = 1000;
                        accessoriesPrice = accessoriesPrice + keyboardPrice;
                    }
                    case "headphones" -> {
                        System.out.println("Headphones Price is 1500 rs");
                        double headphonesPrice = 1500;
                        accessoriesPrice = accessoriesPrice + headphonesPrice;
                    }
                    default -> {
                        System.out.println(
                                "Entered Accessory is not available !!");
                    }
                    }
                    System.out.println("Do you want to continue with Accessories? Click Y or N");              
                    ayn = sc.next();
                } while (ayn.equalsIgnoreCase("y"));
                System.out.println("Exit from Accessories !!");
                System.out.println(
                        "Total Accessories Price is : " + accessoriesPrice);
            }
            default -> {
                System.out.println(
                        "Entered Category is not available right now !!");
            }
            }

            System.out.println(
                    "Do you want to continue with Categories? Click Y or N for Exit");
            yn = sc.next();
        } while (yn.equalsIgnoreCase("y"));
        totalPrice = mobilePrice + laptopPrice + accessoriesPrice;
        System.out.println("--------------------------------");
        System.out.println("Total Mobile Price      : " + mobilePrice);
        System.out.println("Total Laptop Price      : " + laptopPrice);
        System.out.println("Total Accessories Price : " + accessoriesPrice);
        System.out.println("--------------------------------");
        System.out.println("Total Shopping Price    : " + totalPrice);
        System.out.println("Thank You for Shopping !!");
    }
}
        
        
        	
