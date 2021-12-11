package java_configuration;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppJavaBeans {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        FirstJavaBean fb = context.getBean(FirstJavaBean.class);
        SecondJavaBean sb = context.getBean(SecondJavaBean.class);

        fb.getName();
        sb.getName();
    }
}