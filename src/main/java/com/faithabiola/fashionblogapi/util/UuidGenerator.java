package com.faithabiola.fashionblogapi.util;

import com.github.javafaker.Faker;

public class UuidGenerator {
    public static String uuid(){
        Faker faker = new Faker();
        return faker.random().hex();
    }
}
