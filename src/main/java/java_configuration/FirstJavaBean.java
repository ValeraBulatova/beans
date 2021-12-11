package java_configuration;


class FirstJavaBean {

    private static final String name = String.valueOf(FirstJavaBean.class);

    void getName() {
        System.out.println("Name of bean is " +  name);
    }
}
