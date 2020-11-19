package com.company;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;
    public Bicycle(int s, int g, int c) {

        this.cadence=c;
        this.speed=s;
        this.gear=g;
    }
    public static void main(String [] args){
        System.out.println("Aastha");
    }
}
class MountainBike extends Bicycle{
    int superheight;
    public MountainBike(int c, int s, int g ,int sh) {
        super(s, g, c);

        super.cadence=c;
        super.gear=g;
        super.speed=s;
        superheight=sh;
        // TODO Auto-generated constructor stub
    }

}