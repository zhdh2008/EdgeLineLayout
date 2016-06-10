package com.johnson4droid.edgelinelayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;

/**
 * Created by zdh on 4/7/2015.
 */
public class EdgeLineRelativeLayout extends RelativeLayout {

    private Paint paint;

    public EdgeLineRelativeLayout(Context context) {
        super(context);
        initPaint(context);
    }

    public EdgeLineRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint(context);
    }

    public EdgeLineRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint(context);
    }

    private void initPaint(Context c) {
        paint = new Paint();
        paint.setColor(Color.BLACK);

        //set the  paint width
        float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2.0f, c.getResources().getDisplayMetrics());
        paint.setStrokeWidth(width);
    }

    private void drawBottomLine(Canvas canvas) {
        float startX = 0;
        float startY = getHeight();

        float stopX = getWidth();
        float stopY = startY;

        canvas.drawLine(startX,startY,stopX,stopY,paint);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        // draw a bottom line  on the  bottom of the bottom.
        drawBottomLine(canvas);
    }
}
