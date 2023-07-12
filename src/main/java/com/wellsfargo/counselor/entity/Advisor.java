package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
@Entity
public class Client{
    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private long advisorID;

    protected Client(){

    }
    public Client(String firstName, String lastName, String address, String phone, String email, long advisorID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisorID=advisorID;
    }
    public Long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAdvisorID() {
        return advisorID;
    }

    public void setAdvisorID( long advisorID) {
        this.advisorID = advisorID;
    }
}

@Entity
public class Portfolio{
    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long ClientID;

    protected Portfolio(){

    }

    public Portfolio(long ClientID) {
        this.ClientID=ClientID;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public long getClientID() {
        return ClientID();
    }

    public void setClientIDlientID(long clientID) {
        this.ClientID = clientID;
    }
}

@Entity
public class Security{
    @Id
    @GeneratedValue()
    private long SecurityId;

    @Column(nullable = false)
    private String securityName;
    @Column(nullable = false)
    private long category;
    @Column(nullable = false)
    private long purchaseDate;
    @Column(nullable = false)
    private long purchasePrice;
    @Column(nullable = false)
    private long quantity;
    @Column(nullable = false)
    private long portfolioID;

    protected Security(){

    }

    public Security( string securityName, long category, long purchaseDate, purchasePrice, quantity, portfolioID) {
        this.securityName=securityName;
        this.category=category;
        this.purchaseDate=purchaseDate;
        this.purchasePrice=purchasePrice;
        this.quantity=quantity;
        this.portfolioID=portfolioID;
    }

    public Long getSecurityID() {
        return securityID;
    }

    public String getSecurityName() {
        return securityName();
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public long getCategory() {
        return category();
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getPurchaseDate() {
        return purchaseDate();
    }

    public void setPurchaseDate(long purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice();
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getQuantity() {
        return quantity();
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPortfolioID() {
        return portfolioID();
    }

    public void setPortfolioID(long portfolioID) {
        this.portfolioID = portfolioID;
    }
}



