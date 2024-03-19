package Data;

import java.util.ArrayList;

public class Teacher extends User{

    private Integer id;
    private ArrayList<String> discipline;

    public Teacher(String name, Integer age, String address, Integer id) {
        super(name, age, address);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", discipline=" + discipline +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
