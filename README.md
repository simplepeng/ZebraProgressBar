# ZebraProgressBar                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

????????????  ?????????Android???????????????????????????

![](imgs/img_zpb.png)

## ??????

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

```groovy
dependencies {
        implementation 'com.github.simplepeng:ZebraProgressBar:v1.0.0'
}
```

## ??????

```xml
<me.simple.view.ZebraProgressBar
    android:id="@+id/zpb3"
    android:layout_width="match_parent"
    android:layout_height="18dp"
    android:layout_marginTop="15dp"
    app:layout_constraintTop_toTopOf="parent"
    app:zpb_bgColor="#f73378"
    app:zpb_borderColor="#ab003c"
    app:zpb_borderSize="2dp"
    app:zpb_progress="85"
    app:zpb_progressColor="@android:color/white"
    app:zpb_radius="9dp"
    app:zpb_zebraColor="#f50057"
    app:zpb_zebraGap="4dp"
    app:zpb_zebraSize="4dp" />
```

## ????????????

```xml
<!--    ????????????    -->
<attr name="zpb_max" format="integer" />
<!--    ????????????    -->
<attr name="zpb_progress" format="integer" />
<!--    ????????????    -->
<attr name="zpb_radius" format="dimension" />
<!--    ????????????    -->
<attr name="zpb_borderColor" format="color|reference" />
<!--    ????????????    -->
<attr name="zpb_borderSize" format="dimension" />
<!--    ????????????    -->
<attr name="zpb_bgColor" format="color|reference" />
<!--    ????????????    -->
<attr name="zpb_progressColor" format="color|reference" />
<!--    ????????????    -->
<attr name="zpb_zebraColor" format="color|reference" />
<!--    ????????????    -->
<attr name="zpb_zebraSize" format="dimension" />
<!--    ????????????    -->
<attr name="zpb_zebraGap" format="dimension" />
```

## ????????????

* v1.0.0???????????????