package org.flyants.book.store;

import android.content.Context;

/**
 * APP 设置
 */
public class AppConfigStrore {

    private Integer chatRecordCloudStore = 0;//聊天记录云存储
    private Integer messageNotifyVoice = 0;//消息通知声音
    private Integer messageNotifyShake = 0;//消息通知震动

    private Integer addMeMethod = 0;//添加我的方式
    private Integer addMeVerify = 0;//添加我需要验证

    private Integer allowTomeRecommendedGroup = 0;//允许向我推荐内容

    private Integer dynameicVideoPlayNet = 0;//动态视频自动播放网络   WI-FI 4G

    public static AppConfigStrore me = new AppConfigStrore();


    public void loaderAppConfig(Context context,OnAppConfigStrore onAppConfigStrore){
        onAppConfigStrore.OnAppConfigStrore(this);
    }














    public Integer getChatRecordCloudStore() {
        return chatRecordCloudStore;
    }

    public void setChatRecordCloudStore(Integer chatRecordCloudStore) {
        this.chatRecordCloudStore = chatRecordCloudStore;
    }

    public Integer getMessageNotifyVoice() {
        return messageNotifyVoice;
    }

    public void setMessageNotifyVoice(Integer messageNotifyVoice) {
        this.messageNotifyVoice = messageNotifyVoice;
    }

    public Integer getMessageNotifyShake() {
        return messageNotifyShake;
    }

    public void setMessageNotifyShake(Integer messageNotifyShake) {
        this.messageNotifyShake = messageNotifyShake;
    }

    public Integer getAddMeMethod() {
        return addMeMethod;
    }

    public void setAddMeMethod(Integer addMeMethod) {
        this.addMeMethod = addMeMethod;
    }

    public Integer getAddMeVerify() {
        return addMeVerify;
    }

    public void setAddMeVerify(Integer addMeVerify) {
        this.addMeVerify = addMeVerify;
    }

    public Integer getAllowTomeRecommendedGroup() {
        return allowTomeRecommendedGroup;
    }

    public void setAllowTomeRecommendedGroup(Integer allowTomeRecommendedGroup) {
        this.allowTomeRecommendedGroup = allowTomeRecommendedGroup;
    }

    public Integer getDynameicVideoPlayNet() {
        return dynameicVideoPlayNet;
    }

    public void setDynameicVideoPlayNet(Integer dynameicVideoPlayNet) {
        this.dynameicVideoPlayNet = dynameicVideoPlayNet;
    }

    public interface OnAppConfigStrore{
        void OnAppConfigStrore(AppConfigStrore appConfigStrore);
    }
}