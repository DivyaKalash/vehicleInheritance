package com.TheK;

import org.w3c.dom.ls.LSOutput;

public class BuggatiLVN extends Car {

    private int roadServiceMonth;

    public BuggatiLVN(int roadServiceMonth) {
        super("La Voiture Noire","4WD",5, 5, 7, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate){
        int newVelocity = this.getCurrentVelocity() + rate;

        if(newVelocity == 0){
            stop();
            changeGear(1);
        }

        else if (newVelocity > 0 && newVelocity <= 20){
            changeGear(1);
        }
        else if (newVelocity > 20 && newVelocity <= 40){
            changeGear(2);
        }
        else if (newVelocity > 40 && newVelocity <= 60){
            changeGear(3);
        }
        else if (newVelocity > 60 && newVelocity <= 80){
            changeGear(4);
        }
        else if (newVelocity > 80 && newVelocity <= 100){
            changeGear(5);
        }
        else {
            changeGear(6);
        }
          if (newVelocity>0){
              changeVelocity(newVelocity,getCurrentDirection());
          }
        System.out.println("Vehicle is Moving at "+newVelocity+ " velocity in "+getCurrentDirection()+ " direction");
    }


}



