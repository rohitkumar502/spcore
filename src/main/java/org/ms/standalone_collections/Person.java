package org.ms.standalone_collections;
import java.util.*;
public class Person
{
    private List<String> friends;
    private Set<String> city;
    private Map<String , Integer> feestr;
    private Properties db;

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
    public Properties getDb() {
        return db;
    }
    public void setDb(Properties db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "Person [friends=  " + friends + ", city= " + city + ", feestr= " + feestr + ", db= " + db + ']';
    }

}
