package com.way.once.base;

/**
 * Created by pc on 2016/8/17.
 */

public interface BaseView<T> {

    /**
     * 使用fragment作为view时，将activity中的presenter传递给fragment
     *
     * @param presenter
     */
    void setPresenter(T presenter);

}