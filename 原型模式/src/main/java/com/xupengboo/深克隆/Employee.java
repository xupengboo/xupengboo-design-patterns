package com.xupengboo.深克隆;

import java.io.*;

/**
 * @author: xupengboo
 * @date: 2024/1/25 15:57
 * @description: 雇员
 */
public class Employee implements Serializable {

    private String name;

    private int age;

    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 我们将 Employee(this) 对象序列化为字节流，并存储在 ByteArrayOutputStream 中。后续的代码将使用这个字节流进行反序列化，从而实现深克隆。
     */
    public Employee deepCopy() throws IOException, ClassNotFoundException {
        // 使用序列化和反序列化实现深克隆
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Employee) ois.readObject();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
