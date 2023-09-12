package org.learning.hellojava.model;

public class Songs {
    //ATTRIBUTI

    //ATTRIBUTI
    private String id;
    private String title;


    //COSTRUTTORE

    public Songs(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Songs() {

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
