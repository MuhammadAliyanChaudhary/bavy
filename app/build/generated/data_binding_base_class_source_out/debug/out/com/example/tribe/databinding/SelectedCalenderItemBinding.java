// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class SelectedCalenderItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout clCalendarItem;

  @NonNull
  public final TextView tvDateCalendarItem;

  @NonNull
  public final TextView tvDayCalendarItem;

  private SelectedCalenderItemBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout clCalendarItem, @NonNull TextView tvDateCalendarItem,
      @NonNull TextView tvDayCalendarItem) {
    this.rootView = rootView;
    this.clCalendarItem = clCalendarItem;
    this.tvDateCalendarItem = tvDateCalendarItem;
    this.tvDayCalendarItem = tvDayCalendarItem;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SelectedCalenderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SelectedCalenderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.selected_calender_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SelectedCalenderItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout clCalendarItem = (LinearLayout) rootView;

      id = R.id.tv_date_calendar_item;
      TextView tvDateCalendarItem = ViewBindings.findChildViewById(rootView, id);
      if (tvDateCalendarItem == null) {
        break missingId;
      }

      id = R.id.tv_day_calendar_item;
      TextView tvDayCalendarItem = ViewBindings.findChildViewById(rootView, id);
      if (tvDayCalendarItem == null) {
        break missingId;
      }

      return new SelectedCalenderItemBinding((LinearLayout) rootView, clCalendarItem,
          tvDateCalendarItem, tvDayCalendarItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}