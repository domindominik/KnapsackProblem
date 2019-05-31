package main;

import java.util.ArrayList;
import java.util.List;

public class Menu
{
    public static void main(String[] args)
    {
        List<Item> itemList = new ArrayList<>();
        Knapsack knapsack = new Knapsack(itemList, false, 0, 50);

        itemList.add(new Item(18, 8, "Phone"));
        itemList.add(new Item(13, 4, "CD"));
        itemList.add(new Item(11, 6, "iGor"));
        itemList.add(new Item(12, 9, "Rolex"));
        itemList.add(new Item(14, 10, "Patek"));
        itemList.add(new Item(6, 5, "Razer"));
        itemList.add(new Item(16, 11, "Razer"));
        itemList.add(new Item(19, 13, "Dell"));
        itemList.add(new Item(9, 5, "SSD"));
        itemList.add(new Item(6, 5, "ipad"));
        itemList.add(new Item(7, 5, "nokia"));
        itemList.add(new Item(4, 3, "Denon"));
        itemList.add(new Item(11, 2, "Car"));
        itemList.add(new Item(21, 14, "Cat"));

        knapsack.printInfo();

        for (Item item: itemList)
        {
            item.printInfo();
        }


        System.out.println("After sorting:");
        Sorting sorting = new Sorting();
        sorting.sorting(itemList);

        for (Item item: itemList)
        {
            item.printInfo();
        }


        Loadre loadre = new Loadre();
        loadre.loadre(itemList);

        knapsack.printInfo();
    }
}
