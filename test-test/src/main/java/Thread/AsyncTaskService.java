package Thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;

/**
 * @author siguiqiang
 * @create 2019-1-22
 */
@Service
public class AsyncTaskService {

    @Async
    public void ExecutorAsyncTask(Integer i){
        System.out.println("异步执行任务 = "+ i);
    }

    @Async
    public void ExecutorAsyncTaskPlus(Integer i){
        System.out.println("异步执行任务+1 = "+ (i+1));
    }
}
