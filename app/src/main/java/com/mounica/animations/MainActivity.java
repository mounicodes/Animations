package com.mounica.animations;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.mounica.animations.ButtonPanelFragment.ButtonSelectionListener;

public class MainActivity extends AppCompatActivity implements ButtonSelectionListener{

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //When the app is launched load buttonpanel fragment
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.add(R.id.frgcontainer_buttonpanel, new ButtonPanelFragment()).commit();


  }

  @Override
  public String onButtonSelected(String button) {
    switch(button){
      case Constants.BOUNCE:
        FragmentTransaction curvedAnimation = getSupportFragmentManager().beginTransaction();
        curvedAnimation.replace(R.id.frgcontainer_animation,new BounceAnime()).commit();
        break;
      case Constants.SPIN:
        FragmentTransaction spinAnimation = getSupportFragmentManager().beginTransaction();
        spinAnimation.replace(R.id.frgcontainer_animation,new SpinAnime()).commit();
        break;
    }
    return null;
  }

}
