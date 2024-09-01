package models;

import java.util.List;

public class Screen extends BaseModel{
    private String Name;
    private List<Seat> seats;
    private List<Feature> features;
    private int dimension;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
