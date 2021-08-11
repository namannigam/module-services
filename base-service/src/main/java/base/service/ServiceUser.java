package base.service;

import java.util.ServiceLoader;

public class ServiceUser implements MyService {
    private static MyService myService = new ServiceUser();

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("trying to load " + args[0] + " environment.");
            ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
            System.out.println("Services found : " + myServices.stream().count());
            for (MyService ms : myServices) {
                System.out.println(ms.name());
                if (ms.name().equalsIgnoreCase(args[0])) {
                    myService = ms;
                }
            }
        }
        myService.doSomething();
    }

    @Override
    public void doSomething() {
        System.out.println("The default service is acting.");
    }

    @Override
    public String name() {
        return "Default";
    }
}