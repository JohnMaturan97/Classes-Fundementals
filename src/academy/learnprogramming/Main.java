package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //House = Object Type    Color: blue
        House blueHouse = new House("Blue");
        //Reference to the object in memory
        House anotherHouse = blueHouse;

        //Print the value of the variable
        System.out.println(blueHouse.getColor()); //prints blue
        System.out.println(anotherHouse.getColor()); //blue

        //Calling the set method to change the color
        anotherHouse.setColor("Red");

        //Printing the color
        System.out.println(blueHouse.getColor());//print red
        System.out.println(anotherHouse.getColor());//red

        //Creating a new instance - 2 objects and 3 reference
        House greenhouse = new House("Green");

        //Assigning de-referencing another house and will point to another memory
        anotherHouse = greenhouse;

        //First print will be red => Second and third will print green since they both point at the same memory
        System.out.println(blueHouse.getColor()); //red
        System.out.println(greenhouse.getColor()); //green
        System.out.println(anotherHouse.getColor()); //green


    }
}