package _06_Encapsulation_Exersise_03_Shopping_Spree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Person> peopleInfo = new LinkedHashMap<>();
        Map<String, Product> productsInfo = new HashMap<>();

        // Read people
        String [] people = sc.nextLine().split(";");
        for(String p : people){
            String [] personData = p.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);
            try{
                Person person = new Person(name, money);
                peopleInfo.putIfAbsent(name, person);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }

        // Read products

        String [] products = sc.nextLine().split(";");
        for(String p : products){
            String [] productData = p.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);
            try{
                Product product = new Product(name, cost);
                productsInfo.putIfAbsent(name, product);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }

        // Shopping
        String input = sc.nextLine();

        while(!input.equals("END")){
            String [] commandParts = input.split(" ");
            String personName = commandParts[0];
            String productName = commandParts[1];

            try{
                Person person = peopleInfo.get(personName);
                Product product = productsInfo.get(productName);
                person.buyProduct(product);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            input = sc.nextLine();
        }
        // Print shopping result

        for(Person person : peopleInfo.values()){
            System.out.print(person.getName() + " - ");
            if(person.getProducts().isEmpty()){
                System.out.println("Nothing bought");
            }else {
                System.out.println(person.getProducts().stream().map(Product::getName)
                        .collect(Collectors.joining(", ")));
            }
            }
    }
}
