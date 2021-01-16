package me.seakeer.sharing.design.pattern.a02behavioral.observer.alpha;

/**
 * DepartmentMessager: ConcreteObserver 2;
 * 部门消息专员：具体观察者 2;
 *
 * @author Seakeer;
 * @date 2020/3/31;
 */
public class DepartmentMessager implements NoticeListener {

    private String name;

    public DepartmentMessager(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void readNotice(String noticeContent) {
        System.out.println(name + "阅读了公告：" + noticeContent);
    }
}
