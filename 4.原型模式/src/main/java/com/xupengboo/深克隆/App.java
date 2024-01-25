package com.xupengboo.深克隆;

import java.io.IOException;

/**
 * @author: xupengboo
 * @date: 2024/1/25 16:12
 * @description:
 */
public class App {

    public static void main(String[] args) {
        // 创建原型对象
        Address address = new Address("CityA", "12345");
        Employee originalEmployee = new Employee("John", 25, address);

        // 使用深克隆创建新对象
        try {
            Employee cloneEmployee = originalEmployee.deepCopy();

            // 修改原型对象的地址信息
            originalEmployee.getAddress().setCity("CityB");
            originalEmployee.getAddress().setPostalCode("67890");

            // 输出结果
            System.out.println("Original Employee: " + originalEmployee);
            System.out.println("Cloned Employee: " + cloneEmployee);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
