package me.seakeer.sharing.design.pattern.a02behavioral.observer.alpha;

/**
 * NoticeListener;
 * 接受通知的对象：抽象观察者 1;
 *
 * @author Seakeer;
 * @date 2020/3/31;
 */
public interface NoticeListener {

    /**
     * name;
     *
     * @return listener name;
     */
    String getName();

    /**
     * read notice;
     *
     * @param noticeContent notice content;
     */
    void readNotice(String noticeContent);
}
