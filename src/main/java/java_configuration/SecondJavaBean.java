package java_configuration;

import org.springframework.stereotype.Component;

@Component
class SecondJavaBean {

    private static final String name = String.valueOf(SecondJavaBean.class);

    void getName() {
        System.out.println("Name of bean is " +  name);

    }
}
