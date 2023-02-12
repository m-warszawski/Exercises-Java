import java.time.LocalDate;

public class DrivingLicense
{
    private String surname;
    private String name;
    private String address;
    private String postalcode;
    private String city;
    private String drivingLicenseNumber;
    private String yearOfIssue;
    private String drivingLicenseCategory;


    // surname
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    // name
    public void setName(String name){
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public String getName(){
        return name;
    }

    // address
    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return address;
    }

    // postalcode
    public void setPostalcode(String postalcode){
        this.postalcode = postalcode;
    }

    public String getPostalcode(){
        return postalcode;
    }

    // city
    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    // drivingLicenseNumber
    public void setDrivingLicenseNumber(String drivingLicenseNumber){
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getDrivingLicenseNumber(){
        return drivingLicenseNumber;
    }

    // yearOfIssue
    public void setYearOfIssue(String yearOfIssue){
        if(Integer.parseInt(yearOfIssue)>=1980 && Integer.parseInt(yearOfIssue) <= LocalDate.now().getYear()){
            this.yearOfIssue = yearOfIssue;
        }
    }

    public String getYearOfIssue(){
        return yearOfIssue.toString();
    }

    // yearOfIssue
    public void setDrivingLicenseCategory(String drivingLicenseCategory){
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public String getDrivingLicenseCategory(){
        return drivingLicenseCategory;
    }

    public void displayData(){
        System.out.println(getSurname());
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getPostalcode());
        System.out.println(getCity());
        System.out.println(getDrivingLicenseNumber());
        System.out.println(getYearOfIssue());
        System.out.println(getDrivingLicenseCategory());
        System.out.println("=====================================");
    }

    public String toString(){
        return getSurname()+"\n"+getName()+"\n"+getAddress()+"\n"+getPostalcode()+"\n"+getCity()+"\n"+getDrivingLicenseNumber()+"\n"+getYearOfIssue()+"\n"+getDrivingLicenseCategory()+"\n"+"=====================";
    }
}