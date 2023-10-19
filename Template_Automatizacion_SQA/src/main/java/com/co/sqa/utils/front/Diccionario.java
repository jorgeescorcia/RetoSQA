package com.co.sqa.utils.front;

import com.github.javafaker.Faker;

public abstract class Diccionario {

    private  static  Faker faker = new Faker();
    public static final String ACTOR_NAME = "Jorgito";
    public static final String URL_BASE ="https://sanangel.com.co/";
    public static final String USERNAME = "standard_user";
    public static final String PASSWORD = "secret_sauce";
    public static  String RANDOM_FIRST_NAME = faker.name().firstName() ;
    public static  String RANDOM_LAST_NAME = faker.name().lastName() ;
    public static  String RANDOM_POSTAL_CODE = faker.address().zipCode();




}
