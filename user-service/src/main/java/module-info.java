module user.service {
    requires base.service;
    provides base.service.MyService with user.service.UserService;
}