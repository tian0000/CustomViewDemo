package com.example.tian.customviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * @name yanantian
 * @motto 莫羡他人谢语花, 腹有诗书气自华
 * @E-mail 1173568715@qq.com
 * @WX 15978622391
 */

public class Text extends View {
    private Paint paint;
    private float width;
    private float higet;
    private float size;
    private int color;
    private String string;

    public Text(Context context) {
        super(context);
    }


    public Text(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
        this(context, attrs, 0);
    }

    public Text(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // 加载自定义属性集合Text
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Text);
        width = a.getDimension(R.styleable.Text_text_width, 0);
        higet = a.getDimension(R.styleable.Text_text_higet, 0);
        size = a.getDimension(R.styleable.Text_text_size, 0);
        color = a.getColor(R.styleable.Text_text_color, 0);
        string = a.getString(R.styleable.Text_text_string);
        a.recycle();
        Log.e("-----------", width + "-----" + higet + "---------" + size + "-------" + color + "------" + string);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        初始化paint
        paint = new Paint();
        paint.setColor(color);
        paint.setTextSize(size);
        canvas.drawText(string, size, size, paint);
    }


}
