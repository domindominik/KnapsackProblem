package main;

import java.util.ArrayList;
import java.util.List;

public class Knapsack
{
    private List<Item> itemList;
    private int knapsackWeight;
    private int maxWeight;
    // Bellmana method

    public Knapsack(int maxWeight)
    {
        this.itemList = new ArrayList<>();
        this.knapsackWeight = 0;
        this.maxWeight = maxWeight;
    }

    public List<Item> getItemList()
    {
        return itemList;
    }


    public boolean isFull()
    {
        return knapsackWeight >= maxWeight;
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
        System.out.println("\nMax weight: " + maxWeight +
                ", Is full: " + isFull() +
                ", Knapsack weight: " + knapsackWeight );
        for (Item item: itemList)
        {
            item.printInfo();
        }
    }

}