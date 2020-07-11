package com.environment.view.bookPanel;

import java.io.Serializable;

public class BookInfo implements Serializable {

    String title;
    private String category,quantity,reason;

    public BookInfo(String title, String category, String quantity, String reason) {
        this.title = title;
        this.category = category;
        this.quantity = quantity;
        this.reason = reason;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
 
}