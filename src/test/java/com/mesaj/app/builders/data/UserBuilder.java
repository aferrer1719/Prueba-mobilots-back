package com.mesaj.app.builders;

import com.mesaj.app.models.User;

public class UserBuilder {
    private User user;
    public static UserBuilder anUser(){ //llamo al usuario
         return new UserBuilder();} //devuelvo la información

    public UserBuilder but(){
        return withDefaultInfo();
    }

    //WithDefault llena la variable User con los valores por defecto usando el builder
     public UserBuilder withDefaultInfo(){
        this.user= user.builder()
                .usuario("bingoFullGlobal")
                .contrasena("mob_M_2017").build();
        return this; //devuelvo el usuario
     }
     public User build(){
        return this.user;
     }
}
