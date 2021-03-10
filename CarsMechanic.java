package com.company;

public class CarsMechanic extends Mecanic {
    public String car_types;
    public String car_repair;


    public CarsMechanic(int m_years_of_experience, String car_types, String car_repair) {
        super(m_years_of_experience);
        this.car_types = car_types;
        this.car_repair = car_repair;
    }

    @Override
    public  void repair (){
        System.out.println("repairing car");
    }
    public  void replaceWheel (){
        System.out.println("replacing the damaged wheel");
    }

}
