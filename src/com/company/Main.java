package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SolarSystem andromeda =new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;


        FeatureSun mikeSun = new FeatureSun();
        mikeSun.color="Red";
        mikeSun.heat="696945830302 degrees";
        mikeSun.temp="2 degrees kelvin";
        mikeSun.radius="9000800700km";
        mikeSun.maritalStatus = "in love";



        //adding planet1 features

        Planet1 astranout = new Planet1();
        astranout.size =" 234234km";
        astranout.color="red";
        astranout.relationshipStatus="its complicated";
        




        Planet2 bastronaut = new Planet2();
        bastronaut.size="2482349234km";
        bastronaut.color="orange";
        bastronaut.status = "its complicated";
        



    }
}
