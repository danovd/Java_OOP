package _10_Interfaces_And_Abstraction_Exersise_05_Telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        this.urls.stream().forEach(e -> {
            if(isValid(e)){
                sb.append("Browsing: ").append(e)
                        .append("!").append(System.lineSeparator());
            }else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        });
        return sb.toString();
    }

    private boolean isValid(String e) {

        for (int i = 0; i < e.length(); i++) {
            if(Character.isDigit(e.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

            this.numbers.forEach(e -> {

                if(isValidNumber(e)) {
                    sb.append("Calling... ")
                            .append(e)
                            .append(System.lineSeparator());
                }else{
                    sb.append("Invalid number!").append(System.lineSeparator());
                }
            });

        return sb.toString();
    }

    private boolean isValidNumber(String e) {
        for (int i = 0; i < e.length(); i++) {
            if(Character.isLetter(e.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
