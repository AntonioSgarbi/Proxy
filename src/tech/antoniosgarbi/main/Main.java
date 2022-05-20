package tech.antoniosgarbi.main;

import tech.antoniosgarbi.Image;
import tech.antoniosgarbi.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image =   new ProxyImage("picture.jpg");

        //load from disk
        image.display();
        System.out.println();

        //load from class
        image.display();
    }

}