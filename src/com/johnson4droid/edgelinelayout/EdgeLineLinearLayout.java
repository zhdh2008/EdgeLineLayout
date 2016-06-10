package com.johnson4droid.edgelinelayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;

/**
 * Created by zdh on 4/7/2015.
 */
public class EdgeLineLinearLayout extends LinearLayout {

    private Paint paint;

    public EdgeLineLinearLayout(Context context) {
        super(context);
        initPaint(context);
    }

    public EdgeLineLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint(context);
    }

    public EdgeLineLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        drawBottomLine(canvas);
    }

    /**
     * Draw a line at the bottom of  the layout.
     *
     * @param canvas
     *         The canvas to draw
     */
    private void drawBottomLine(Canvas canvas) {
        //Draw a line at the edge of the layout.
        float startX = 0;
        float startY = getHeight();
        float stopX = getWidth();
        float stopY = getHeight();

        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }
}
