package com.example.administrator.competition.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

public class RunTextView   {


    private int duration = 1500;
    private int number;

    public float getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 显示
     * @param number
     */
    public void runWithAnimation(int number,ValueAnimator.AnimatorUpdateListener listener){
        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(
                this, "number", 0, number);
        objectAnimator.setDuration(duration);
        objectAnimator.setInterpolator(new DecelerateInterpolator());

        objectAnimator.start();
        objectAnimator.addUpdateListener(listener);
    }
}
