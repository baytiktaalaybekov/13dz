import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Baytik","Taalaybekov",20,new String[]{"scanner","math","opp"},"lagman");
        System.out.println(myClass.getName()+"\n"+myClass.getSurname()+"\n"+myClass.getAge()+"\n"+myClass.getFavofood());
        System.out.println(Arrays.toString(myClass.getLessons()));
        System.out.println("==============================================================================");
        MyClass myClass2 = new MyClass("Baytik","Taalaybekov",20,new String[]{"oop","random","math"},"manty");
        System.out.println(myClass2.getName()+"\n"+myClass2.getSurname()+"\n"+myClass2.getAge()+"\n"+myClass2.getFavofood());
        System.out.println(Arrays.toString(myClass2.getLessons()));
    }



}