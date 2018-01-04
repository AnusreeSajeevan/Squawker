package android.example.com.squawker.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Design on 04-01-2018.
 */

/**
 * listens for the changes in instance id
 */
public class SquawkerFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = SquawkerFirebaseInstanceIdService.class.getSimpleName();

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. Note that this is called when the InstanceID token
     * is initially generated so this is where you would retrieve the token.
     */
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "token : " + token);

        /**
         * If you want to send messages to this application instance or
         manage this apps subscriptions on the server side, send the
         Instance ID token to your app server here
         */
    }
}
