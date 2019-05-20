package edu.fischer.Zoo.models;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    private String view;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "care_id_2")
    private Caretaker caretaker;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cell_id_2")
    private Cell cell;

    public Animal() {
    }

    public Animal(String name, String view, int age) {
        this.name = name;
        this.view = view;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setCaretaker(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " | " +
               "Вид: " + view + " | " +
               "Возраст: " + age + "\n";
    }
}
