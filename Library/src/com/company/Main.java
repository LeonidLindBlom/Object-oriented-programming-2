package com.company;

public class Main {

    public static void main(String[] args) {
        Reader firstReader = new Reader();
        firstReader.setName("Петров П.П.");
        System.out.println(firstReader.takeBook(3));
        firstReader.takeBook("Приключения", "Энциклопедия", "Фантастика");
        Book firstBook = new Book("Л. Толстой", "Война и Мир");
        Book secondBook = new Book("А.С. Грибоедов", "Горе от ума");
        firstReader.takeBook(firstBook, secondBook);
        System.out.println(firstReader.returnBook(4));
        firstReader.returnBook("Приключения", "Энциклопедия", "Фантастика");
        firstReader.returnBook(firstBook, secondBook);
        System.out.println();

        Reader secondReader = new Reader();
        secondReader.setName("Иванов И.И.");
        Reader thirdReader = new Reader();
        thirdReader.setName("Сидоров С.С.");
        Reader fourthReader = new Reader();
        fourthReader.setName("Кузнецов К.К");
        Reader fifthReader = new Reader();
        fifthReader.setName("Волков В.В.");

        //Массив объектов
        Reader[] readers = {firstReader, secondReader, thirdReader, fourthReader, fifthReader};

        Book thirdBook = new Book("М.А. Шолохов", "Тихий Дон");
        Book fourthBook = new Book("Ф.М. Достоевски", "Преступление и Наказание");
        Book fifthBook = new Book("Р.М. Булгаков", "Мастер и Маргарита");

        secondReader.takeBook(thirdBook,secondBook, fifthBook);
        secondReader.returnBook(2);
        System.out.println();

        thirdReader.takeBook("Словарь", "Атлас" , "Детектив", "Ужасы");
        fifthReader.returnBook(fourthBook, firstBook);
        System.out.println();

        fourthReader.takeBook(5);
        fourthReader.returnBook("Анекдоты");
        System.out.println();

        fifthReader.takeBook(fifthBook, fourthBook, firstBook, secondBook, thirdBook);
        fifthReader.returnBook(2);
        System.out.println();

        for (int i = 0; i < 5; i++) {
            readers[i].takeBook(firstBook);
        }
    }
}