package main;

import java.util.List;

public class Knapsack
{
    private List<Item> itemList;
    private boolean isFull;
    private int knapsackWeight;
    private int maxWeight;
    // Bellmana method

    public Knapsack(List<Item> itemList, boolean isFull, int knapsackWeight, int maxWeight)
    {
        this.itemList = itemList;
        this.isFull = isFull;
        this.knapsackWeight = knapsackWeight;
        this.maxWeight = maxWeight;
    }

    public List<Item> getItemList()
    {
        return itemList;
    }

    //TODO zwrócić true gdy plecak jest pełeny
    public boolean isFull()
    {
        if (knapsackWeight >= maxWeight)
        return false;
    }

    public int getKnapsackWeight()
    {
        return knapsackWeight;
    }

    public int getMaxWeight()
    {
        return maxWeight;
    }

    public void setItemList(List<Item> itemList)
    {
        this.itemList = itemList;
    }

    public void addItem(Item item)
    {
        itemList.add(item);
    }

    public void setFull(boolean full)
    {
        isFull = full;
    }

    public void setKnapsackWeight(int knapsackWeight)
    {
        this.knapsackWeight = knapsackWeight;
    }

    public void setMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    public void printInfo()
    {
        System.out.println("Max weight: " + maxWeight +
                ", Is full: " + isFull +
                ", Knapsack weight: " + knapsackWeight + "\n");
    }

}