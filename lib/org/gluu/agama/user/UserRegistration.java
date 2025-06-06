package org.gluu.agama.user;

import java.util.Map;

import org.gluu.agama.registration.JansUserRegistration;



public abstract class UserRegistration {
    public abstract String addNewUser(Map<String, String> profile) throws Exception;
    
    public static UserRegistration getInstance(){
        return  JansUserRegistration.getInstance();
    }    
}
