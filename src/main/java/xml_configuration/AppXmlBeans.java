package xml_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class AppXmlBeans {

    private static SecondXmlBean secondXmlBean;

    public AppXmlBeans(SecondXmlBean secondXmlBean) {
        AppXmlBeans.secondXmlBean = secondXmlBean;
    }

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
        FirstXmlBean firstXmlBean = (FirstXmlBean) appContext.getBean("first");
        firstXmlBean.getName();
        secondXmlBean.getName();
    }
}
