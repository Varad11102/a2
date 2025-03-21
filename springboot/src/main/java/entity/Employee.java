package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {

    @Id
    private int id;
    private String ename;

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setId(int id) {
        this.id = id;
    }
}
