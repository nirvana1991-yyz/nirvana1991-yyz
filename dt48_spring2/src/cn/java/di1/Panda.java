/**
 * Project Name:dt48_spring2
 * File Name:Panda.java
 * Package Name:cn.java.di1
 * Date:下午2:14:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 *
*/

package cn.java.di1;

/**
 * Description: <br/>
 * Date: 下午2:14:31 <br/>
 * 
 * @author dingP
 * @version
 * @see
 */
public class Panda {
    private String name;

    private Integer age;//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Panda [name=" + name + ", age=" + age + "]";
    }
}
