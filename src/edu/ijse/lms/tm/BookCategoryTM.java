/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.lms.tm;

/**
 *
 * @author DELL
 */
public class BookCategoryTM {
    private String categoryCode;
    private String category;
    private String description;

    public BookCategoryTM(String categoryCode, String category, String description) {
        this.categoryCode = categoryCode;
        this.category = category;
        this.description = description;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BookCategoryTM{" + "categoryCode=" + categoryCode + ", category=" + category + ", description=" + description + '}';
    }
    
    
}
