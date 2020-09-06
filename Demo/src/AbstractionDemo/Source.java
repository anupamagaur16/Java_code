package AbstractionDemo;


import java.util.*;

abstract class Homeloan {
    double amount;
    int time;

    abstract double getRateOfIntererst();
    abstract double simpleInterest();
    //Write your code here
}

class Bank1 extends Homeloan {


    public Bank1(double amount, int time) {

        this.amount = amount;
       this.time = time;
    }

    //Write your code here
    double getRateOfIntererst(){
        float rateOfInt = 7.2f;
        return rateOfInt;
    }
    double simpleInterest() {

        double simpleInt = amount+((amount * getRateOfIntererst() * time)/100);

        return simpleInt;
    }

}

class Bank2 extends Homeloan {
    public Bank2(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }

    //Write your code here
    double getRateOfIntererst(){
        return (8.1);
    }
    double simpleInterest() {

     double simpleInt = amount+((amount * getRateOfIntererst() * time)/100);
       // System.out.println(simpleInt);
        return simpleInt;
    }

}

class Source {
    @SuppressWarnings("resource")
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if(obj1.amount <=0 || obj2.amount <=0 || obj1.time <=0|| obj2.time <=0){
            System.out.println("invalid input");
            return;
        }
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }

}