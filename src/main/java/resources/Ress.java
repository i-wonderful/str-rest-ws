/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resources;

/**
 *
 * @author Olga Grazhdanova <dvl.java@gmail.com> at Oct 19, 2016
 */
//@XmlRootElement
public class Ress {

    private String name;

    public Ress(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
