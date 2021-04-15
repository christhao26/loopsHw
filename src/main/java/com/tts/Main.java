package com.tts;

import javax.lang.model.element.NestingKind;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] fruitArray = {"Orange", "Apple", "Banana"};
        int[] intArray;
        boolean[] boolArray;

        System.out.println("====Arrays=====");
        System.out.println(fruitArray[1]);
        System.out.println(fruitArray.length);


        System.out.println("====Collections=====");

        List<String> stringList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        List<String> stringVector = new Vector<>();
        List<String> StringStack = new Stack<>();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");

//        {dog, house, cellphone}


//        stringList.add(index:1, element:"cat");

//        {dog, cat, house, cell phone}

        Collections.reverse(stringList);
        System.out.println("Here is my list reversed: " + stringList);


        System.out.println("The element at index 0:" + stringList.get(0));




        System.out.println("==== String Conversion ====");

        // first I set up a String
        String myString = "I really love ice cream";
        // then I take my string and split it at every whitespace
        // and turn it into a regular array
        String[] strArr = myString.split(" ");

        // setting up arrayList and making the value
        // that of the strArr
        List<String> splitList = Arrays.asList(strArr);

        System.out.println(splitList);

        List<String> carList = Arrays.asList("BMW", "Honda", "Audi");
        Object[] carArr = carList.toArray();

        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[", "")
                .replace("]", "")
                .replace(",", ""));


        HashMap<String, Integer> personMap = new HashMap<>();

        personMap.put("Mary", 37);
        personMap.put("Bob", 54);
        personMap.put("Karen", 60);

        System.out.println(personMap);
        System.out.println("This is the value associated with Mary:" + personMap.get("Mary"));

        for (String i : personMap.keySet()) {
            System.out.println("key: " + i + " value: " + personMap.get(i));
        }

        List<String> fruitList = Arrays.asList("plum", "grape", "fiji apple");

        // this is referred to as an enhanced for loop
        // enhanced for loops are strictly used for collections
        // String fruit represents any given element in our fruitList collection
        for (String fruit : fruitList) {
            System.out.println("Here is one of my fruits: " + fruit);
        }

        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        animalList.addFirst("shark");
        animalList.addLast("koala");
        System.out.println(animalList);

        animalList.set(1, "emu");
        System.out.println(animalList);


        Queue<Integer> myQueue = new LinkedList<>();

        for (int i=5; i<10; i++){
            myQueue.add(i);
        }

        System.out.println("Elements of Queue:" + myQueue);

        int removedHead = myQueue.remove();
        System.out.println("removes element of myQueue:" + removedHead);

        System.out.println(myQueue);


        int head = myQueue.peek();
        System.out.println("Head of Queue " + head);

        int size = myQueue.size();
        System.out.println("size of the queue: " + size);


        System.out.println("===== Stacks=====");

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack);




        myStack.pop();
        System.out.println(myStack);

// FIFO - first in first out
// LIFO - last in first out



        int peek = myStack.peek();
        System.out.println(peek);

        boolean empty = myStack.empty();
        System.out.println(empty);








    }




}
