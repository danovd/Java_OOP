package _04_Abstraction_Exersise_04_Traffic_Lights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color.toString();
    }

    public void changeColor(){
        switch(this.color){
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
        }

    }

}
