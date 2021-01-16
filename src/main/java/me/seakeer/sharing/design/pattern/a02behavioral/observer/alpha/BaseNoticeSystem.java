package me.seakeer.sharing.design.pattern.a02behavioral.observer.alpha;

import java.util.ArrayList;
import java.util.List;

/**
 * BaseNoticeSystem: IACSubject;
 * 基本公告系统：抽象目标 3;
 * 可以设计为接口，抽象类，具体类;
 *
 * @author Seakeer;
 * @date 2020/3/31;
 */
public abstract class BaseNoticeSystem {

    protected List<NoticeListener> noticeListeners = new ArrayList<>();
    private String notice;

    /**
     * 处理订阅者
     *
     * @param noticeListener
     */
    public void dealSubscribe(NoticeListener noticeListener) {
        System.out.println(noticeListener.getName() + "订阅了公告");
        noticeListeners.add(noticeListener);
    }

    /**
     * 处理取消订阅者
     *
     * @param department
     */
    public void dealUnsubscribe(NoticeListener department) {
        System.out.println(department.getName() + "取消了订阅公告");
        noticeListeners.remove(department);
    }

    public String getNotice() {
        return notice;
    }

    public void publishNotice(String publisher, String notice) {
        this.notice = notice;
        System.out.println("发布者： " + publisher + "; 公告内容：" + notice);
    }

    /**
     * 通知
     */
    public abstract void notifyListener();
}
