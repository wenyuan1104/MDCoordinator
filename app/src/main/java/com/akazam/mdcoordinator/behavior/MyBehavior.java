package com.akazam.mdcoordinator.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wenyuan 2016/10/16 17:20.
 */
public class MyBehavior extends CoordinatorLayout.Behavior<View> {

    public MyBehavior() {
    }

    /**
     * 必须重载的构造方法，因为CoordinatorLayout反射的时候调用的就是这个构造方法
     *
     * @param context
     * @param attrs
     */
    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @param parent     当前的 CoordinatorLayout
     * @param child      当前设置这个Behavior的View
     * @param dependency 我们关心的那个View。如何知道关心的哪个呢？layoutDependsOn的返回值决定了一切！
     * @return 返回我们关心的view的实例
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        //这里我们关心一个TextView好了，所以layoutDependsOn可以这么写,
        return dependency instanceof View;
    }

    /**
     * @param parent     与 layoutDependsOn 参数相同
     * @param child
     * @param dependency
     * @return
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        int offset = dependency.getTop() - child.getTop();//让两个视图处于相同额高度所以要 减
        ViewCompat.offsetTopAndBottom(child, offset);
        return true;
    }
}
