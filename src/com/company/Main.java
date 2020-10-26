package com.company;


public class Main {

    public static void main(String[] args) {
      Truck truck= new Truck( "Avp" ,new Factory("Volvo","London"), 6.5, Color.GREEN);

      Moto moto = new Moto("Rhd", new Factory("Volvo","Bishkek"),1.2,Color.YELLOW,2,3);
      Moto moto1= new Moto("Ptr",new Factory ( "Volvo","Moscow") , 1.1,Color.GREEN,1,2);
        System.out.println(truck.getInfo());
        System.out.println(moto.getInfo());
        System.out.println(moto1.getInfo());

        truck.makeVoice("Trtrtr");
        moto.makeVoice("Rrrrrr",3);
        moto1.makeVoice(7,"Ahrrr");
    }
}