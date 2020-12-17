package bsu.rfe.java.group6.lab1.Bulynko.varB2;

public class Apple extends Food
{

    public Apple(String size)
    {
        super("Яблоко");
        par = size;
    }

    public boolean equals(Object arg0)
    {
        if (super.equals(arg0))
        {
            if (!(arg0 instanceof Pie))
                return false;
            return par.equals(((Pie)arg0).par);
        } else
            return false;
    }

    public Double calculateCalories()
    {
        if(par.equals("маленькое"))
        {
            return 4.7;
        }
        else if(par.equals("среднее"))
        {
            return 9.1;
        }
        else if(par.equals("большое"))
        {
            return 13.6;
        }
        else return 0.0;
    }

    public String getSize()
    {
        return par;
    }

    public void setSize(String size)
    {
        this.par = size;
    }

    public void consume()
    {
        System.out.println(this + " съедено");
    }

    public String toString()
    {
        return super.toString() + " размера '" + par + "'";
    }

}
