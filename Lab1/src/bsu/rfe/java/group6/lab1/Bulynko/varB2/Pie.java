package bsu.rfe.java.group6.lab1.Bulynko.varB2;

public class Pie extends Food
{

    public Pie(String filling)
    {
        super("Пирог");
        par = filling;
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
        if(par.equals("вишнёвый"))
        {
            return 13.5;
        }
        else if(par.equals("клубничный"))
        {
            return 10.7;
        }
        else if(par.equals("яблочный"))
        {
           return 9.2;
        }
        else
            return 0.0;
    }

    public String getPar()
    {
        return par;
    }

    public void setPar(String filling)
    {
        this.par = filling;
    }

    public void consume()
    {
        System.out.println(this + " съедено");
    }

    public String toString()
    {
        return super.toString() + " '" + par + "'";
    }

}
