package abstractfactory;

public class BMW extends Vehicle {

    private String founder;
    private String headQuarters;
    public BMW(String founder, String headQuarters){
        this.founder=founder;
        this.headQuarters=headQuarters;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "founder='" + founder + '\'' +
                ", headQuarters='" + headQuarters + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return "BMW Founder : " + founder + " Head Quarters : " +headQuarters;
    }
}
