package com.example.recyclerlistview_prac;

public class ModelClass {

    private int pic;
    private String Name;

    public ModelClass(String name, int Pic) {
        Name = name;
        pic=Pic;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
