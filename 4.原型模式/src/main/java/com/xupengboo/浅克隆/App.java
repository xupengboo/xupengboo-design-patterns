package com.xupengboo.浅克隆;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        // 创建原型对象
        Author author = new Author("Jane Doe", "United States");
        Book originalBook = new Book("Java Programming", 300, author);
        // 使用浅克隆创建新对象
        try {
            Book cloneBook = (Book) originalBook.clone();
            // 修改原型对象的作者信息
            originalBook.getAuthor().setName("zhangsan");
            // 输出结果
            System.out.println("Original Book:" + originalBook);
            System.out.println("Clone Book:" + cloneBook);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
