package main;

public class Item
{
    private int value;
    private int weight;
    private String name;
    private double profitability;

    public Item(int value, int weight, String name)
    {
        this.value = value;
        this.weight = weight;
        this.name = name;
        this.profitability = (double) value/ weight;
    }

    public double getProfitability()
    {
        return profitability;
    }

    public int getValue()
    {
        return value;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return name;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name +
                "\t\t Profitability: " + profitability +
                "\t\tValue: " + value +
                "\t\tWeight: " + weight);
    }
}