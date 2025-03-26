package com.example.practice.task02;

public class Book extends Publication implements FilterEditionSize{
    private String author;
    private String genre;
    private String name;
    private int editionSize;

    public Book(String author, String genre, String name, int editionSize) {
        this.author = author;
        this.genre = genre;
        this.name = name;
        this.editionSize = editionSize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEditionSize() {
        return editionSize;
    }

    public void setEditionSize(int editionSize) {
        this.editionSize = editionSize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", name='" + name + '\'' +
                ", editionSize=" + editionSize +
                '}';
    }

    @Override
    boolean displayInfo() {
        if (editionSize < 10000){
            System.out.println(this);
            return true;
        }
        return false;
    }

    @Override
    public boolean filterEditionSizeLessThan10000() {
        return editionSize < 10000;
    }
}
