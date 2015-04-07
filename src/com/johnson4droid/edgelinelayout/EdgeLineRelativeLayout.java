package com.johnson4droid.edgelinelayout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by zdh on 4/7/2015.
 */
public class EdgeLineRelativeLayout extends RelativeLayout {

    public EdgeLineRelativeLayout(Context context) {
        super(context);
    }

    public EdgeLineRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EdgeLineRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

}
