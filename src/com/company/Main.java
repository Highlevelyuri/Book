package com.company;

public class Main {

    public static void main(String[] args) {
	Title title = new Title();
	Author author = new Author( );
	Content content = new Content();
	Book book = new Book( title, author, content);
	book.Show(" Война и мир", " Толстой","Фундаментальное произведение мировой литературы" );



    }
}
