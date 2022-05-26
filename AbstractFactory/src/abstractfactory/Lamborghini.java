package abstractfactory;

public class Lamborghini extends Vehicle {

    private String founder;
    private String headQuarters;
    public Lamborghini(String founder, String headQuarters){
        this.founder=founder;
        this.headQuarters=headQuarters;
    }

    @Override
    public String toString() {
        return "Lamborghini{" +
                "founder='" + founder + '\'' +
                ", headQuarters='" + headQuarters + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return "Lamborghini Founder : " + founder + "Head Quarters : " +headQuarters;
    }
}
