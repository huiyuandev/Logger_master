package com.orhanobut.logger;

import com.orhanobut.logger.utils.NonNull;
import com.orhanobut.logger.utils.Nullable;
import ohos.hiviewdfx.HiLog;
import static com.orhanobut.logger.Utils.checkNotNull;

public class LogcatLogStrategy implements LogStrategy {

  static final String DEFAULT_TAG = "NO_TAG";

  @Override public void log(int priority, @Nullable String tag, @NonNull String message) {
    checkNotNull(message);

    if (tag == null) {
      tag = DEFAULT_TAG;
    }
    HiLog.info(null, tag, message);
    //Log.println(priority, tag, message);
  }
}
