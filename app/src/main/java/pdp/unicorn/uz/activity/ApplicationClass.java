package pdp.unicorn.uz.activity;

import android.app.Application;

import java.util.ArrayList;

import pdp.unicorn.uz.model.Person;

public class ApplicationClass extends Application
{
    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();
        people.add(new Person("Ali", "990990909"));
        people.add(new Person("Vali", "977070707"));
        people.add(new Person("Sashka", "955055505"));
        people.add(new Person("John", "0909505707"));


    }
}
