package com.cakes.org;

public abstract class Cake {
    String name;
     String type;
    int price;

    public Cake() {
        System.out.println("default constructor of cake is called");
    }

    public Cake(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

        public String getName(){
            return name;
        }
        public String getType(){
            return type;
        }
        public int getPrice(){
            return price;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setPrice(int price){
            this.price=price;
        }
        public void setType(String type){
            this.type=type;
        }

        public abstract void recipe();
        public abstract void myFans();
        public void aboutCake(){
            System.out.println("I am "+name+" Cake");
            System.out.print("My Fans  : ");
            myFans();
            System.out.println("You can get a "+name+" Cake at "+price);
        }

}
