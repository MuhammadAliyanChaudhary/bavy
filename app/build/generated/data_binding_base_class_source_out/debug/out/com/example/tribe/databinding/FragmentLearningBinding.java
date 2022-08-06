// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tribe.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLearningBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout bar;

  @NonNull
  public final RecyclerView blogRecyclerView;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final SwipeRefreshLayout swipeToRefresh;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView username;

  private FragmentLearningBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout bar,
      @NonNull RecyclerView blogRecyclerView, @NonNull ImageButton imageButton,
      @NonNull SwipeRefreshLayout swipeToRefresh, @NonNull Toolbar toolbar,
      @NonNull TextView username) {
    this.rootView = rootView;
    this.bar = bar;
    this.blogRecyclerView = blogRecyclerView;
    this.imageButton = imageButton;
    this.swipeToRefresh = swipeToRefresh;
    this.toolbar = toolbar;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLearningBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLearningBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_learning, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLearningBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bar;
      AppBarLayout bar = ViewBindings.findChildViewById(rootView, id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.blog_recycler_view;
      RecyclerView blogRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (blogRecyclerView == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.swipeToRefresh;
      SwipeRefreshLayout swipeToRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swipeToRefresh == null) {
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

      return new FragmentLearningBinding((ConstraintLayout) rootView, bar, blogRecyclerView,
          imageButton, swipeToRefresh, toolbar, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}