/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Screens.*;
import java.sql.*;
import login.loginDB;

/**
 *
 * @author AZA
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            new Loginscreen();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
