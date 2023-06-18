package _06_Encapsulation_Exersise_04_Pizza_Calories;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weigh;

    public Dough(String flourType, String bakingTechnique, double weight) {
       setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weigh = weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    private void setFlourType(String flourType) {
        List<String> list = Arrays.stream(FlourType.values()).map(String::valueOf).collect(Collectors.toList());
        if(!list.contains(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }
    public double calculateCalories(){
        return FlourType.valueOf(this.flourType).getModifier() * weigh;
    }
}
