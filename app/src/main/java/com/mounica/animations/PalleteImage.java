package com.mounica.animations;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.graphics.Palette;
import android.support.v7.graphics.Palette.PaletteAsyncListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mounicachikkam on 5/15/18.
 */

public class PalleteImage extends Fragment {

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pallete);
    if (myBitmap != null && !myBitmap.isRecycled()) {
      Palette palette = Palette.from(myBitmap).generate();
    }
    Palette.PaletteAsyncListener paletteAsyncListener = new PaletteAsyncListener() {
      @Override
      public void onGenerated(@NonNull Palette palette) {
      }
    };
    return super.onCreateView(inflater, container, savedInstanceState);
  }
}
