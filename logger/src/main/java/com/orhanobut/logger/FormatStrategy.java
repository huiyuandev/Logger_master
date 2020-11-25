package com.orhanobut.logger;

import com.orhanobut.logger.utils.NonNull;
import com.orhanobut.logger.utils.Nullable;

/**
 * Used to determine how messages should be printed or saved.
 *
 * @see PrettyFormatStrategy
 * @see CsvFormatStrategy
 */
public interface FormatStrategy {

  void log(int priority, @Nullable String tag, @NonNull String message);
}
