package web.model;

public class Car {
    private String model;
    private int mileage;
    private String number;

    public Car(String model, int mileage, String number) {
        this.model = model;
        this.mileage = mileage;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mileage=" + mileage +
                ", number='" + number + '\'' +
                '}';
    }
}
