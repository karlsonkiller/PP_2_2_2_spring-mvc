package web.controller;

public class Cars {
    private final String name;
    private final int model;
    private final int years;

    public Cars(String name, int model, int years) {
        this.name = name;
        this.model = model;
        this.years = years;
    }


    @Override
    public String toString() {
        return "Car: " +
                "name ='" + name + '\'' +
                ", model= " + model +
                ", years= " + years;
    }
}
