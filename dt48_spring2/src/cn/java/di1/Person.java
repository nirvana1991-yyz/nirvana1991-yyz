/**
 * Project Name:dt48_spring2
 * File Name:Person.java
 * Package Name:cn.java.di1
 * Date:下午2:12:59
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.di1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Description: <br/>
 * Date: 下午2:12:59 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class Person {
    private String name;

    private Panda pet;

    private List list;

    private Set set;

    private Map map;// key value

    private Properties props;// .properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Panda getPet() {
        return pet;
    }

    public void setPet(Panda pet) {
        this.pet = pet;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", pet=" + pet + ", list=" + list + ", set=" + set + ", map=" + map + ", props="
                + props + "]";
    }

}
