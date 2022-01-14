package com.example.springbooot3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
    @Id
    @Column
    private int bookid;
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;
    public int getBookId()
    {
        return bookid;
    }
    public void setBookId(int bookid)
    {
        this.bookid = bookid;
    }
    public String getBookName()
    {
        return bookname;
    }
    public void setBookName(String bookname)
    {
        this.bookname = bookname;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}

