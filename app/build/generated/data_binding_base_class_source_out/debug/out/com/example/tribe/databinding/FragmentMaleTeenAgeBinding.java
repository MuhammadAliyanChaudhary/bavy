// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tribe.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMaleTeenAgeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText ageTeen;

  @NonNull
  public final AppBarLayout bar;

  @NonNull
  public final Button buttonResultTeen;

  @NonNull
  public final TextView detailTextTeen;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView username;

  private FragmentMaleTeenAgeBinding(@NonNull ConstraintLayout rootView, @NonNull EditText ageTeen,
      @NonNull AppBarLayout bar, @NonNull Button buttonResultTeen, @NonNull TextView detailTextTeen,
      @NonNull ImageButton imageButton, @NonNull ImageView imageView3, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull Toolbar toolbar, @NonNull TextView username) {
    this.rootView = rootView;
    this.ageTeen = ageTeen;
    this.bar = bar;
    this.buttonResultTeen = buttonResultTeen;
    this.detailTextTeen = detailTextTeen;
    this.imageButton = imageButton;
    this.imageView3 = imageView3;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.toolbar = toolbar;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMaleTeenAgeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMaleTeenAgeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_male_teen_age, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMaleTeenAgeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.age_teen;
      EditText ageTeen = ViewBindings.findChildViewById(rootView, id);
      if (ageTeen == null) {
        break missingId;
      }

      id = R.id.bar;
      AppBarLayout bar = ViewBindings.findChildViewById(rootView, id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.button_result_teen;
      Button buttonResultTeen = ViewBindings.findChildViewById(rootView, id);
      if (buttonResultTeen == null) {
        break missingId;
      }

      id = R.id.detail_text_teen;
      TextView detailTextTeen = ViewBindings.findChildViewById(rootView, id);
      if (detailTextTeen == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.username;
      TextView username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      return new FragmentMaleTeenAgeBinding((ConstraintLayout) rootView, ageTeen, bar,
          buttonResultTeen, detailTextTeen, imageButton, imageView3, textView7, textView8, toolbar,
          username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}