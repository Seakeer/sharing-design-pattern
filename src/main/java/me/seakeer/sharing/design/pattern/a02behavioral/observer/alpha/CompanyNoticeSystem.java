package me.seakeer.sharing.design.pattern.a02behavioral.observer.alpha;

/**
 * CompanyNoticeSystem: ConcreteSubject;
 * 公司公告系统：具体目标 4
 *
 * @author Seakeer;
 * @date 2020/3/31;
 */
public class CompanyNoticeSystem extends BaseNoticeSystem {

    @Override
    public void notifyListener() {
        for (NoticeListener each : noticeListeners) {
            each.readNotice(getNotice());
        }
    }
}
