public class Person extends Human {
    String countryFrom;
    String sex;
    double height;

    public Person(String countryFrom, String sex, double height,int age,String name,double weight) {
        super(age,name,weight);
        this.countryFrom = countryFrom;
        this.sex = sex;
        this.height = height;
    }

    public String getCountryFrom() {
        return this.countryFrom;
    }

    public void setCountryFrom() {
        this.countryFrom = countryFrom;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight() {
        this.height = height;
    }

}
