// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tribe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BlogItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView blogDescription;

  @NonNull
  public final LinearLayout blogListItem;

  @NonNull
  public final TextView blogReadTime;

  @NonNull
  public final ImageView blogThumbnail;

  @NonNull
  public final TextView blogTitle;

  @NonNull
  public final TextView blogUploadDate;

  private BlogItemBinding(@NonNull LinearLayout rootView, @NonNull TextView blogDescription,
      @NonNull LinearLayout blogListItem, @NonNull TextView blogReadTime,
      @NonNull ImageView blogThumbnail, @NonNull TextView blogTitle,
      @NonNull TextView blogUploadDate) {
    this.rootView = rootView;
    this.blogDescription = blogDescription;
    this.blogListItem = blogListItem;
    this.blogReadTime = blogReadTime;
    this.blogThumbnail = blogThumbnail;
    this.blogTitle = blogTitle;
    this.blogUploadDate = blogUploadDate;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BlogItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BlogItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.blog_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BlogItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.blog_description;
      TextView blogDescription = ViewBindings.findChildViewById(rootView, id);
      if (blogDescription == null) {
        break missingId;
      }

      LinearLayout blogListItem = (LinearLayout) rootView;

      id = R.id.blog_read_time;
      TextView blogReadTime = ViewBindings.findChildViewById(rootView, id);
      if (blogReadTime == null) {
        break missingId;
      }

      id = R.id.blog_thumbnail;
      ImageView blogThumbnail = ViewBindings.findChildViewById(rootView, id);
      if (blogThumbnail == null) {
        break missingId;
      }

      id = R.id.blog_title;
      TextView blogTitle = ViewBindings.findChildViewById(rootView, id);
      if (blogTitle == null) {
        break missingId;
      }

      id = R.id.blog_upload_date;
      TextView blogUploadDate = ViewBindings.findChildViewById(rootView, id);
      if (blogUploadDate == null) {
        break missingId;
      }

      return new BlogItemBinding((LinearLayout) rootView, blogDescription, blogListItem,
          blogReadTime, blogThumbnail, blogTitle, blogUploadDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}