package concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Aspect
public class Audience implements Performance {
    public void perform() {
        System.out.println("Performance");
    }
    @Before("execution(**concert.Widget.Widget(..)")
}
