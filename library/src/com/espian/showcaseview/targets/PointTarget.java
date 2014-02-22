package com.espian.showcaseview.targets;

import android.graphics.Point;
import android.graphics.RectF;

public class PointTarget implements Target {

    private final Point mPoint;

    public PointTarget(Point point) {
        mPoint = point;
    }

    public PointTarget(int xValue, int yValue) {
        mPoint = new Point(xValue, yValue);
    }

    @Override
    public Point getPoint() {
        return mPoint;
    }

    @Deprecated
    public RectF getRectF() {
        return null;
    }
}
