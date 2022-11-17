package com.company;

public class Reader {
    private String name;
    private int readerTicketNumber;
    private String faculty;
    private String birthday;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReaderTicketNumber() {
        return readerTicketNumber;
    }

    public void setReaderTicketNumber(int readerTicketNumber) {
        this.readerTicketNumber = readerTicketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String takeBook(int bookNumber){
        return getName() + " взял "+ bookNumber + " книги";
    }

    public void takeBook(String ... bookGenre) {
        System.out.print(getName() + " взял книги: ");
        for (int i = 0; i < bookGenre.length - 1; i++) {
            System.out.print(" " + bookGenre[i] + ",");
        }
        for (int i = bookGenre.length - 1; i < bookGenre.length; i++) {
            System.out.println(" " + bookGenre[i] + ".");
        }
    }

    public void takeBook(Book ... books){
        System.out.print(getName() + " взял книги: ");
        for (int i = 0; i < books.length-1; i++) {
            System.out.print(" "+books[i].getBookTitle() + ", автор: " + books[i].getAuthorName()+ ";");
        }
        for (int i = books.length-1; i < books.length; i++) {
            System.out.println(" "+books[i].getBookTitle() + ", автор: " + books[i].getAuthorName()+ ".");
        }
    }
    public String returnBook(int bookNumber){
        return getName() + " вернул "+ bookNumber + " книги";
    }

    public void returnBook(String ... bookGenre) {
        System.out.print(getName() + " вернул книги: ");
        for (int i = 0; i < bookGenre.length - 1; i++) {
            System.out.print(" " + bookGenre[i] + ",");
        }
        for (int i = bookGenre.length - 1; i < bookGenre.length; i++) {
            System.out.println(" " + bookGenre[i] + ".");
        }
    }

    public void returnBook(Book ... books){
        System.out.print(getName() + " вернул книги: ");
        for (int i = 0; i < books.length-1; i++) {
            System.out.print(" "+books[i].getBookTitle() + ", автор: " + books[i].getAuthorName()+ ";");
        }
        for (int i = books.length-1; i < books.length; i++) {
            System.out.println(" "+books[i].getBookTitle() + ", автор: " + books[i].getAuthorName()+ ".");
        }
    }
}
