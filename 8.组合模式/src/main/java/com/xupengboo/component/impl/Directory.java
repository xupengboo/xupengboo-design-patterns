package com.xupengboo.component.impl;

import com.xupengboo.component.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xupengboo
 * @date: 2024/2/18 15:16
 * @description: 文件夹
 */
// 容器类（复合节点类）
public class Directory implements FileSystemComponent {

    private String name;

    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    public void display() {
        System.out.println("Directory：" + name);
        for (FileSystemComponent component : children) {
            component.display();
        }
    }

}
