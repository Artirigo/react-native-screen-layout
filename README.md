# React Native Module for reading Android ScreenLayout Configuration

This plugin provides access to the screenLayout configuration on Android devices.



## Getting started

`$ npm install react-native-screen-layout --save`

### Mostly automatic installation

`$ react-native link react-native-screen-layout`

### Manual installation


#### Android

1. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-screen-layout'
  	project(':react-native-screen-layout').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-screen-layout/android')
  	```
2. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-screen-layout')
  	```
3. Import Package
  
    **For React Native >= v0.29**
  
    Update the `MainApplication.java` file to use the Plugin via the following changes:
    
    ```java
    ...
    // 1. Import the plugin class.
   import com.artirigo.screenlayout.RNScreenLayoutPackage;
    
    public class MainApplication extends Application implements ReactApplication {
    
        private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
            ...   
            @Override
            protected List<ReactPackage> getPackages() {
                // 2. Instantiate an instance of the Plugin runtime and add it to the list of
                // existing packages.
                return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new RNScreenLayoutPackage()
                );
            }
        };
    }
    ```
    
    **For React Native v0.19 - v0.28**
  
    Update the `MainActivity.java` file to use the Plugin via the following changes:
    
    ```java
    ...
    // 1. Import the plugin class (if you used RNPM to install the plugin, this
    // should already be done for you automatically so you can skip this step).
    import com.artirigo.screenlayout.RNScreenLayoutPackage;
    
    public class MainActivity extends ReactActivity {    
        @Override
        protected List<ReactPackage> getPackages() {
            // 2. Instantiate an instance of the Plugin runtime and add it to the list of
            // existing packages.
            return Arrays.<ReactPackage>asList(
                new MainReactPackage(),
                new RNScreenLayoutPackage()
            );
        }
    
        ...
    }
    ```


## Usage
```javascript
import ScreenLayout from 'react-native-screen-layout';

if(ScreenLayout.SCREEN_LAYOUT === ScreenLayout.LARGE) {
    console.log('this is a large screen');
}

```
  