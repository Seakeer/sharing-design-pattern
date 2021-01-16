package me.seakeer.sharing.design.pattern.a02behavioral.observer.alpha;

/**
 * ObserverPatternMain;
 * 观察者模式：发布订阅、改变与通知;
 * 目标类关联观察者;
 *
 * @author Seakeer;
 * @date 2020/3/31; 2018/8/21;
 * @see NoticeListener      --> IObserver        1 抽象观察者;
 * @see DepartmentMessager  --> ConcreteObserver 2 具体观察者;
 * @see BaseNoticeSystem    --> IACSubject       3 抽象目标;
 * @see CompanyNoticeSystem --> ConcreteSubject  4 具体目标;
 */
public class ObserverPatternMain {

    public static void main(String[] args) {

        BaseNoticeSystem noticeSystem = new CompanyNoticeSystem();

        NoticeListener department1, department2, department3;

        department1 = new DepartmentMessager("研发部");
        department2 = new DepartmentMessager("市场部");
        department3 = new DepartmentMessager("产品部");

        noticeSystem.dealSubscribe(department1);
        noticeSystem.dealSubscribe(department2);
        noticeSystem.dealSubscribe(department3);

        noticeSystem.publishNotice("系统", "今天全体休息一天");

        noticeSystem.notifyListener();

        noticeSystem.dealUnsubscribe(department1);
        noticeSystem.publishNotice("系统", "【紧急公告】今天不休息");
        noticeSystem.notifyListener();
    }
}
