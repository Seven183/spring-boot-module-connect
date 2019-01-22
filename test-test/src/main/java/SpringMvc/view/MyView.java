package SpringMvc.view;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @author siguiqiang
 * @create 2018-12-20
 */
@Component
public class MyView implements View {

    @Override
    public String getContentType() {
        return "text/xml";
    }

    @Override
    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        httpServletResponse.getWriter().print("hello view, time: " + new Date());
    }
}
