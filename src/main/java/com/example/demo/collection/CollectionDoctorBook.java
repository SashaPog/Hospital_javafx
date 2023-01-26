package com.example.demo.collection;

import com.example.demo.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class CollectionDoctorBook implements DoctorBook {
    @Override
    public void save(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }


    ObservableList<Person> personList = FXCollections.observableArrayList();

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ObservableList<Person> personList) {
        this.personList = personList;
    }

    public void print(){
        int number = 0;

        for (Person p: personList){
          number++;
            System.out.println(number + " pip " + p.getPip() + " profesions " +  p.getProfetion() + " hours " +  p.getHours());

        }
    }

    public void fillTestData(){
        personList.add(new Person("Пограничний О С", "Стоматолог", "9:00 - 14:00"));
        personList.add(new Person("Гордоцький Ю А", "Хірург", "9:00 - 14:00"));
        personList.add(new Person("Популярний О С", "Ортодонт", "9:00 - 14:00"));
        personList.add(new Person("Простий О С", "Психіатр", "9:00 - 14:00"));
        personList.add(new Person("Провірочний О С", "Терапевт", "9:00 - 14:00"));
    }
}
