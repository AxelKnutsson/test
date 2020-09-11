/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetrack1;
import Timetrack.model.User;
import Timetrack.model.Project;
import Timetrack.model.TimeFrame;

/**
 *
 * @author axelknutsson
 */
public class TimeTrack1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User myUser = new User();
        myUser.setID(1);
        myUser.setName("Kalle");
        myUser.setEmail("kalle@example.com");
        myUser.setPassword("changeIT");
        myUser.setAdmin(false);
       
        User myUser2 = new User(2, "Anders", "email@mail.com", "passs", false);
        
        TimeFrame myTimeFrame = new TimeFrame(1, "hi this is my time", "8.45", "16.00", 1);
        
        Project myProject = new Project("projectet", "pross", 1);
        
        //myUser.createProject("projectet", "pross", 1);
        
        System.out.println(myUser.getInfo());
    }
    
}
