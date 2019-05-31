package main;

import java.util.List;

public class Loadre
{
    private List<Item> itemList;
    private Knapsack knapsack;

    public void loadre(List<Item> itemList)
    {
        for (int i = 0; i < itemList.size(); i++)
        {
            if (knapsack.getKnapsackWeight() < knapsack.getMaxWeight())
            {
                knapsack.addItem(itemList.get(i));
                knapsack.setKnapsackWeight(itemList.get(i).getWeight());
            }
            //TODO zatrzymać ładowanie kiedy plecak się zapłeni
            /*if (knapsack.isFull())
            {
                break;
            }*/
        }
    }
}