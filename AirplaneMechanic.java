package com.company;

public class AirplaneMechanic extends Mecanic{
    protected int rank;

    public AirplaneMechanic(int m_years_of_experience, int rank) {
        super(m_years_of_experience);
        this.rank = rank;
    }
    @Override
    public  void repair (){
        System.out.println("repairing the airplane");
    }
    public void checkEngine (){
        System.out.println("checking the engine");
    }

}
