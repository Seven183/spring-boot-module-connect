package EventListener;

import com.sgq.DemoEvent.DemoEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {

        String meg = demoEvent.getMeg();

        System.out.println("meg="+meg);
    }

}