package ru.viktor.springboot.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name can not be empty")
    @Size(min = 2, max = 15, message = "Name should be more than 2 and less than 15 characters")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Surname can not be empty")
    @Size(min = 2, max = 20, message = "Surname should be more than 2 and less than 20 characters")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be more than 0")
    private int age;

    @Column(name = "department")
    @Size(min = 2, max = 15, message = "Enter valid name of your department")
    @NotEmpty(message = "Department can not be empty")
    private String department;


}
