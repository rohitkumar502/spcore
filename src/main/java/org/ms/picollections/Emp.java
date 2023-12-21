package org.ms.picollections;

import java.util.*;
public class Emp {
    private String name;
    private List<Integer> phones;
    private Set<String> address;
    private Map<String, String> courses;
    private Properties props;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPhones() {
        return phones;
    }

    public void setPhones(List<Integer> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }


}
