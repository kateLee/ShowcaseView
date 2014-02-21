package com.espian.showcaseview.drawing;

import com.espian.showcaseview.utils.ShowcaseAreaCalculator;

import android.graphics.Canvas;

/**
 * Created by curraa01 on 13/10/2013.
 * Modified by kateLee on 21/02/2014.
 */
public interface ClingDrawer extends ShowcaseAreaCalculator {

    void eraseCircle(Canvas canvas, float x, float y, float radius);
    void eraseRectangle(Canvas canvas, float left, float top, float right, float bottom);
    void eraseRoundRectangle(Canvas canvas, float left, float top, float right, float bottom, float radius);
    void drawShowcase(Canvas canvas, float x, float y, float scaleMultiplier, float radius);

    int getShowcaseWidth();

    int getShowcaseHeight();

}
