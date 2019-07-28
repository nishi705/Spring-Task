package com.stackroute.domain;

public class Movie {
    Actor actor;

    public Actor getActor() {
        return actor;
    }
//use setter injection in task1
    public void setActor(Actor actor)
    {
        this.actor = actor;
    }
    public Movie()
    {
        super();
    }
    //use constructor-injection in task2
   public Movie(Actor actor)
   {
       this.actor=actor;
   }
}
