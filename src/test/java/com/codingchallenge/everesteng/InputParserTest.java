package com.codingchallenge.everesteng;

import org.junit.jupiter.api.Test;

import com.codingchallenge.everesteng.utils.InputParser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import com.codingchallenge.everesteng.model.Package;
import com.codingchallenge.everesteng.model.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputParserTest {

    @Test
    public void testParsePackages() {
        String input = "100\n5\nPKG1\n50\n30\nOFR001\nPKG2\n75\n125\nOFFR0008\nPKG3\n175\n100\nOFFR003\nPKG4\n110\n60\nOFFR002\nPKG5\n155\n95\nNA";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        InputParser inputParser = new InputParser();
        List<Package> packages = inputParser.parsePackages();

        assertEquals(5, packages.size());
        assertEquals("PKG1", packages.get(0).getId());
        assertEquals(50.0, packages.get(0).getWeight(), 0.001);
        assertEquals(30.0, packages.get(0).getDistance(), 0.001);
        assertEquals("OFR001", packages.get(0).getOfferCode());
    }

    @Test
    public void testParseVehicles() {
        String input = "2\n70\n200";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        InputParser inputParser = new InputParser();
        List<Vehicle> vehicles = inputParser.parseVehicles();

        assertEquals(2, vehicles.size());
        assertEquals(200.0, vehicles.get(0).getCapacity(), 0.001);
        assertEquals(70.0, vehicles.get(0).getSpeed(), 0.001);
    }
}
