
package com.artirigo.screenlayout;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;

import android.content.res.Configuration;

public class RNScreenLayoutModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNScreenLayoutModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNScreenLayout";
  }

  @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    //
    constants.put("SMALL", Configuration.SCREENLAYOUT_SIZE_SMALL);
    constants.put("NORMAL", Configuration.SCREENLAYOUT_SIZE_NORMAL);
    constants.put("LARGE", Configuration.SCREENLAYOUT_SIZE_LARGE);
    constants.put("XLARGE", Configuration.SCREENLAYOUT_SIZE_XLARGE);

    //
		int screenLayout = getReactApplicationContext().getResources().getConfiguration().screenLayout;
		screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;
    constants.put("SCREEN_LAYOUT", screenLayout);

    return constants;
  }
}