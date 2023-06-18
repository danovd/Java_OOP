package _07_Inheritance_Lab_05_StackOfStrings;

import java.util.List;

public class StackOfStrings {
    private List<String> list;
    private int index;

    public void push(String element){
        this.list.add(element);
        this.index++;
    }
    public String peek(){
        return this.list.get(this.index);
    }
    public String pop(){
        return this.list.remove(this.index--);
    }
    public boolean isEmpty(){
        return this.list.isEmpty();
    }
}
