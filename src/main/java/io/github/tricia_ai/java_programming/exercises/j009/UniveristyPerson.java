package io.github.tricia_ai.java_programming.exercises.j009;

public class UniveristyPerson {

    protected String id;
    protected String name;
    protected String email;
    public UniveristyPerson(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;

    }

    public String toString(){
        return "ID: "+id+" Name: "+name+" Email: "+email;
    }

}
