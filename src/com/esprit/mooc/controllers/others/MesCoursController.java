/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.mooc.controllers.others;

import com.esprit.mooc.Entities.Utilisateur;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 *
 * @author kods
 */
class MesCoursController implements Initializable{

    private Utilisateur loggedUser;
    MesCoursController(Utilisateur loggedUser) {
        this.loggedUser=loggedUser;
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       }
    
}
