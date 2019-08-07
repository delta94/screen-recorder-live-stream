package com.oxa;

import android.app.Application;
import android.util.Log;

import com.facebook.react.PackageList;
import com.facebook.hermes.reactexecutor.HermesExecutorFactory;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;

import com.facebook.react.shell.MainReactPackage;
import com.rnfs.RNFSPackage;
import com.brentvatne.react.ReactVideoPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    // @Override
    // protected List<ReactPackage> getPackages() {
    //   @SuppressWarnings("UnnecessaryLocalVariable")
    //   List<ReactPackage> packages = new PackageList(this).getPackages();
    //   // Packages that cannot be autolinked yet can be added manually here, for example:
    //   // packages.add(new MyReactNativePackage());
    //   packages.add(new MainReactPackage());
    //   packages.add(new RNFSPackage());
    //   packages.add(new ReactVideoPackage());
    //   packages.add(new RecorderReactPackage());
    //   return packages;
    // }
    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNFSPackage(),
          new ReactVideoPackage(),
          new RecorderReactPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
