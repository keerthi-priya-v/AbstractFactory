package abstractfactory;

public class Honda  extends Vehicle{
    //Honda headquarters Gurgaon, Haryana, India
    //Founder	Soichiro Honda
    //Manucfatured in year 1955
    private String founder;
    private String headQuarters;
    private int yearOfManufacturing;
    public Honda(String founder, String headQuarters,int yearOfManufaturing){
        this.founder=founder;
        this.headQuarters=headQuarters;
        this.yearOfManufacturing=yearOfManufaturing;
    }
    @Override
    public String getDetails() {
        return "BMW Founder : " + founder + "Head Quarters : " +headQuarters+"Manufatured in "+yearOfManufacturing;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "founder='" + founder + '\'' +
                ", headQuarters='" + headQuarters + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                '}';
    }
}

