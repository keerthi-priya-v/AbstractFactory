package abstractfactory;

public class KTM extends Vehicle{

    private String founder;
    private String headQuarters;
    private int yearOfManufacturing;
    public KTM(String founder, String headQuarters,int yearOfManufacturing){
        this.founder=founder;
        this.headQuarters=headQuarters;
        this.yearOfManufacturing=yearOfManufacturing;
    }

       public String getDetails() {
        return "KTM Founder : " + founder + " Head Quarters : " +headQuarters+" Manufactured in "+ yearOfManufacturing;
    }

    @Override
    public String toString() {
        return "KTM{" +
                "founder='" + founder + '\'' +
                ", headQuarters='" + headQuarters + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                '}';
    }
}

