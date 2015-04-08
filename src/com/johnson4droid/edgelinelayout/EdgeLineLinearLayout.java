package com.johnson4droid.edgelinelayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by zdh on 4/7/2015.
 */
public class EdgeLineLinearLayout extends LinearLayout{
    public EdgeLineLinearLayout(Context context) {
        super(context);
    }

    public EdgeLineLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EdgeLineLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);

        //TODO Draw a line at the edge of the layout.

    }
}
