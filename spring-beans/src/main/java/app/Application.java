package app;

import app.config.AppConfig;
import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            //без кастинга
            AnimalsCage bean =
                    applicationContext.getBean("applic", AnimalsCage.class);
            bean.whatAnimalSay();

        }
    }

}
