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
public class UserFactory implements UserCreator{

    @Override
    public User addNewUser(String ID, String name, String lastName, String genre,
    String email, String password, int type, int phoneNumber, String country, String currency) {
         if(type ==0){
            return (new Admin(ID, name, lastName, genre, email, password, phoneNumber, type));
        }
        else{
            int membership = Global.getInstance().getUserCount();
            return(new Customer(membership,country, currency,ID, name, lastName, genre, email, password,phoneNumber, type));
        }
    }
    
}
