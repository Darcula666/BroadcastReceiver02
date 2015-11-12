package net.gfdz.com.broadcastreceiver02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/11/12.
 *            静态注册
 *   我们准备让程序接收一条开机广播， 当收到这条广播时就可以在 onReceive()方法里
 执行相应的逻辑，从而实现开机启动的功能
 1.新建一个 BootCompleteReceiver 继承自BroadcastReceiver
 2.修改 AndroidManifest.xml 文件:
 <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
 <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
 <application
 android:allowBackup="true"
 android:icon="@drawable/ic_launcher"
 android:label="@string/app_name"
 android:theme="@style/AppTheme" >
 ……
 <receiver android:name=".BootCompleteReceiver" >
 <intent-filter>
 <action android:name="android.intent.action.BOOT_COMPLETED" />
 </intent-filter>
 </receiver>
 </application>
 3.重新运行程序后，我们的程序就已经可以接收开机广播了,
 然后将模拟器关闭并重新启动，在启动完成之后就会收到开机广播了
 */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Boot Complete", Toast.LENGTH_LONG).show();
    }
}
