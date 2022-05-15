package com.timwang5.pojo;

import java.util.*;

public class Students {


    private String name;

    private Address address;

    private String[] book;

    private List<String> hobbies;

    private Map<String, String> studentCard;



    private Set<String> games;

    private Properties info;

    private String wife = null;






    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }


    public Map<String, String> getStudentCard() {
        return studentCard;
    }

    public void setStudentCard(Map<String, String> studentCard) {
        this.studentCard = studentCard;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", book=" + Arrays.toString(book) +
                ", hobbies=" + hobbies +
                ", studentCard=" + studentCard +
                ", games=" + games +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }
}
