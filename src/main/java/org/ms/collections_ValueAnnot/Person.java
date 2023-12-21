package org.ms.collections_ValueAnnot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;
//@Component
@Component("obj")
public class Person
{

//    @Value("#{{'Anu', 'Pinki', 'Nancy'}}") // we can directly provide random list values
    @Value("#{mybff}") //providing list name declared in xml file
    private List<String> friends;


//    @Value("#{{'Patna', 'Darbhanga', 'Madhubani', 'Patna'}}")
    @Value("#{address}")
    private Set<String> city;



//    @Value("#{{'Spring':8000, 'Java': 1500, 'Python': 2500}}")
    @Value("#{fees}")
    private Map<String , Integer> feestr;


//    @Value("#{{'Name':'Smriti', 'College': 'UIET', 'Home': 'Mundaka'}}")
    @Value("#{biodata}")
    private Properties profile;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends)
    {
        this.friends = friends;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    public Map<String, Integer> getFeestr() {
        return feestr;
    }

    public void setFeestr(Map<String, Integer> feestr) {
        this.feestr = feestr;
    }

    public Properties getProfile() {
        return profile;
    }

    public void setProfile(Properties profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Person [friends = " + friends + ", city = " + city + ", feestr = " + feestr + ", profile = " + profile + ']';
    }

}
