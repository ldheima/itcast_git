package pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private Integer age;
    private String address;
    private String sex;

    public User() {
    }





    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
