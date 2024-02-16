package com.ExceptionHandling;

 class UserDefined extends Exception{
    UserDefined(String str){
        super(str);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try{
            throw new UserDefined("This is userDefined exception.");
        }catch(UserDefined user){
            System.out.println("Exception caught");
            System.out.println(user.getMessage());
        }
    }
}
