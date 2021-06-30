package me.simple.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View

/**
 * 条纹进度条
 */
open class ZebraProgressBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val mRectF = RectF()
    private val mPath = Path()

    private val mZebraPath = Path()

    //最大进度
    var max = 100

    //进度
    var progress = 0
        set(value) {
            field = if (progress > max) max else value
            invalidate()
        }

    //进度条的圆角
    var radius = 0f

    //进度条描边的颜色
    var borderColor = Color.GREEN

    //进度条描边的大小
    var borderSize = 0f

    //进度条背景的颜色
    var bgColor = Color.BLACK

    //进度条进度的颜色
    var progressColor = Color.RED

    //条纹的颜色
    var zebraColor = Color.YELLOW

    //条纹的间隔
    var zebraSize = 0f

    //条纹的间隔
    var zebraGap = 0f

    init {
        if (attrs != null) {
            val ta = context.obtainStyledAttributes(attrs, R.styleable.ZebraProgressBar)

            max = ta.getInt(R.styleable.ZebraProgressBar_zpb_max, 100)
            progress = ta.getInt(R.styleable.ZebraProgressBar_zpb_progress, 0)
            radius = ta.getDimension(R.styleable.ZebraProgressBar_zpb_radius, 0f)

            borderColor = ta.getColor(
                R.styleable.ZebraProgressBar_zpb_borderColor,
                Color.parseColor("#FEC572")
            )
            borderSize = ta.getDimension(R.styleable.ZebraProgressBar_zpb_borderSize, dp2px(1f))

            bgColor = ta.getColor(
                R.styleable.ZebraProgressBar_zpb_bgColor,
                Color.parseColor("#FFD47F")
            )

            progressColor = ta.getColor(
                R.styleable.ZebraProgressBar_zpb_progressColor,
                Color.parseColor("#FFF7E0")
            )

            zebraColor = ta.getColor(
                R.styleable.ZebraProgressBar_zpb_zebraColor,
                Color.parseColor("#FFD47F")
            )
            zebraSize = ta.getDimension(R.styleable.ZebraProgressBar_zpb_zebraSize, dp2px(10f))
            zebraGap = ta.getDimension(R.styleable.ZebraProgressBar_zpb_zebraGap, dp2px(10f))

            ta.recycle()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //画描边边框
        mPaint.color = borderColor
        mRectF.set(0f, 0f, width.toFloat(), height.toFloat())
        canvas.drawRoundRect(mRectF, radius, radius, mPaint)

        //画背景
        mPaint.color = bgColor
        mRectF.set(borderSize, borderSize, width - borderSize, height - borderSize)
        canvas.drawRoundRect(mRectF, radius, radius, mPaint)

        //画进度
        if (progress <= 0) return
        mPaint.color = progressColor
        val progressWidth = (width - borderSize - borderSize) / max * progress
        mRectF.set(borderSize, borderSize, progressWidth, height - borderSize)
        canvas.drawRoundRect(mRectF, radius, radius, mPaint)

        //画条纹
        mPaint.color = zebraColor
        mPath.addRoundRect(mRectF, radius, radius, Path.Direction.CW)
        canvas.save()
        canvas.clipPath(mPath)

        val zebraNum = (progressWidth / (zebraSize + zebraGap)).toInt()

        val top = borderSize
        var topLeft = 0f
        var topRight = 0f

        var bottom = height - borderSize
        var bottomLeft = 0f
        var bottomRight = 0f

        for (n in 0..zebraNum) {
            topLeft = n * (zebraSize + zebraGap)
            topRight = topLeft + zebraSize
            bottomLeft = topLeft - zebraSize
            bottomRight = bottomLeft + zebraSize

            mZebraPath.rewind()
            mZebraPath.moveTo(topLeft, top)
            mZebraPath.lineTo(topRight, top)
            mZebraPath.lineTo(bottomRight, bottom)
            mZebraPath.lineTo(bottomLeft, bottom)
            mZebraPath.close()

            canvas.drawPath(mZebraPath, mPaint)
        }

        canvas.restore()
    }

    private fun dp2px(value: Float): Float {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            value,
            resources.displayMetrics
        )
    }
}