# ZebraProgressBar                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

🔥🔥🔥  可能是Android最通用的条纹进度条

![](imgs/img_zpb.png)

## 导入

## 使用

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

## 可用属性

```xml
<!--    最大进度    -->
<attr name="zpb_max" format="integer" />
<!--    当前进度    -->
<attr name="zpb_progress" format="integer" />
<!--    圆角大小    -->
<attr name="zpb_radius" format="dimension" />
<!--    描边颜色    -->
<attr name="zpb_borderColor" format="color|reference" />
<!--    描边大小    -->
<attr name="zpb_borderSize" format="dimension" />
<!--    背景颜色    -->
<attr name="zpb_bgColor" format="color|reference" />
<!--    进度颜色    -->
<attr name="zpb_progressColor" format="color|reference" />
<!--    条纹颜色    -->
<attr name="zpb_zebraColor" format="color|reference" />
<!--    条纹大小    -->
<attr name="zpb_zebraSize" format="dimension" />
<!--    条纹间距    -->
<attr name="zpb_zebraGap" format="dimension" />
```

## 版本迭代

* v1.0.0：首次发布