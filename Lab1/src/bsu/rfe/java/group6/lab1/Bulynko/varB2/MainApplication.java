package bsu.rfe.java.group6.lab1.Bulynko.varB2;

import java.util.*;
import java.util.Comparator;

public class MainApplication {
    public static void main(String[] args)
    {
        Food[] breakfast = new Food[20];
        int i = 0;
        boolean var1, var2;
        var1 = var2 = false;
        for (String arg : args)
        {
            String[] parts = arg.split("/");
            if (parts.length == 2)
            {
                if (parts[0].equals("Pie"))
                {
                    breakfast[i] = new Pie(parts[1]);
                    i++;
                }
                if (parts[0].equals("Apple"))
                {
                    breakfast[i] = new Apple(parts[1]);
                    i++;
                }
            }
            if (parts.length == 1)
            {
                if (parts[0].equals("Cheese"))
                {
                    breakfast[i] = new Cheese();
                    i++;
                }
            }

            switch (parts[0])
            {
                case "-sort":            // если паратметр -sort, значит нужно будет отсортировать продукты завтрака
                    var1 = true;
                    break;
                case "-calories":       // если паратметр -calories, значит нужно будет посчитать калрийность завтрака
                    var2 = true;
                    break;
            }
        }

        System.out.println("Завтрак: ");
        for (Food item : breakfast)
        {
            if (item != null)
                item.consume();
            else
                break;
        }

        int pie1, pie2, pie3, apple1, apple2, apple3, cheese;
        pie1 = pie2 = pie3 = apple1 = apple2 = apple3 = cheese = 0;
        for(Food item: breakfast)                            // считаем, сколько чего было съедено на завтрак
        {
            if (item == null)
                break;
            if (item.name.equals("Пирог"))
            {
                if (item.par.equals("вишнёвый"))
                    pie1++;
                else if (item.par.equals("клубничный"))
                    pie2++;
                else if (item.par.equals("яблочный"))
                    pie3++;
            }

            if (item.name.equals("Яблоко"))
            {
                if (item.par.equals("маленькое"))
                    apple1++;
                else if (item.par.equals("среднее"))
                    apple2++;
                else if (item.par.equals("большое"))
                    apple3++;
            }
            if (item.name.equals("Сыр"))
            {
                cheese++;
            }
        }

        if (var1)
        {
            Arrays.sort(breakfast, new Comparator()
            {
                public int compare(Object o1, Object o2)
                {
                    if (o1 == null || ((Food)o1).calculateCalories() > ((Food)o2).calculateCalories())
                        return 1;
                    if (o2 == null || ((Food)o1).calculateCalories() < ((Food)o2).calculateCalories())
                        return -1;
                    else return 0;
                }
            });

            System.out.println("Завтрак (отсортированный вариант):");
            for (Food item : breakfast)
            {
                if (item != null)
                {
                    if (item.calculateCalories()==0.0)
                        continue;
                    item.consume();
                    System.out.println(" " + item.calculateCalories());
                }
                else
                    break;
            }
        }

        if (var2)
        {
            double CaloriesCounter = 0.0;
            for (Food item : breakfast)
            {
                if (item != null)
                    CaloriesCounter += item.calculateCalories();
                else
                    break;
            }
            System.out.println("Общее количество калорий: " + CaloriesCounter);

        }

        System.out.println("На завтрак съедено:");
        System.out.println(" вишнёвых пирогов - " + pie1 + ", клубничных пирогов - "
        + pie2 + ", яблочных пирогов - " + pie3
        + ", маленьких яблок - " + apple1 + ", средних яблок - " + apple2
        + ", больших яблок - " + apple3 + ", сыра - " + cheese);

    }
}
