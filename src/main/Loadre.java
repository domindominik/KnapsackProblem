package main;

import java.util.List;

public class Loadre
{
    private List<Item> itemList;
    private Knapsack knapsack;

    public Loadre(Knapsack knapsack)
    {
        this.knapsack = knapsack;
    }

    public void loadre(List<Item> itemList)
    {
        for (Item item: itemList)
        {
            //if (item.getWeight() <= knapsack.getMaxWeight() - knapsack.getKnapsackWeight())
            if (knapsack.getMaxWeight() >= knapsack.getKnapsackWeight() + item.getWeight())
            {
                knapsack.addItem(item);
                knapsack.setKnapsackWeight(item.getWeight() + knapsack.getKnapsackWeight());
            }
            if (knapsack.isFull())
            {
                break;
            }
        }



    }
}