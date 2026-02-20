package com.aradhyagupta25.Code2;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name = "Alien_Table")
public class Alien {

    @Id
    private int aid;
    //@Column(name = "Alien_Name")
    private String aname;
    //@Transient  // doesn't include the column
    private String tech;

    // @OneToOne   // one alien has only one laptop.
    // @OneToMany      // crates a third table."Alien_Laptop". it's from the Alien's POV.
    // @OneToMany (mappedBy = "alien")     // don't map the third table (alien_laptop). it's mapped by "alien" variable in Laptop.
    @ManyToMany
    private List<Laptop> laptop;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}


