package com.hash;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        HashFunction hashFunction=new HashFunction();
        System.out.println(hashFunction.hash("abc"));
    }
}
