// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tribe.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCommentsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText addComment;

  @NonNull
  public final RelativeLayout bottom;

  @NonNull
  public final CircleImageView imageProfile;

  @NonNull
  public final TextView post;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final Toolbar toolbar;

  private ActivityCommentsBinding(@NonNull RelativeLayout rootView, @NonNull EditText addComment,
      @NonNull RelativeLayout bottom, @NonNull CircleImageView imageProfile, @NonNull TextView post,
      @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.addComment = addComment;
    this.bottom = bottom;
    this.imageProfile = imageProfile;
    this.post = post;
    this.recyclerView = recyclerView;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCommentsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCommentsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_comments, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCommentsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_comment;
      EditText addComment = ViewBindings.findChildViewById(rootView, id);
      if (addComment == null) {
        break missingId;
      }

      id = R.id.bottom;
      RelativeLayout bottom = ViewBindings.findChildViewById(rootView, id);
      if (bottom == null) {
        break missingId;
      }

      id = R.id.image_profile;
      CircleImageView imageProfile = ViewBindings.findChildViewById(rootView, id);
      if (imageProfile == null) {
        break missingId;
      }

      id = R.id.post;
      TextView post = ViewBindings.findChildViewById(rootView, id);
      if (post == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityCommentsBinding((RelativeLayout) rootView, addComment, bottom,
          imageProfile, post, recyclerView, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
