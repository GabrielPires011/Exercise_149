package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
                System.out.print("Name: ");
                sc.next();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                if(ch == 'c') {
                    list.add(new Product(price, name));
                } else if (ch == 'u') {
                        System.out.print("Manufacture date (DD/MM/YYYY): ");
                        Date manufactureDate = sdf.parse(sc.next());
                        list.add(new UsedProduct(price, name, manufactureDate));
                    } else {
                        System.out.print("Customs fee: ");
                        Double customsFee = sc.nextDouble();
                        list.add(new ImportedProduct(price, name, customsFee));
                    }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product emp : list){
            System.out.println(emp.priceTag());
        }



        sc.close();
    }
}
