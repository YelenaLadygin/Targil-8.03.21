package com.company;

public abstract class Mecanic {
   protected int m_years_of_experience;

       public abstract void repair ();

    public Mecanic(int m_years_of_experience) {
      this.m_years_of_experience = m_years_of_experience;
    }

    public void useScrewdriver(){
           System.out.println(" Using screwdriver to open this screw");

       }
}
