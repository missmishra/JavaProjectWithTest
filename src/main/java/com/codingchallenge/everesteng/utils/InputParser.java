package com.codingchallenge.everesteng.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.codingchallenge.everesteng.model.Vehicle;
import com.codingchallenge.everesteng.model.Package;

public class InputParser {

    public List<Package> parsePackages() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base delivery cost: ");
        double baseDeliveryCost = scanner.nextDouble();

        System.out.print("Enter number of packages: ");
        int numPackages = scanner.nextInt();

        List<Package> packages = new ArrayList<>();

        for (int i = 0; i < numPackages; i++) {
            System.out.print("Enter package ID: ");
            String id = scanner.next();

            System.out.print("Enter package weight: ");
            double weight = scanner.nextDouble();

            System.out.print("Enter package distance: ");
            double distance = scanner.nextDouble();

            System.out.print("Enter package offer code: ");
            String offerCode = scanner.next();

            packages.add(new Package(id, weight, distance, offerCode));
        }
        return packages;
    }

    public List<Vehicle> parseVehicles() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int numVehicles = scanner.nextInt();

        System.out.print("Enter maximum speed: ");
        double maxSpeed = scanner.nextDouble();

        System.out.print("Enter maximum capacity: ");
        double maxCapacity = scanner.nextDouble();

        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < numVehicles; i++) {
            vehicles.add(new Vehicle(maxCapacity, maxSpeed));
        }

        return vehicles;
    }
}
