package user.service;

import base.service.MyService;

public class UserService implements MyService {

    @Override
    public String name() {
        return "User1";
    }

    @Override
    public void doSomething() {
        System.out.println("User1 is acting.");
    }
}