package me.seakeer.sharing.design.pattern.a02behavioral.mediator.jdk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * MediatorPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-11-15;
 * @see java.lang.Runnable                                      --> AColleague        1   抽象同事类;
 * @see java.util.concurrent.ForkJoinTask.RunnableExecuteAction --> ConcreteColleague 2_A 具体同事类;
 * @see java.util.concurrent.ForkJoinTask.AdaptedRunnableAction --> ConcreteColleague 2_B 具体同事类;
 * @see java.util.concurrent.Executor#execute(Runnable)         --> IAMediator        3   抽象中介者类;
 * @see java.util.concurrent.ForkJoinPool                       --> ConcreteMediator  4   具体中介者类;
 */
public class MediatorPatternJdk {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(() -> System.out.println("MediatorPattern: Executor & ForkJoinPool"));
        forkJoinPool.submit(() -> System.out.println("MediatorPattern: Executor & ForkJoinPool"))
                .get();
    }
}
