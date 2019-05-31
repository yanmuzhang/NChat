package org.flyants.book.view.my.meinfo;

import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;

import org.flyants.book.R;
import org.flyants.book.custom.Header;
import org.flyants.book.network.image.ImageLoader;
import org.flyants.book.network.image.glide.CenterCropImageLoaderImpl;
import org.flyants.book.view.my.UserInfo;
import org.flyants.common.mvp.impl.BaseActivity;

import butterknife.BindView;

public class MeInfoView extends BaseActivity<MeInfoPrecenter> implements UIMeInfoView {

    @BindView(R.id.idHeader)  Header idHeader;

    @BindView(R.id.icon) ImageView icon;
    @BindView(R.id.nickName)  TextView nickName;
    @BindView(R.id.chat_no)  TextView chat_no;
    @BindView(R.id.people_introduction)  TextView people_introduction;
    @BindView(R.id.peopleAssistCount)  TextView peopleAssistCount;
    @BindView(R.id.peopleAssist)  ImageView peopleAssist;
    @BindView(R.id.send_message)  ImageView send_message;
    @BindView(R.id.send_dynamic)  ImageView send_dynamic;
    @BindView(R.id.edit_people_info)  ImageView edit_people_info;
    @BindView(R.id.location)  TextView location;

    ImageLoader imageLoader = new CenterCropImageLoaderImpl();

    @Override
    public MeInfoPrecenter buildPresenter() {
        return new MeInfoPrecenter(this,this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.me_info;
    }

    @Override
    public void onViewInit() {
//        idHeader.setBackgrund(Color.parseColor("#50FFFFFF"));
        idHeader.setHeaderTitle("");
    }

    @Override
    public void onViewStart() {

    }


    @Override
    public void setViewAttrs(UserInfo resp) {
        imageLoader.loader(resp.getEncodedPrincipal(),icon);
        nickName.setText(resp.getNickName()+"");
        chat_no.setText(getString(R.string.app_name)+"号:"+resp.getPeopleNo()+"");
        people_introduction.setText(resp.getIntroduction()+"");
        peopleAssistCount.setText(resp.getPeopleAssistCount()+"");
        peopleAssistCount.setText(resp.getPeopleAssistCount()+"");
        location.setText("所在地：   "+resp.getLocation()+"");
    }

    @Override
    public void onViewDestroy() {

    }
}