package com.upgrad.ublog.dtos;

/**
 * TODO: 1.8. Declare 3 private instance variables in this class named as
 *  userId, emailId and password. Out of these 3 variables, userId will be of
 *  type int. Other two variables will be of type String.
 *
 * TODO: 1.9. Provide getters and setters for each of the instance variables. Also,
 *  provide a no-arg constructor and a parameterized constructor to create objects
 *  of User class.
 *
 * Note: Uncomment the toString() method given below, instead of writing a new one.
 */

public class User {
        private int userID;
        private String emailID;
        private String password;

        public int getUserID(){
            this.userID;
        }

        public String getEmailID(){
            this.emailID;
        }

        public String getPassword(){
            this.password;
        }

        public void setUserID(int userID){
            this.userID = userID;
        }

        public void setEmailID(String emailID){
            this.emailID = emailID;
        }

        public void setPassword(String password){
            this.password = password;
        }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUserId(1);
        user.setEmailId("dummy@dummy.com");
        user.setPassword("password");

        System.out.println(user);

//        /**
//         * Your output should be similar to this.
//         * User{userId=1, emailId='dummy@dummy.com', password='password'}
//         */
    }
}
