package com.codingchallenge.everesteng.model;
public class Package {


    String id;
    double weight;
    double distance;
    String offerCode;

   public Package(String id, double weight, double distance, String offerCode) {
        this.id = id;
        this.weight = weight;
        this.distance = distance;
        this.offerCode = offerCode;
    }

    public String getId(){
        return id;
    }

    public Double getWeight(){
        return weight;
    }

    public Double getDistance(){
        return distance;
    }

    public String getOfferCode(){
        return offerCode;
    }
}
