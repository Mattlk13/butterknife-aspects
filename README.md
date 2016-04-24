## Butterknife aspects

This library provides an [*aspect*](https://github.com/shazam/android-aspects) for the popular Android library [Butterknife](https://github.com/JakeWharton/butterknife)

It completes the reduction of verbosity of your **Activity** or **Fragment** code by transforming this:

```java
class ExampleActivity extends Activity {

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.simple_activity);
    ButterKnife.bind(this);
    // TODO do stuff...
  }
}
```

to this:

```java
@BindLayout(R.layout.simple_activity)
class ExampleActivity extends AspectActivity {

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // TODO do stuff...
  }
}
```

The **BindLayout** annotation accepts a layout id which it binds to the **Activity** or **Fragment** using the standard Butterknife way, but it does so automatically for you thus reducing duplication between classes and improving readability.


### Version
1.0.0

### Installation

The library is available on **JCenter**

- Gradle
```groovy
compile 'com.savvasdalkitsis:butterknife-aspects:1.0.0'
```

- Maven:
```xml
<dependency>
  <groupId>com.savvasdalkitsis</groupId>
  <artifactId>butterknife-aspects</artifactId>
  <version>1.0.0</version>
</dependency>
```

License
-------

    Copyright 2016 Savvas Dalkitsis

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.