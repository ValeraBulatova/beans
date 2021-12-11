package xml_configuration;

import org.springframework.stereotype.Component;

@Component
class SecondXmlBean {

    private static final String name = String.valueOf(SecondXmlBean.class);

    void getName() {
        System.out.println("Name of bean is " +  name);
    }
}
