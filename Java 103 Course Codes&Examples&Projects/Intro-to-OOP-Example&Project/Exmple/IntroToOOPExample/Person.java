package IntroToOOPExample;
public class Person {
    private String name;
    private int age;
    private String gender;
    private String country;
    private String city;
    public Person(String name, int age, String gender, String country, String city) {
        this.name = name;
        setAge(age); // Using setter for validation
        setGender(gender); // also here, using setter for validation
        this.country = country;
        this.city = city;
    }
    // Getter methods to access the details of the class
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    // Setters methods to initialize the details of the class
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age. Age must be non-negative.");
        }
        this.age = age;
    }
    public void setGender(String gender) {
        // check if user enter invalid value
        if (!(gender.equalsIgnoreCase("Male")
                    || gender.equalsIgnoreCase("Female"))) {
            throw new IllegalArgumentException("Invalid gender, Please enter Male or Female");
        }
        this.gender = gender;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    //toString method helps in debugging and displaying object details conveniently:
    @Override
    public String toString() {
        return "Person Details:\n" +
                "----------------\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Country: " + country + "\n" +
                "City: " + city;
    }
}
