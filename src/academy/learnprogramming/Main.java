package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Declare and init the class --> Car subaru = new Car();
        Car subaru = new Car();
        Car toyota = new Car();

        //calling the model and named setModel
        subaru.setModel("STI");
        System.out.println("Model is " + subaru.getModel());

    }

}
