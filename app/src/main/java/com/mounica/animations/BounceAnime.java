package com.mounica.animations;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;

/**
 * Created by mounicachikkam on 5/15/18.
 */

public class BounceAnime extends Fragment {

  @Override
  public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
    return super.onCreateAnimation(transit, enter, nextAnim);
  }

  @Override
  public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
    return super.onCreateAnimator(transit, enter, nextAnim);
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    //inflate view
    View view = inflater.inflate(R.layout.bounce,null);
    ObjectAnimator animator = ObjectAnimator.ofFloat(view,"Y",1000);
    animator.setDuration(2000);
    animator.setRepeatCount(ValueAnimator.INFINITE);
    animator.setInterpolator(new BounceInterpolator());
    animator.start();
    return view;
  }

  @Override
  public void onPause() {
    super.onPause();
  }
}
