package com.Transient;

import java.io.*;

// The transient keyword is useful in a few scenarios:
//We can use it for derived fields
//It is useful for fields that do not represent the state of the object
//We use it for any non-serializable references
//When we want to store sensitive information and don’t want to send it through the network
public class Book implements Serializable {
    private String bookName;
    private transient String description;
    private transient int  copies;
    public Book(){

    }
//    public Book(String bookName,String description,int copies){
//        this.bookName= bookName;
//        this.description = description;
//        this.copies = copies;
//    }
    public String getBookName(){
        return this.bookName;
    }
    public void setBookName(String BookName){
        this.bookName  = BookName;
    }
    public String getDescription(){return this.description;}
    public void setDescription(String description){this.description =description;}
    public int  getCopies(){return this.copies;}
    public void setCopies(int  copies){this.copies =copies;}

    public static void serialize(Book book)throws  Exception{
        String fileName = "D:\\bookDetails";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream object = new ObjectOutputStream(fileOutputStream);
        object.writeObject(book);
        object.close();
        fileOutputStream.close();
    }
    public static  Book deserialize()throws Exception{
        String fileName = "D:\\bookDetails";
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream input = new ObjectInputStream(file);
        Book book = (Book) input.readObject();
        input.close();
        file.close();
        return book;
    }
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("will not be saved");
        book.setCopies(25);
        try{
            serialize(book);
            System.out.println("Serialization completed....");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            Book deserializeBook = deserialize();
            System.out.println("Deserialization completed....");

            if (book.getBookName().equals(deserializeBook.getBookName())) {
                System.out.println("The books are the same in terms of bookName.\n"+"BookName:"+deserializeBook.getBookName());
            } else {
                System.out.println("The books are different.");
            }


            if (deserializeBook.getDescription() == null && deserializeBook.getCopies() == 0) {
                System.out.println("The transient fields (description and copies) are not deserialized as expected.");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}

