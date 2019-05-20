package edu.fischer.Zoo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cell")
public class Cell
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "number")
    private int number;

    @OneToMany(mappedBy = "cell", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Animal>animals;

    public Cell() {
    }

    public Cell(int number) {
        this.number = number;
        animals = new ArrayList<>();
    }

    public void addAnimals (Animal animal){
        animal.setCell(this);
        animals.add(animal);
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "id=" + id +
                ", number=" + number +
                ", animals=" + animals +
                '}';
    }
}
