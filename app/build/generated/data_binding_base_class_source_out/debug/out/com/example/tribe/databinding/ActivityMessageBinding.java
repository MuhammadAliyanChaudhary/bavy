// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tribe.R;
import com.google.android.material.appbar.AppBarLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMessageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppBarLayout barLayout;

  @NonNull
  public final RelativeLayout bottom;

  @NonNull
  public final ImageButton btnSend;

  @NonNull
  public final CircleImageView dependentProfileItem;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final EditText textSend;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView username;

  private ActivityMessageBinding(@NonNull RelativeLayout rootView, @NonNull AppBarLayout barLayout,
      @NonNull RelativeLayout bottom, @NonNull ImageButton btnSend,
      @NonNull CircleImageView dependentProfileItem, @NonNull RecyclerView recyclerView,
      @NonNull EditText textSend, @NonNull Toolbar toolbar, @NonNull TextView username) {
    this.rootView = rootView;
    this.barLayout = barLayout;
    this.bottom = bottom;
    this.btnSend = btnSend;
    this.dependentProfileItem = dependentProfileItem;
    this.recyclerView = recyclerView;
    this.textSend = textSend;
    this.toolbar = toolbar;
    this.username = username;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bar_layout;
      AppBarLayout barLayout = ViewBindings.findChildViewById(rootView, id);
      if (barLayout == null) {
        break missingId;
      }

      id = R.id.bottom;
      RelativeLayout bottom = ViewBindings.findChildViewById(rootView, id);
      if (bottom == null) {
        break missingId;
      }

      id = R.id.btn_send;
      ImageButton btnSend = ViewBindings.findChildViewById(rootView, id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.dependent_profile_item;
      CircleImageView dependentProfileItem = ViewBindings.findChildViewById(rootView, id);
      if (dependentProfileItem == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.text_send;
      EditText textSend = ViewBindings.findChildViewById(rootView, id);
      if (textSend == null) {
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

      return new ActivityMessageBinding((RelativeLayout) rootView, barLayout, bottom, btnSend,
          dependentProfileItem, recyclerView, textSend, toolbar, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
