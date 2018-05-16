package com.mounica.animations;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by mounicachikkam on 5/15/18.
 */

public class SpinAnime extends Fragment {  @Nullable
@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
    @Nullable Bundle savedInstanceState) {
  //inflate view
  View view = inflater.inflate(R.layout.spin,null);
  ImageView image = view.findViewById(R.id.circle);
  ObjectAnimator animator = ObjectAnimator.ofFloat(image,"rotationX",0.5f,360f);
  animator.setRepeatCount(ValueAnimator.INFINITE);
  animator.setDuration(1000);
  animator.start();
  return view;
}



}
