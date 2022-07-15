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

#### 08-June-2022
- Text and Scroll View
  - [Click here](https://docs.google.com/presentation/d/175zGL-zyK9qWotipn5mZm_kWh0ygeJZhs2EsDPDHX-4/edit#slide=id.g116d7d9d49_3_13) to open slides
  - [Click here](https://developer.android.com/reference/android/widget/ScrollView) for ScrollView Document

#### 09-June-2022
- Intents
   - [Click Here](https://docs.google.com/presentation/d/1kjxsI9brdVRIx3rqoB0H-1-PmVlzJbiQNf4PyqzZKJM/edit#slide=id.g168369f895_0_87) for the presentation
   - [Click here](https://developer.android.com/guide/components/intents-filters) for Intents and intent filters documentation
   - Refer to Explicit Intents app for Code (Todos are also mentioned)

#### 10-June-2022
- Implicit (Common) Intents
    - [Click Here](https://developer.android.com/guide/components/intents-common#Phone) to open Common Intents Documentation
    - [Click Here](https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar) for Snackbar documentation

#### Assignment -1 (2 Tasks to complete)
- Create an application that can create an alarm clock and open camera to capture a picture. 
##### Process to submit the assignment
- Zip the source code -> upload it to Google drive -> share the link (permission - anybody on can access with the link).
- Email the link to ```pavankreddy.t@gmail.com```
- Deadline to complete the assignment is ```13-June-2022```

#### 15-June-2022
- [Click here](https://developer.android.com/training/constraint-layout) to learn more about constriant layout

#### 16-June-2022
#### 17-June-2022
- Radio Butttons
    - [Click here](https://developer.android.com/guide/topics/ui/controls/radiobutton) to learn more about the Radio Buttons
- CheckBoxes
    - [Click here](https://developer.android.com/guide/topics/ui/controls/checkbox) to learn more about the Check Boxes
- Spinners
    - [Click here](https://developer.android.com/guide/topics/ui/controls/spinner) to learn more about the Spinners
- ToggleButton
    - [Click here](https://developer.android.com/guide/topics/ui/controls/togglebutton) to learn more about the ToggleButtons
- Switch
    - [Click here](https://developer.android.com/reference/android/widget/Switch) to learn more about the Switch4

#### 18-06-2022 to 24-06-2022
- List view
    - [Click here](https://developer.android.com/reference/android/widget/ListView) to learn more

- RecyclerView
    - [Click here](https://developer.android.com/jetpack/androidx/releases/recyclerview) for Documentation
    - [Access the PPT](https://docs.google.com/presentation/d/1tLLYBSGl9d8nHc_88007kTOZvXdSY0oqIRF3APIgm34/edit?usp=drive_web&ouid=110137796523185973640)

#### Assignment -2 
- Create an application that displays 20 freedom fighters of India in the format shown below.
- When a freedom fighter item is pressed take the users to the next screen and show a detailed content of the freedom fighter
- [click here](https://www.canva.com/design/DAFEhlDGnXo/p1tbye7_qa6o18AJpafjLA/edit?utm_content=DAFEhlDGnXo&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton) to access the prototype
##### Process to submit the assignment
- Zip the source code -> upload it to Google drive -> share the link (permission - anybody on can access with the link).
- Email the link to ```pavankreddy.t@gmail.com```
- Deadline to complete the assignment is ```01-July-2022```

#### Git & GitHub (Getting started)
- Visit [git-scm.com](https://git-scm.com/) and install git software on your computers
- Visit [github.com](https://github.com) and sign up for a free account.

#### TabNavigation
- [click here](https://developer.android.com/guide/navigation/navigation-swipe-view) to learn more about TabNavigation
- [Click here](https://developer.android.com/guide/fragments/lifecycle) to learn more about Fragments 

#### Image Loading Libraries for Android
- [Click here](https://github.com/bumptech/glide) to explore Glide
- [Click here](https://square.github.io/picasso/) to explore Picasso

#### Gson Library to serialize and deserialise Json to pojo and viceversa
- [Click here](https://github.com/google/gson) to explore 
- [Click here](https://www.jsonschema2pojo.org/) to generate pojo classes automatically based on the JSON Response

#### Google Custom Chrom tabs
- [Click here](https://developer.chrome.com/docs/android/custom-tabs/integration-guide/) to see the implementation of Google Custom chrome tabs in Android
- [Set up an icon for your project](https://developer.android.com/studio/write/image-asset-studio)

#### Volley Networking library by Google 
- [Explore Volley Here](https://google.github.io/volley/)

### Assignment
**Develop a Project based on [Google Books API](https://developers.google.com/books) and do Implement the following features**
- Authenticate the user with the help of [Google Sign in API](https://developers.google.com/identity/sign-in/android/start-integrating) and let the user sign in to your app.
- Get The books that are queried by the users.
- When a book is tapped from the list of books on RecyclerView, take the user to the Details Screen where the entire information realted to the book can be seen.
- Please refer to this [Prototype of the Application](https://www.canva.com/design/DAE7Pql_ZW4/hCJXqplFz-WZVQewPPdz1A/edit?utm_content=DAE7Pql_ZW4&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)
- Submit the Assignment in by pushing the code to github public project and email the link to ```pavankreddy.t@gmail.com``` on or before 20<sup>th</sup> July 2022.

#### Retrofit & executors Concepts
- [click here](https://square.github.io/retrofit/) to explore Retrofit Networking Library
- [Click here](https://developer.android.com/reference/java/util/concurrent/Executor) to explore Executors in Java that is a replacement of AsyncTask.

#### Menus and SharedPreferences
- [Click](https://developer.android.com/guide/topics/ui/menus) to read more on Menus in android
- [Click](https://developer.android.com/training/data-storage/shared-preferences) to read more on SharedPreferences

#### Internal and External Storage in android
- [click here](https://developer.android.com/training/data-storage) to explore internal Memory
- [Click here](https://developer.android.com/training/data-storage) to explore External Memory
- [Dynamic Permissions in Android](https://developer.android.com/guide/topics/permissions/overview#:~:text=Runtime%20permissions%2C%20also%20known%20as,the%20system%20and%20other%20apps.) can be explored here
