package com.example.practice.task01;

public class Book extends Publication implements FilterPageCount{
    private String author;
    private int countPage;
    private int editionSize;
    private int year;

    public Book(String author, int countPage, int editionSize, int year) {
        this.author = author;
        this.countPage = countPage;
        this.editionSize = editionSize;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getEditionSize() {
        return editionSize;
    }

    public void setEditionSize(int editionSize) {
        this.editionSize = editionSize;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean displayInfo() {
        if (countPage > 150){
            System.out.println(toString());
            return true;
        }
        return false;
    }

    @Override
    public boolean pageCountMore150() {
        return countPage > 150;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", countPage=" + countPage +
                ", editionSize=" + editionSize +
                ", year=" + year +
                '}';
    }
}
