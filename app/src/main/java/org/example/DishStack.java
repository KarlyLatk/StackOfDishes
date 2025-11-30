package org.example;

public class DishStack {
    Dish[] dishes;
    private int maxSize = 4;
    public DishStack(){
        dishes = new Dish[maxSize];
    }
    // Get the current size of the stack via a size method
    public int size(){
        int i = 0;
        for(Dish d : dishes){
            if(d != null){
                i++;
            }
        }
        return i;
    }
    // Return true if size is empty (0)
    public boolean isEmpty(){
        return size() == 0;
    }

    // Pushes an item onto the top of this stack
    public Dish push(Dish d){
        if(size() == maxSize){
            System.out.println("Stack is full, cannot push");
            return null;
        }
        dishes[size()] = d;
        return d;
    }
    // Removes the object at the top of this stack and returns that object as the value of this function
    public Dish pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot pop");
            return null;
        }
        Dish d = dishes[size()-1];
        dishes[size()-1] = null;
        return d;
    }

    // Look at the object at the top(end) of this stack without removing it from the stack
    public Dish peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, cannot peek");
            return null;
        }
        Dish d = dishes[size()-1];
        return d;
    }

    public void clear(){
        for(int i = 0; i < maxSize; i++){
            dishes[i] = null;
        }
    }
}
