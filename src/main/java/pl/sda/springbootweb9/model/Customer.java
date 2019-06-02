package pl.sda.springbootweb9.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER3")
public class Customer {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String age;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
