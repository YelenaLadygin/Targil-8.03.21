package com.company;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        //5-6
        Teacher teacher1= new MathTeacher();
        Teacher teacher2= new HistoryTeacher();
         identifyTeacher(teacher1);
         identifyTeacher(teacher2);
      //11
         ElectricDevice tv = new TV(true,55f);
         ElectricDevice phone = new Cellphone(false,"samsung");

         //17
      IPlayer player1 = new GuitarPlayer("Yelena","piano");
      IPlayer player2 = new PianoPlayer("Moshe", "guitar");

      //19

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add (5);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(2);

    }
   //5-6
    private static void identifyTeacher ( Teacher teacher ){
        if (teacher instanceof MathTeacher) {
            System.out.println(" it is the math teacher");
        } else if (teacher instanceof HistoryTeacher){
            System.out.println(" it is the history teacher");
        }
    }
    //11
    private static void repairElectricDevice (ElectricDevice device) {
        if (device.worksOnBatteries = true) {
            device.insertNewBatteries();
        }
        if (device.isFaulty = false) {
            return;
        }
        device.fixDevice();
        if (device instanceof TV) {
            System.out.println(((TV) device).screen_size);
          if (device instanceof Cellphone) {
                System.out.println(((Cellphone) device).brand);
            }
        }
    }
        //17
        private static void startMusicShow (Player player){
            player.play();
            if (player instanceof PianoPlayer) {
                ((PianoPlayer) player).playJazz();
            }
            if (player instanceof GuitarPlayer) {
                ((GuitarPlayer) player).rockAndRoll();
            }
        }
    }











