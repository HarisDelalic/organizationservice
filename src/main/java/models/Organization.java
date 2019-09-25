package models;

import javax.persistence.*;

@Entity
@Table(name= "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Organization() { }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
