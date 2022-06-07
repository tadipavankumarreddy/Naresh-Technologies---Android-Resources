# Learning Resources

[Install Android Studio](https://developer.android.com/studio?gclid=Cj0KCQjwg_iTBhDrARIsAD3Ib5gYa8Go6mxtbUZLj1pYCw0m_S8zeNEcZAT132zqwAdx6oIm9NjPAsQaAmaLEALw_wcB&gclsrc=aw.ds)

[Android Platform Architecture](https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjm4_i72Nz3AhXj2kwCHaI1DZsYABAAGgJ0bQ&ohost=www.google.com&cid=CAESa-D2sUI328vwBJrNAhsmt87nfvCM2IYM76-B5bq4Pgr2PJsO1R5Ne7WlS7WIpQ8XOT-J20vdUCgcHEXx_yCFuo3iLMMXQKf-89GzvN36i6h0w_aL6chtYOuP3njYOpdOYdP8MSpOBqfQF3vi&sig=AOD64_3319FgGPFGeOT-tp8M3ELeGlDfHw&q&adurl&ved=2ahUKEwjYpfG72Nz3AhXVAaYKHa7FCn8Q0Qx6BAgCEAE)

[View](https://developer.android.com/reference/android/view/View)

[ViewGroups](https://developer.android.com/reference/android/view/ViewGroup)

[Learn More About Toasts](https://developer.android.com/guide/topics/ui/notifiers/toasts)

[Learn More On TextView](https://developer.android.com/reference/android/widget/TextView)

[learn More on Buttons](https://developer.android.com/reference/android/widget/Button)

#### 06-June-2022

##### Agenda
- Saving the data acorss the configuration changes of the device (portrait to landscape and vice-versa)
  - Please explore and read the [documentation](https://developer.android.com/topic/libraries/architecture/saving-states)
- Desiging Separately for Landscape orientation
  - Please explore and read the [documentation](https://developer.android.com/reference/androidx/browser/trusted/ScreenOrientation)
- Freezing the activity to portrait or landscape by using ```android:screenOrientation="portrait"```
  - Please explore and read the [documentation](https://developer.android.com/reference/androidx/browser/trusted/ScreenOrientation)

#### 07-June-2022
- Activity Life cycle
  - Please explore more here in the [Documentation](https://developer.android.com/guide/components/activities/activity-lifecycle)
- When you launch the Activity
    1. onCreate()
    2. onStart()
    3. onResume()
- Now you activity is visible to the user and the user can interact with it
- When the user presses the home button or the user opens another application (Lock the screen)
- Your activity is pushed to background  
    1. onPause()
    2. onStop()
- You pressed the back button on the device to close your activity
    1. onPause()
    2. onStop()
    3. onDestroy()
- Your activity is in the background. now you opened it again
    1. onRestart()
    2. onStart()
    3. onResume()
- You rotated the screen from portrait to landscape
    1. onPause()
    2. onStop()
    3. onDestroy()
    4. onCreate()
    5. onStart()
    6. onResume()

[Learn how to show logs while the app is in debug mode (in the development process )](https://developer.android.com/studio/debug/am-logcat#:~:text=The%20Logcat%20window%20in%20Android,you%20can%20view%20older%20messages.)
