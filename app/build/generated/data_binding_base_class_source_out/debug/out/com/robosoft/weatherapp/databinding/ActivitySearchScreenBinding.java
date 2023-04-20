// Generated by view binder compiler. Do not edit!
package com.robosoft.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robosoft.weatherapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySearchScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Toolbar backToolbar;

  @NonNull
  public final ImageView clearTxt;

  @NonNull
  public final EditText searchedt;

  @NonNull
  public final Button showResult;

  private ActivitySearchScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull Toolbar backToolbar, @NonNull ImageView clearTxt, @NonNull EditText searchedt,
      @NonNull Button showResult) {
    this.rootView = rootView;
    this.backToolbar = backToolbar;
    this.clearTxt = clearTxt;
    this.searchedt = searchedt;
    this.showResult = showResult;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySearchScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySearchScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_search_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySearchScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backToolbar;
      Toolbar backToolbar = ViewBindings.findChildViewById(rootView, id);
      if (backToolbar == null) {
        break missingId;
      }

      id = R.id.clearTxt;
      ImageView clearTxt = ViewBindings.findChildViewById(rootView, id);
      if (clearTxt == null) {
        break missingId;
      }

      id = R.id.searchedt;
      EditText searchedt = ViewBindings.findChildViewById(rootView, id);
      if (searchedt == null) {
        break missingId;
      }

      id = R.id.show_result;
      Button showResult = ViewBindings.findChildViewById(rootView, id);
      if (showResult == null) {
        break missingId;
      }

      return new ActivitySearchScreenBinding((ConstraintLayout) rootView, backToolbar, clearTxt,
          searchedt, showResult);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
