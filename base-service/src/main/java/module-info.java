module base.service {
    exports base.service;
//    uses base.service.MyService;
    provides base.service.MyService with base.service.ServiceUser;
}