package br.unibratec.pmb.cap2.model;

/**
 * Created by thiago.sousa on 01/02/2017.
 */

public class Student {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private Float rate;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getId() + " - " + getName();
    }
}
