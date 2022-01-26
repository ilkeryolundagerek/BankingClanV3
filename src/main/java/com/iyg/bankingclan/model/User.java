package com.iyg.bankingclan.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class User {

    String firstname;
    String lastname;
    String address;

    public User(Builder builder) {
        firstname = builder.firstname;
        lastname = builder.lastname;
        address = builder.address;
    }

    public static  Builder builder(){
        return new Builder();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class Builder {
        private String firstname, lastname, address;
        public Builder firstname(String fname){
            this.firstname = fname;
            return this;
        }
        public Builder lastname(String lname){
            this.lastname = lname;
            return this;
        }
        public Builder address(String addr){
            this.address = addr;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}
