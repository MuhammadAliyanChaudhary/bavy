// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
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

public final class FragmentBlogDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout bar;

  @NonNull
  public final TextView blogDetailDescription;

  @NonNull
  public final ImageView blogDetailImage;

  @NonNull
  public final TextView blogDetailTitle;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final ScrollView scrollView3;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView username;

  private FragmentBlogDetailBinding(@NonNull ConstraintLayout rootView, @NonNull AppBarLayout bar,
      @NonNull TextView blogDetailDescription, @NonNull ImageView blogDetailImage,
      @NonNull TextView blogDetailTitle, @NonNull ImageButton imageButton,
      @NonNull ScrollView scrollView3, @NonNull Toolbar toolbar, @NonNull TextView username) {
    this.rootView = rootView;
    this.bar = bar;
    this.blogDetailDescription = blogDetailDescription;
    this.blogDetailImage = blogDetailImage;
    this.blogDetailTitle = blogDetailTitle;
    this.imageButton = imageButton;
    this.scrollView3 = scrollView3;
    this.toolbar = toolbar;
    this.username = username;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBlogDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBlogDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_blog_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBlogDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bar;
      AppBarLayout bar = ViewBindings.findChildViewById(rootView, id);
      if (bar == null) {
        break missingId;
      }

      id = R.id.blog_detail_description;
      TextView blogDetailDescription = ViewBindings.findChildViewById(rootView, id);
      if (blogDetailDescription == null) {
        break missingId;
      }

      id = R.id.blog_detail_image;
      ImageView blogDetailImage = ViewBindings.findChildViewById(rootView, id);
      if (blogDetailImage == null) {
        break missingId;
      }

      id = R.id.blog_detail_title;
      TextView blogDetailTitle = ViewBindings.findChildViewById(rootView, id);
      if (blogDetailTitle == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.scrollView3;
      ScrollView scrollView3 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView3 == null) {
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

      return new FragmentBlogDetailBinding((ConstraintLayout) rootView, bar, blogDetailDescription,
          blogDetailImage, blogDetailTitle, imageButton, scrollView3, toolbar, username);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
