package _12_Polymorphism_Exersise_02_Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] carInfo = sc.nextLine().split("\\s+");
        String [] truckInfo = sc.nextLine().split("\\s+");
        String [] busInfo = sc.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]),
                Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]),
                Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Vehicle bus = new Bus(Double.parseDouble(busInfo[1]),
                Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        int numberOperations = Integer.parseInt(sc.nextLine());

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        for (int i = 0; i < numberOperations; i++) {
            String [] commandParts = sc.nextLine().split("\\s+");
            String command = commandParts[0];
            String vehicle = commandParts[1];
            double amount = Double.parseDouble(commandParts[2]);
            Vehicle v = vehicles.get(vehicle);

            try {
                switch (command){
                case "Drive":

                    if(v instanceof Bus){
                     ((Bus)v).setIsEmpty(false);
                    }
                    System.out.println(v.drive(amount));
                    break;
                case "Refuel":
                        vehicles.get(vehicle).refuel(amount);
                    break;
                case "DriveEmpty":
                    if(v instanceof Bus){
                        ((Bus)v).setIsEmpty(true);
                    }
                    System.out.println(v.drive(amount));
                    break;
            }

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }


        }

        System.out.printf("Car: %.2f\n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());

    }
}
