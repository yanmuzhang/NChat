package org.flyants.book.view.my.editinfo;

import org.flyants.book.network.RequestUtils;
import org.flyants.book.network.okhttp.RespEmptyCall;
import org.flyants.book.resources.Apis;
import org.flyants.book.store.UserStore;
import org.flyants.book.view.my.UserInfo;
import org.flyants.common.mvp.impl.BasePresenter;
import org.flyants.common.store.OnCallback;

public class EditUserInfoPrencenter extends BasePresenter<EditUserInfoView,UIEditUserInfoView> {

    Apis apis;

    public EditUserInfoPrencenter(EditUserInfoView t, UIEditUserInfoView uiEditUserInfoView) {
        super(t, uiEditUserInfoView);
    }

    @Override
    public void onViewInit() {
        apis = RequestUtils.build(Apis.class);
    }

    @Override
    public void onViewStart() {
        UserStore.getInstence().loadObject(context, new OnCallback<UserInfo>() {
            @Override
            public void call(UserInfo userInfo) {
                uiView.setVeiwAttrs(userInfo);
            }
        });

    }

    @Override
    public void onViewDestroy() {

    }

    public void updateSex(String sex) {
        UserInfo userInfo = new UserInfo();
        userInfo.setSex(sex);
        apis.updatePeopleInfo(userInfo).enqueue(new RespEmptyCall(){
            @Override
            public void onSuccess() {
                super.onSuccess();
                UserStore.getInstence().clean();
            }
        });
    }

    public void updateNickName(String content) {
        UserInfo userInfo = new UserInfo();
        userInfo.setNickName(content);
        apis.updatePeopleInfo(userInfo).enqueue(new RespEmptyCall(){
            @Override
            public void onSuccess() {
                super.onSuccess();
                UserStore.getInstence().clean();
            }
        });
    }

    public void updateIntroduction(String content) {
        UserInfo userInfo = new UserInfo();
        userInfo.setIntroduction(content);
        apis.editPeopleIntroduction(content).enqueue(new RespEmptyCall(){
            @Override
            public void onSuccess() {
                super.onSuccess();
                UserStore.getInstence().clean();
            }
        });
    }
}