package EventListener;

import com.sgq.DemoEvent.DemoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import sun.awt.AppContext;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
@Component
public class DemoPublish {

    @Autowired
    ApplicationContext applicationContext;

    public void publish(String meg){

      applicationContext.publishEvent(new DemoEvent(this,meg));

    }
}
