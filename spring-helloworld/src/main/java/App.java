import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // переписал без кастинга
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean1 =
                applicationContext.getBean("helloworld", HelloWorld.class);
        Cat catBean =
                applicationContext.getBean("cat", Cat.class);
        Cat catBean1 =
                applicationContext.getBean("cat", Cat.class);
        //true
        System.out.println(bean.equals(bean1));
        //false
        System.out.println(catBean.equals(catBean1));
    }
}