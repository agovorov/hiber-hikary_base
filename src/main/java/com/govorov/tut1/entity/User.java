package com.govorov.tut1.entity;

import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "USER")
public class User extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
	@SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "catalog_seq")
	*/
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstname;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastname;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PASSWD", nullable = false)
    private String password;

//    @ElementCollection
//    @OneToOne(cascade=CascadeTypejavax.persistence.CascadeTypeJPA enumDefines the set of cascadable operations that are propagated to the associated entity.
//            See JavaDoc Reference Page....ALL) MyEntity field2;
//    @OneToMany(fetch=FetchType.EAGER) List<MyEntity> field3;

//    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private Set<Car> cars = new HashSet<Car>();

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
