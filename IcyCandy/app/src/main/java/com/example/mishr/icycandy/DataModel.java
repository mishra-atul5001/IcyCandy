package com.example.mishr.icycandy;


/**
 * Created by mishr on 27/08/2017.
 */

class DataModel  {

    private String head;
    private String desc;
    private int image;

    DataModel(String head, int image, String desc){
        this.head=head;
        this.desc=desc;
        this.image=image;
    }

    String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    String getDesc() {
        return desc;
    }

    public void setDesc(String head) {
        this.desc = desc;
    }

    int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }
}


