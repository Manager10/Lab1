package bsu.rfe.java.group6.lab1.Bulynko.varB2;

public class Cheese extends Food
{
    public Cheese ()
    {
        super("Сыр");
    }

    public Double calculateCalories()
    {
        return 19.9;
    }

    public void consume()
    {
        System.out.println(this + " съедено");
    }
}
