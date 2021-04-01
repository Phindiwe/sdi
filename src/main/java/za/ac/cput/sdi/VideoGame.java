/*
 * VideoGame.java
 * @Author Keenan Barends - 219002959
 * This is a Java Class.
 * Date: 01 April 2021
 */

package za.ac.cput.sdi;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VideoGame

{
    private String title;
    private String developer;
    private String genre;
    private double price;

    public VideoGame()
    {}

    public VideoGame(String title, String developer, String genre)
    {
        this.title = title;
        this.developer = developer;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDeveloper()
    {
        return developer;
    }

    public void setDeveloper(String developer)
    {
        this.developer = developer;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "VideoGame {" +
                "title ='" + title + '\'' +
                ", developer ='" + developer + '\'' +
                ", genre ='" + genre + '\'' +
                ", price = R" + price +
                '}';
    }
}


