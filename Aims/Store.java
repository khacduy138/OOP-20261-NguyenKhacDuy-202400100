package com.hust.kstn;

public class Store {
	DigitalVideoDisc itemsInStore[];
	static private int num = 0;
	public void addDVD(DigitalVideoDisc... dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            itemsInStore[num] = dvdList[i];
            num++;
        }
        System.out.println("All specified discs have been added successfully.");
    }
	public void removeDVD(DigitalVideoDisc disc) {
        if (num == 0) {
            System.out.println("The store is empty. Cannot remove any DVD.");
            return;
        }

        int foundIndex = -1;
        for (int i = 0; i < num; i++) {
            if (itemsInStore[i].equals(disc)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("The disc does not exist in the cart.");
        } else {
            for (int i = foundIndex; i < num - 1; i++) {
            	itemsInStore[i] = itemsInStore[i + 1];
            }
            itemsInStore[num - 1] = null;
            
            num--;
            System.out.println("The disc has been removed successfully.");
        }
    }
}
