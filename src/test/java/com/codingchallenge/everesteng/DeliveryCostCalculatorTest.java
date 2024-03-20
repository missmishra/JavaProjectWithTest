package com.codingchallenge.everesteng;
import org.junit.jupiter.api.Test;

import com.codingchallenge.everesteng.utils.InputParser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import com.codingchallenge.everesteng.model.Package;
import com.codingchallenge.everesteng.model.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryCostCalculatorTest {

    @Test
    public void testCalculateDeliveryCost() {
        double weight = 10.0;
        double distance = 50.0;
        double expectedCost =

        50.0 + (50.0 * 5.0) + (10.0 * 10.0);

        double actualCost = DeliveryCostCalculator.calculateDeliveryCost(weight, distance);

        assertEquals(expectedCost, actualCost, 0.001);
    }

    @Test
    public void testCalculateDeliveryTime() {

        List<Package> packages = new ArrayList<>();
        packages.add(new Package("PKG1", 50, 30, "OFR001"));
        packages.add(new Package("PKG2", 75, 125, "OFR008"));
        packages.add(new Package("PKG3", 175, 100, "OFR003"));
        packages.add(new Package("PKG4", 110, 60, "OFR002"));
        packages.add(new Package("PKG5", 155, 95, "NA"));

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(200,70));
        vehicles.add(new Vehicle(200,70));

        double expectedDeliveryTime = 30.0 / 70.0;
        double actualDeliveryTime = DeliveryCostCalculator.calculateDeliveryTime(packages.get(0), vehicles);

        assertEquals(expectedDeliveryTime, actualDeliveryTime, 0.001);
    }

    @Test
    public void testSortPackagesByWeightAndDeliveryTime() {
        List<Package> packages = new ArrayList<>();
        packages.add(new Package("PKG1", 50, 30, "OFR001"));
        packages.add(new Package("PKG2", 75, 125, "OFR008"));
        packages.add(new Package("PKG3", 175, 100, "OFR003"));
        packages.add(new Package("PKG4", 110, 60, "OFR002"));
        packages.add(new Package("PKG5", 155, 95, "NA"));

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(200,70));
        vehicles.add(new Vehicle(200,70));


        DeliveryCostCalculator.sortPackagesByWeightAndDeliveryTime(packages, vehicles.get(0).getSpeed());

        assertEquals("PKG3", packages.get(0).getId());
        assertEquals("PKG5", packages.get(1).getId());
        assertEquals("PKG4", packages.get(2).getId());
        assertEquals("PKG2", packages.get(3).getId());
        assertEquals("PKG1", packages.get(4).getId());
    }
}

