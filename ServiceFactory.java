package com.upgrad.ublog.services;

/**
 * TODO: 3.14. Provide a factory method which returns PostServiceImpl object. (Hint: Return type
 *  of this method should be PostService)
 * TODO: 3.15. Provide a factory method which returns UserServiceImpl object. (Hint: Return type
 *  of this method should be UserService)
 */

public class ServiceFactory {
    private PostService postServiceImpl;
    private UserService userServiceImpl;
    public PostService postServiceFactory(){
        return postServiceImpl;
    }
    public UserService userServiceFactory(){
        return userServiceImpl;
    }
}
