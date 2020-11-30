package com.mingzhu.spring;

import lombok.Data;

@Data
public class Clothes {
    public String name;
    public String style;
    public String color;
    public double size;

    public Clothes(String name, String style, String color, double size) {
        this.name = name;
        this.style = style;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
