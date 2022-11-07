public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[] lessons;
    private String favofood;

    public MyClass(String name, String surname, int age, String[] lessons, String favofood) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons=lessons;
        this.favofood = favofood;

    }

    public MyClass() {
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    void setFavofood(String favofood) {
        this.favofood = favofood;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    int getAge() {
        return age;
    }

    String[] getLessons() {
        return lessons;
    }

    String getFavofood() {
        return favofood;
    }
}
