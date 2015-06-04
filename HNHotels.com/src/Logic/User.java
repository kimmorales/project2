/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author Kimberly
 */
public class User {
    private String ID;
    private String name;
    private String lastName;
    private String genre;
    private String email;
    private String password;
    private int phoneNumber;
    private int type;

    public User(String ID, String name, String lastName, String genre, String email,
    String password, int phoneNumber, int type) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.genre = genre;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    

    public Void modifyProfile(String ID,String country, int phoneNumber, int currency){
        User temporalUser = HNHotelsCom.searchUser(ID);
        if(temporalUser instanceof Customer ){
            Customer temporalCustomer  =(Customer) temporalUser;
            temporalCustomer.setCountry(country);
            temporalCustomer.setPhoneNumber(phoneNumber);
            temporalCustomer.setCurrency(country);
                                     
                
            }
        else{
            Admin temporalAdmin = (Admin)temporalUser;
            temporalAdmin.setPhoneNumber(phoneNumber);            
    
        }
        return null;
    }
    
 
}
