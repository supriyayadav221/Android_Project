package com.example.sumup;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class my_button_view extends AppCompatButton {
    public my_button_view(Context context) {
        super(context);
        init();
    }

    public my_button_view(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
  public void init()
  {
     setOnTouchListener(new OnTouchListener() {
         @Override
         public boolean onTouch(View v, MotionEvent event) {
             switch (event.getAction())
             {
                 case MotionEvent.ACTION_DOWN:
                     Animation b= AnimationUtils.loadAnimation(v.getContext(),R.anim.zoom_out);
                    v.startAnimation(b);

                     break;
                 case MotionEvent.ACTION_UP:
                     v.clearAnimation();
                     break;
             }
             return false;
         }
     });


  }
}
