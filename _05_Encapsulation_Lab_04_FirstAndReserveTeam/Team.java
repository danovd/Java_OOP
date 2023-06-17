package _05_Encapsulation_Lab_04_FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        firstTeam = new ArrayList<>();
        reserveTeam = new ArrayList<>();
    }
    private void setName(String name){
        this.name = name;
    }
    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(this.firstTeam);
    }
    public List<Person> getReserveTeam(){
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public void addPlayer(Person p){
        if(p.getAge() < 40){
            firstTeam.add(p);
        }else{
            reserveTeam.add(p);
        }
    }

    @Override
    public String toString() {
        return String.format("First team have %d players\nReserve team have %d players",
                this.firstTeam.size(), this.reserveTeam.size());
    }
}
