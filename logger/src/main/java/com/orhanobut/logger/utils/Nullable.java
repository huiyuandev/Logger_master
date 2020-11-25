package com.orhanobut.logger.utils;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Denotes that a parameter, field or method return value can be null.
 * <p>
 * When decorating a method call parameter, this denotes that the parameter can
 * legitimately be null and the method will gracefully deal with it. Typically
 * used on optional parameters.
 * <p>
 * When decorating a method, this denotes the method might legitimately return
 * null.
 * <p>
 * This is a marker annotation and it has no specific attributes.
 *
 * @paramDoc This value may be {@code null}.
 * @returnDoc This value may be {@code null}.
 * @hide
 */
@Retention(SOURCE)
@Target({METHOD, PARAMETER, FIELD})
public @interface Nullable {
}
