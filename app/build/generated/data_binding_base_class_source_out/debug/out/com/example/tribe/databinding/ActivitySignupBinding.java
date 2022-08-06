// Generated by view binder compiler. Do not edit!
package com.example.tribe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
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

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton buttonBackSignup;

  @NonNull
  public final Button buttonCreateAccountSignup;

  @NonNull
  public final EditText editConfirmPassSignup;

  @NonNull
  public final EditText editEmailSignup;

  @NonNull
  public final EditText editPassSignup;

  @NonNull
  public final EditText editUsernameSignup;

  @NonNull
  public final TextView textviewPrivacyPolicy;

  @NonNull
  public final TextView textviewTermsConditions;

  private ActivitySignupBinding(@NonNull LinearLayout rootView,
      @NonNull ImageButton buttonBackSignup, @NonNull Button buttonCreateAccountSignup,
      @NonNull EditText editConfirmPassSignup, @NonNull EditText editEmailSignup,
      @NonNull EditText editPassSignup, @NonNull EditText editUsernameSignup,
      @NonNull TextView textviewPrivacyPolicy, @NonNull TextView textviewTermsConditions) {
    this.rootView = rootView;
    this.buttonBackSignup = buttonBackSignup;
    this.buttonCreateAccountSignup = buttonCreateAccountSignup;
    this.editConfirmPassSignup = editConfirmPassSignup;
    this.editEmailSignup = editEmailSignup;
    this.editPassSignup = editPassSignup;
    this.editUsernameSignup = editUsernameSignup;
    this.textviewPrivacyPolicy = textviewPrivacyPolicy;
    this.textviewTermsConditions = textviewTermsConditions;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_back_signup;
      ImageButton buttonBackSignup = ViewBindings.findChildViewById(rootView, id);
      if (buttonBackSignup == null) {
        break missingId;
      }

      id = R.id.button_create_account_signup;
      Button buttonCreateAccountSignup = ViewBindings.findChildViewById(rootView, id);
      if (buttonCreateAccountSignup == null) {
        break missingId;
      }

      id = R.id.edit_confirm_pass_signup;
      EditText editConfirmPassSignup = ViewBindings.findChildViewById(rootView, id);
      if (editConfirmPassSignup == null) {
        break missingId;
      }

      id = R.id.edit_email_signup;
      EditText editEmailSignup = ViewBindings.findChildViewById(rootView, id);
      if (editEmailSignup == null) {
        break missingId;
      }

      id = R.id.edit_pass_signup;
      EditText editPassSignup = ViewBindings.findChildViewById(rootView, id);
      if (editPassSignup == null) {
        break missingId;
      }

      id = R.id.edit_username_signup;
      EditText editUsernameSignup = ViewBindings.findChildViewById(rootView, id);
      if (editUsernameSignup == null) {
        break missingId;
      }

      id = R.id.textview_privacy_policy;
      TextView textviewPrivacyPolicy = ViewBindings.findChildViewById(rootView, id);
      if (textviewPrivacyPolicy == null) {
        break missingId;
      }

      id = R.id.textview_terms_conditions;
      TextView textviewTermsConditions = ViewBindings.findChildViewById(rootView, id);
      if (textviewTermsConditions == null) {
        break missingId;
      }

      return new ActivitySignupBinding((LinearLayout) rootView, buttonBackSignup,
          buttonCreateAccountSignup, editConfirmPassSignup, editEmailSignup, editPassSignup,
          editUsernameSignup, textviewPrivacyPolicy, textviewTermsConditions);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}