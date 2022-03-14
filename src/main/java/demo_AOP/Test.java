package demo_AOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;

public class Test {  
public static void main(String[] args) {  
    ClassPathResource r=new ClassPathResource("NewFile.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Business a=factory.getBean("proxy",Business.class);  
    a.m();  
}  
}  