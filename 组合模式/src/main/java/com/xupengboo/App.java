package com.xupengboo;

import com.xupengboo.component.impl.Directory;
import com.xupengboo.component.impl.File;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 文件系统 - 文件（叶子节点）、文件夹（容器节点 或 复合节点）
        Directory root = new Directory("root");
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        File file1 = new File("File1");
        File file2 = new File("File2");
        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir2.add(file2);

        root.display();
    }

}
