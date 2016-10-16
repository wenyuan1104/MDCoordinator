package com.akazam.mdcoordinator.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wenyuan on 2016/10/16 19:36.
 * 参考：http://blog.csdn.net/qibin0506/article/details/50290421
 */
public class SrcollBehavir extends CoordinatorLayout.Behavior<View> {

    public SrcollBehavir() {
    }

    /**
     * 必须重写的构造方法
     *
     * @param context
     * @param attrs
     */
    public SrcollBehavir(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * @param coordinatorLayout
     * @param child
     * @param directTargetChild
     * @param target
     * @param nestedScrollAxes
     * @return
     */
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;
    }

    /**
     * @param coordinatorLayout
     * @param child
     * @param target
     * @param dx
     * @param dy
     * @param consumed
     */
    @Override
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dx, int dy, int[] consumed) {
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed);
        child.setScrollY(target.getScrollY());
    }

    /**
     * 这里是处理fling动作的，你想想，我们在滑动松开手的时候，ScrollView是不是还继续滑动一会，
     * 那我们也需要让跟随的那个ScrollView也要继续滑动一会，这种效果，onNestedPreFling就派上用场了。
     *
     * @param coordinatorLayout
     * @param child
     * @param target
     * @param velocityX
     * @param velocityY
     * @return
     */
    @Override
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View child, View target, float velocityX, float velocityY) {
        ((NestedScrollView) child).fling((int) velocityY);
        return true;
    }
}
