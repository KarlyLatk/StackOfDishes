package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DishStackTest {
    DishStack dishStack;
    @BeforeEach
    public void setUp(){
        dishStack = new DishStack();
    }
    @Test
    public void testStack() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        int stackSize = dishStack.size();
        assertEquals(stackSize, 0);
    }

    @Test
    public void testOneStack() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        dishStack.push(oneDish);
        int sizeAfterPushes = dishStack.size();
        assertEquals(sizeAfterPushes, 1);
    }
    @Test
    public void testTwoStack() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        int sizeAfterPushes = dishStack.size();
        assertEquals(sizeAfterPushes, 2);
    }
    @Test
    public void testMultipleStack() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);
        int sizeAfterPushes = dishStack.size();
        assertEquals(sizeAfterPushes, 4);
    }
    @Test
    public void testPeekedDish() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);

        // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
        Dish peekedDish = dishStack.peek();
        assertEquals(peekedDish, blueDish);
    }
    @Test
    public void testPoppedDish() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);

        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = dishStack.pop();
        assertEquals(poppedDish, blueDish);
        assertEquals(3, dishStack.size());
    }
    @Test
    public void testAnotherPoppedDish() {
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);

        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = dishStack.pop();
        // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
        Dish anotherPoppedDish = dishStack.pop();
        assertEquals(anotherPoppedDish, redDish);
        assertEquals(2, dishStack.size());
    }
    @Test
    public void testEmptyStackPeek(){
        assertEquals(dishStack.peek(), null);
    }
    @Test
    public void testEmptyStackPop(){
        assertEquals(dishStack.pop(), null);
    }
    @Test
    public void testFullStackPush(){
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);

        assertEquals(dishStack.push(oneDish), null);
    }

    @Test
    public void testClearStack(){
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");
        dishStack.push(oneDish);
        dishStack.push(twoDish);
        dishStack.push(redDish);
        dishStack.push(blueDish);

        dishStack.clear();
        assertEquals(dishStack.size(), 0);
    }

}
