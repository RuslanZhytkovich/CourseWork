package com.example.coursework;

public class User
{
    public User(int idusers, String name, String second_name, String email, int age, String job_title, int role, int access, String password) {
        this.idusers = idusers;
        this.name = name;
        this.second_name = second_name;
        this.email = email;
        this.age = age;
        this.job_title = job_title;
        this.role = role;
        this.access = access;
        this.password = password;
    }

    private int idusers;
  private String name;
  private String second_name;
  private String email;
  private int age;
  private String job_title;
  private int role;
  private int access;
  private String password;

    public int getIdusers()
    {
        return idusers;
    }

    public void setIdusers(int idusers) {
        this.idusers = idusers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}