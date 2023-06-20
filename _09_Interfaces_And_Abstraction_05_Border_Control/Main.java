package _09_Interfaces_And_Abstraction_05_Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        List<Identifiable> identifiables = new ArrayList<>();
        while(!line.equals("End")){
            String [] tokens = line.split("\\s+");

            Identifiable identifiable = tokens.length == 2
                    ? new Robot(tokens[0], tokens[1])
                    : new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            identifiables.add(identifiable);
            line = sc.nextLine();
        }

        String lastFakeDigits = sc.nextLine();


        System.out.println(identifiables.stream()
                        .map(Identifiable::getId)
                .filter(i -> i.endsWith(lastFakeDigits))
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
