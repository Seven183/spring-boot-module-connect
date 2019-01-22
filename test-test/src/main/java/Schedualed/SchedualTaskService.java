package Schedualed;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
@Service
public class SchedualTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    //下面这个方法每隔 5 秒就会被调用，5 秒钟的间隔是指从上一次调用的完成之时开始算起
    @Scheduled(fixedDelay=5000) //
    // 一些需要周期性执行的代码


    // 如果你希望定时执行一段代码而非周期性地执行，则只需要将注解中的 fixedDelay 属性名改为 fixedRate 即可
    //。例如，下面这个方法每隔 5 秒就会被调用。此时的 5 秒就是从上一次调用之始开始算起了
    //@Scheduled(fixedRate = 5000)
    // 一些需要定期执行的代码

    //@Scheduled(initialDelay=1000, fixedRate=5000)
    // 需要周期性执行的代码
    //对于需要延迟执行又需要定期执行的代码，可以通过 initialDelay 属性来指定一个延迟时间。例如，下面这个方法会先等待 1 秒，然后才执行，此后每隔 5 秒再执行一次


    //@Scheduled(cron="*/5 * * * * MON-FRI")
    // 只需要在工作日之时才定期执行的代码
    //如果这些内置的属性还满足不了你的需求的话，那你可以通过 cron 表达式来指定你代码的执行时间。例如，下面这个方法只会在工作日才会执行
    public void reportNowTime(){
        System.out.println("每隔5秒执行一次 "+ dateFormat.format(new Date()));
    }



    //crontalLinux的定时时间（小时 天 月 年 星期）
    @Scheduled(cron ="0 22 01 ? * *")
    public void fixTime(){
        System.out.println("在指定时间 "+ dateFormat.format(new Date())+"执行");
    }

}
