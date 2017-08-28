package com.example.mishr.icycandy;


import java.util.ResourceBundle;

/**
 * Created by mishr on 27/08/2017.
 */
public class DataModel  {


    private String head;
    private String desc;
    private int image;
    public DataModel(String head, int image, String desc){
        this.head=head;
        this.desc=desc;
        this.image=image;
    }



    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String head) {
        this.desc = desc;
    }

    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }
}


