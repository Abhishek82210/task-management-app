package com.example.tast_management_system.entity;
import jakarta.persistence.*;

@Entity
@Table( name = "tasks")
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String title;
    private String description;
    private String status;

    //constructors
    public Task()
    {

    }
    public Task(String title , String description, String status)
    {
        this.title = title;
        this.description = description;
        this.status = status;
    }
    // getters and setters
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
}