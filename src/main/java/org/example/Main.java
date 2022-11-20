package org.example;

public class Main {
    public static void main(String[] args) {

        DeliveryDetailPrinter printer = new DeliveryDetailPrinter(new SortedByAddress());
        printer.printDetails();

        DeliveryDetailPrinter printer1 = new DeliveryDetailPrinter(new SorterByName());
        printer1.printDetails();

        DeliveryDetailPrinter printer2 = new
                DeliveryDetailPrinter(new SortedByCountry());
        printer2.printDetails();

    }
}