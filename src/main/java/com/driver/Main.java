package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y) {return x+y;

        }
        public int product(int x, int y,int z) {
            return  x+y+z;
        }
        public double product(double x, double y){

            return x+y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();
       int pro1= p.product(10,20);
        int pro2=p.product(10,20,30);
        double pro3=p.product(10.0,20.0);
    }
}