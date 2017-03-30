package com.example.next.testnb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by next on 30/3/17.
 */
public class DrawView extends View implements View.OnTouchListener {

    List<Point> points = new ArrayList<Point>();
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.setOnTouchListener(this);
        paint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        for (Point point : points) {
            canvas.drawCircle(point.x, point.y, 2, paint);
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Point point = new Point();
        point.x = event.getX();
        point.y = event.getY();
        points.add(point);
        invalidate();
        return true;

    }

   private class Point {
        float x, y;
    }
}
