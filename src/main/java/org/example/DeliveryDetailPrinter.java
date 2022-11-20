package org.example;

public class DeliveryDetailPrinter {

    private Sorter sorter;

    public DeliveryDetailPrinter(Sorter sorter) {
        this.sorter = sorter;
    }

    public void printDetails(){
        sorter.sortDetails();

    }
}
