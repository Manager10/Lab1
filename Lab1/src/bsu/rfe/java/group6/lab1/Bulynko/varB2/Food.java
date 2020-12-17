package bsu.rfe.java.group6.lab1.Bulynko.varB2;

public abstract class Food
{
    String name = null;
    String par = null;
    public void consume(){}
    public Food(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food) arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
