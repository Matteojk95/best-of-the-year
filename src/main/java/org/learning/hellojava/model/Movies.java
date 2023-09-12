package org.learning.hellojava.model;

public class Movies {
    //ATTRIBUTI
    private String id;
    private String title;


    //COSTRUTTORE

    public Movies(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Movies (){

    }

    //GETTER E SETTER

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
