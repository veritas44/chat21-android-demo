package chat21.android.demo.user_profile.show.mvp;

import org.chat21.android.core.exception.ChatRuntimeException;
import org.chat21.android.core.users.models.IChatUser;

import chat21.android.demo.base.MvpBaseView;

public interface ShowUserProfileMvpView extends MvpBaseView {

    void onContactChanged(IChatUser contact, ChatRuntimeException e);

    void onUserLoggedOut();

}