package com.espian.showcaseview.utils;

import android.graphics.RectF;
import com.espian.showcaseview.ShowcaseView;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;

public class RectAnimator {

    public static Animator ofRects(Object object,
                                   String leftMethod, String topMethod, String rightMethod, String bottomMethod,
                                   RectF... values) {
        AnimatorSet set = new AnimatorSet();
        int[] leftValues = new int[values.length];
        int[] topValues = new int[values.length];
        int[] rightValues = new int[values.length];
        int[] bottomValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            leftValues[i] = (int) values[i].left;
            topValues[i] = (int) values[i].top;
            rightValues[i] = (int) values[i].right;
            bottomValues[i] = (int) values[i].bottom;
        }
        ObjectAnimator leftAnimator = ObjectAnimator.ofInt(object, leftMethod, leftValues);
        ObjectAnimator topAnimator = ObjectAnimator.ofInt(object, topMethod, topValues);
        ObjectAnimator rightAnimator = ObjectAnimator.ofInt(object, rightMethod, rightValues);
        ObjectAnimator bottomAnimator = ObjectAnimator.ofInt(object, bottomMethod, bottomValues);
        set.playTogether(leftAnimator, topAnimator, rightAnimator, bottomAnimator);
        return set;
    }

    public static Animator ofRects(ShowcaseView showcaseView, RectF... values) {
        return ofRects(showcaseView, "showcaseX", "showcaseY", "showcaseRight", "showcaseBottom", values);
    }

}
