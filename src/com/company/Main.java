package com.company;

import java.math.BigDecimal;


public class Main {

    public static void main(String[] args) {
//task 2
        float weight_on_earth;
        float weight_on_mars;
        double weight_on_mars_double;
        int weight_on_mars_int;
        char weight_on_mars_char;

        //calculating weight on mars using float
        weight_on_earth = 71;
        weight_on_mars = 0.38F * weight_on_earth;
        System.out.println(weight_on_earth + " KG on earth = " + weight_on_mars + " KG on mars");

        //calculating weight on mars using double
        weight_on_mars_double = weight_on_mars;
        System.out.println("Weight on mars using double = " + weight_on_mars_double);

        //limiting th weight to 4 decimal places
        System.out.printf("Weight on mars limiting it to 4 decimal places  = %.4f %n",  weight_on_mars_double);

        //casting to int
        weight_on_mars_int = (int)weight_on_mars_double;
        System.out.println("weight on mars using int = "+ weight_on_mars_int);

        //casting to char
        weight_on_mars_char = (char)weight_on_mars_int;
        System.out.println("ASCII char using weight on mars = " + weight_on_mars_char);

        //math operation using char
        weight_on_mars_int = weight_on_mars_char * (int)weight_on_mars_double;
        System.out.println(weight_on_mars_int + "\n");


//task 3

        //generating a random number
        int rand = (int) (Math.random() * (100-1));

        //checking if the number is even or odd using modulo
        if (rand % 2 == 0)
        {
            System.out.println("the pseudorandom number " + rand + " is even\n");
        }
        else {System.out.println("the pseudorandom number " + rand + " is odd\n");}


//task 4

        //setting the variables
        int amountOfBricks = 67;
        int containerCapacity = 8;



        //calculating number of full containers
        int noOfFullContainers = amountOfBricks/containerCapacity;
        System.out.println("we have " + noOfFullContainers + " full containers");

        //calculating total number of containers
        int totalNoOfContainers = noOfFullContainers +1;
        System.out.println("we have " + totalNoOfContainers + " containers\n");


//task 5

        //assigning variables
        double netProduct = 9.99;
        double grossProduct;

        //calculating gross value(we assume VAT of 23%)
        grossProduct = netProduct + netProduct * 0.23;
        System.out.println("gross price of 1 product: " + grossProduct + "$");

        //products sold
        double productsSold = grossProduct * 10000;
        System.out.println("gross price of 10000 products: " + productsSold + "$");

        BigDecimal ps = new BigDecimal(productsSold);
        BigDecimal vat = new BigDecimal(0.23);

        BigDecimal vatAmount = ps.multiply(vat);

        BigDecimal netAmount = ps.subtract(vatAmount);
        System.out.println("price for 10000 products excluding Vat: " + netAmount + "$");






    }
}
