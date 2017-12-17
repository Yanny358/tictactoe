package practice7;

public class Athlete extends Human {
    private Double result;

    public Athlete(String name, double result) {
        this.setName(name);
        this.setResult(result);
    }

    @Override
    public String toString() {
        return String.format("Athlete %s, has a record of %.2f", getName(), getResult());
    }




    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
