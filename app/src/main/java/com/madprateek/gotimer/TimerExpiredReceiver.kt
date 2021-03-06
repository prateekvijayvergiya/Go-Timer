package com.madprateek.gotimer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.madprateek.gotimer.Util.NotificationUtil
import com.madprateek.gotimer.Util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)
        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
