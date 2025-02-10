/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.lms.tm;

/**
 *
 * @author DELL
 */
public class ReturnTM {
    private String memberID;
    private String bookCode;
    private String returnDate;
    private double fine;

    public ReturnTM(String memberID, String bookCode, String returnDate, double fine) {
        this.memberID = memberID;
        this.bookCode = bookCode;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public ReturnTM() {
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "ReturnTM{" + "memberID=" + memberID + ", bookCode=" + bookCode + ", returnDate=" + returnDate + ", fine=" + fine + '}';
    }
    
    
}
