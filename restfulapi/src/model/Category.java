package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Category model.
 */
@XmlRootElement
@Entity(name="Category")
public class Category
{
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
