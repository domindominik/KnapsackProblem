package main;

import java.util.List;

public class Sorting
{
    //private List<Item> itemList;

    /*public Sorting(List<Item> itemList)
    {
        this.itemList = itemList;
    }*/

    public void sorting(List<Item> itemList)
    {
        for (int i = 0; i < itemList.size(); i++)
        {
            for (int j = i + 1; j < itemList.size(); j++)
            {
                if (itemList.get(i).getProfitability() < itemList.get(j).getProfitability())
                {
                    Item temp = itemList.get(i);
                    itemList.set(i, itemList.get(j));
                    itemList.set(j, temp);
                }
            }
        }
    }
}
