package br.unibratec.pmb.cap2.model;

/**
 * Created by thiago.sousa on 01/02/2017.
 */

public class Student {
    private String name;
    private String email;
    private int age;
    private float rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
