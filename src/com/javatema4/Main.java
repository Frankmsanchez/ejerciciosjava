package com.javatema4;

    public class Main {
        public static void main(String[] args) {
            SmartPhone iPhone = new SmartPhone("Apple", "iPhone 11 Pro", 999.99, 128, 4, 5.8);
            SmartWatch appleWatch = new SmartWatch("Apple", "Apple Watch Series 6", 399.99, "Stainless Steel", "Gold");

            System.out.println(iPhone.toString());
            System.out.println(appleWatch.toString());
        }
    }

