package com.mounica.animations;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mounicachikkam on 5/15/18.
 */

public class ButtonPanelFragment extends Fragment implements OnClickListener {
  private ButtonSelectionListener mButtonSelectionListener;
  private static final String TAG = "ButtonPanelFragment";

  public interface ButtonSelectionListener{
    public String onButtonSelected(String button);
  }


  private Button mCurved;
  private Button mSpring;
  private Button mButton3;
  String mButton = "";

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.button_panel, container,false);
    //get the button clicked
    mCurved = view.findViewById(R.id.bounce);
    mSpring = view.findViewById(R.id.spring);
    mButton3 = view.findViewById(R.id.button3);
    mCurved.setOnClickListener(this);
    mSpring.setOnClickListener(this);
    mButton3.setOnClickListener(this);
    return view;
  }

  @Override
  public void onPause() {
    super.onPause();
  }

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    try{
        mButtonSelectionListener = (ButtonSelectionListener)getActivity();
    }catch(ClassCastException e){
      throw new ClassCastException(getActivity().toString()
          + " must implement OnHeadlineSelectedListener");
    }
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.bounce:
        mButton = Constants.BOUNCE;
        break;
      case R.id.spring:
        mButton = Constants.SPIN;
        break;
      case R.id.button3:
        mButton = Constants.BUTTON3;
        break;
    }
    mButtonSelectionListener.onButtonSelected(mButton);
  }
}
