package edu.fischer.Zoo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "caretaker")
public class Caretaker
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String first_name;
    private String surname;
    private int care_id;

    @OneToMany(mappedBy = "caretaker", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Animal>animals;

    public Caretaker() {
    }

    public Caretaker(String first_name, String surname) {
        this.first_name = first_name;
        this.surname = surname;
        animals = new ArrayList<>();
    }

    public void addAnimals (Animal animal){
        animal.setCaretaker(this);
        animals.add(animal);
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getCare_id() {
        return care_id;
    }

    public void setCare_id(int care_id) {
        this.care_id = care_id;
    }

    @Override
    public String toString() {
        return "Caretaker{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", surname='" + surname + '\'' +
                ", care_id=" + care_id +
                ", animals=" + animals +
                '}';
    }
}
