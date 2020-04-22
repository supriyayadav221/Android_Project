package com.example.sumup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class editText_View extends AppCompatEditText {
    Drawable clear,clear1;
    public editText_View(Context context) {

        super(context);
        init();
    }

    public editText_View(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public editText_View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    public void init()
    {
        clear= ResourcesCompat.getDrawable(getResources(),R.drawable.ic_cancel_black_24dp,null);
        clear1= ResourcesCompat.getDrawable(getResources(),R.drawable.ic_close_black_24dp,null);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                   showButton();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                  float clearButtonStart;
                  boolean isClicked=false;
                  clearButtonStart=getWidth()-getPaddingEnd()-clear.getIntrinsicWidth();
                  if(event.getX()>clearButtonStart)
                  {
                      isClicked=true;
                  }
                  if(isClicked)
                  {
                      switch (event.getAction())
                      {
                          case MotionEvent.ACTION_DOWN:
                              getText().clear();
                              break;
                          case MotionEvent.ACTION_UP:
                              hideButton();
                              break;
                      }
                  }
                  return false;
            }
        });
    }


    void showButton()

    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,clear,null);
    }
    void hideButton()
    {
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,clear1,null);
    }
}
