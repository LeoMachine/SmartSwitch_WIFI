package com.example.smartswitch_wifi;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

public class changeNunPickerFontSizeAndColor extends NumberPicker {

    public changeNunPickerFontSizeAndColor(Context context) {
        super(context);
    }

    public changeNunPickerFontSizeAndColor(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public changeNunPickerFontSizeAndColor(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static void updateView(View view) {
        if (view instanceof EditText) {
            //这里修改字体的属性
            ((EditText) view).setTextColor(Color.parseColor("#233142"));
            ((EditText) view).setTextSize(50);

        }
    }

    @Override
    public void addView(View child) {
        super.addView(child);
        updateView(child);
    }

    @Override
    public void addView(View child, int index,
                        android.view.ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        updateView(child);
    }

    @Override
    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, params);
        updateView(child);
    }

}