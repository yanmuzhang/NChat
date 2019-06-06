package org.flyants.book.view.conversation;

import com.liaoinstan.springview.widget.SpringView;

import org.flyants.book.network.RequestUtils;
import org.flyants.book.resources.ConversationApis;
import org.flyants.book.store.ConversationStore;
import org.flyants.common.store.OnCallback;
import org.flyants.common.mvp.impl.BasePresenter;

import java.util.List;

class ConversationPrecenter extends BasePresenter<ConversationView, UIConversationView> implements SpringView.OnFreshListener{

    ConversationApis conversationApis;

    public ConversationPrecenter(ConversationView t, UIConversationView uiExperienceView) {
        super(t, uiExperienceView);
    }

    @Override
    public void onViewInit() {
        conversationApis = RequestUtils.build(ConversationApis.class);
    }


    @Override
    public void onRefresh() {
        ConversationStore.getInstence().loadObject(context, new OnCallback<List<ConversationResp>>() {
            @Override
            public void call(List<ConversationResp> resps) {
                uiView.setPullLoadMoreCompleted(0,resps);
            }
        });
    }

    @Override
    public void onLoadmore() {

    }

    @Override
    public void onViewStart() {

    }

    @Override
    public void onViewDestroy() {

    }


}
