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
public interface UserCreator {
    public User addNewUser(String ID,String name, String lastName, String genre, 
   String email, String password, int type,int phoneNumber,String country,String currency);
}
