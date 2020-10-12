package bai1;

public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String hobby;

    public Person() {
        this.name = "";
        this.dateOfBirth = "";
        this.gender = "";
        this.hobby = "";
    }
    public Person(String name, String dateOfBirth, String gender, String hobby) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void display(){
        System.out.println("Name:\t\t" + getName());
        System.out.println("Birthday:\t" + getDateOfBirth());
        System.out.println("Gender:\t\t" + getGender());
        System.out.println("Hobby:\t\t" + getHobby());
    }
}