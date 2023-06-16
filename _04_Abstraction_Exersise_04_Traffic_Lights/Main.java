package _04_Abstraction_Exersise_04_Traffic_Lights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Color[] signals = Arrays.stream(sc.nextLine().split(" "))
                .map(Color::valueOf).toArray(Color[]::new);

        List<TrafficLight> trafficLights = new ArrayList<>();

        for(Color color : signals){
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLights.add(trafficLight);
        }
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            for(TrafficLight t : trafficLights){
                t.changeColor();
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }
}
