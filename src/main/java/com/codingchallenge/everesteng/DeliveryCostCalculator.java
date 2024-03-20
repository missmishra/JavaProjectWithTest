package com.codingchallenge.everesteng;

import java.util.ArrayList;
import java.util.List;
// import com.codingchallenge.everesteng.utils.InputParser;
import com.codingchallenge.everesteng.utils.DiscountCalculator;
import com.codingchallenge.everesteng.utils.InputParser;
import com.codingchallenge.everesteng.model.Package;
import com.codingchallenge.everesteng.model.Vehicle;

public class DeliveryCostCalculator {

    private static final double BASE_DELIVERY_COST = 50.0;
    private static final double COST_PER_KM = 5.0;
    private static final double COST_PER_KG = 10.0;

    public static void main(String[] args) {
        InputParser inputParser = new InputParser();

        List<Package> packages = inputParser.parsePackages();

        List<Vehicle> vehicles = inputParser.parseVehicles();
        new ArrayList<>();
        vehicles.add(new Vehicle(200, 70));
        vehicles.add(new Vehicle(200, 70));


        sortPackagesByWeightAndDeliveryTime(packages, vehicles.get(0).getSpeed());

        for (Package pkg : packages) {
            double totalCost = calculateDeliveryCost(pkg.getWeight(), pkg.getDistance());
            double discountedCost = DiscountCalculator.applyDiscount(pkg.getOfferCode(), totalCost);
            double discount = totalCost - discountedCost;
            double deliveryTime = calculateDeliveryTime(pkg, vehicles);

            System.out.printf("%s %.2f %.2f %.2f%n", pkg.getId(), discount, discountedCost, deliveryTime);
        }
    }

    public static double calculateDeliveryCost(double weight, double distance) {
        return BASE_DELIVERY_COST + (distance * COST_PER_KM) + (weight * COST_PER_KG);
    }

    public static double calculateDeliveryTime(Package pkg, List<Vehicle> vehicles) {
        double maxSpeed = vehicles.get(0).getSpeed();
        double deliveryTime = Double.MAX_VALUE;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getCapacity() >= pkg.getWeight()) {
                vehicle.setCapacity(vehicle.getCapacity() - pkg.getWeight());
                deliveryTime = pkg.getDistance() / maxSpeed;
                break;
            }
        }

        return deliveryTime;
    }

    public static void sortPackagesByWeightAndDeliveryTime(List<Package> packages, double maxSpeed) {
        packages.sort((p1, p2) -> {
            if (p1.getWeight() != p2.getWeight()) {
                return Double.compare(p2.getWeight(), p1.getWeight());
            } else {
                double deliveryTime1 = p1.getDistance() / maxSpeed;
                double deliveryTime2 = p2.getDistance() / maxSpeed;
                return Double.compare(deliveryTime2, deliveryTime1);
            }
        });
    }
}
