package DAY2.Association;

import java.util.ArrayList;
import java.util.List;

public class stack<type> {
    List<type> data = new ArrayList<>();

    public void push(type dataToPush){
        data.add(dataToPush);
        System.out.println("Data added successfully");
    }

    public type pop(){
        type dataPoped = null;
        if(data.size()-1 <= 0){
            System.out.println("Nothing to remove");
            return null;
        }
        dataPoped = data.remove(data.size()-1);
        return dataPoped;
    }
    public type pick(){
        type dataPoped = null;
        if(data.size()-1 <= 0){
            System.out.println("Nothing to remove");
            return null;
        }
        dataPoped = data.get(data.size()-1);
        return dataPoped;
    }
    public int getSize(){
        return data.size();
    }

    public boolean isEmpty(){
        if(data.isEmpty())
            return true;
        return false;
    }
}
