package com.tysjpt.zhididata.zhididata;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.obsessive.library.base.BaseLazyFragment;
import com.github.obsessive.library.eventbus.EventCenter;
import com.github.obsessive.library.netstatus.NetUtils;
import com.github.obsessive.library.widgets.XViewPager;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.Types.BoomType;
import com.nightonke.boommenu.Types.ButtonType;
import com.nightonke.boommenu.Util;
import com.tysjpt.zhididata.zhididata.Presenter.impl.HomePresenterImpl;
import com.tysjpt.zhididata.zhididata.bean.BoomMenuEntity;
import com.tysjpt.zhididata.zhididata.bean.BottomEntity;
import com.tysjpt.zhididata.zhididata.customview.ChangeColorIconWithTextView;
import com.tysjpt.zhididata.zhididata.listeners.SubButtonClickListener;
import com.tysjpt.zhididata.zhididata.ui.activity.BaseActivity;
import com.tysjpt.zhididata.zhididata.ui.adapter.VPFragmentAdapter;
import com.tysjpt.zhididata.zhididata.view.HomeView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends BaseActivity
        implements NavigationView.OnNavigationItemSelectedListener,HomeView,View.OnClickListener{

    private boolean init = false;
    private HomePresenterImpl homePresenter;
    private List<ChangeColorIconWithTextView> mTabIndicator = new ArrayList<>();
    private View mCustomView;

    @InjectView(R.id.nav_view)
    NavigationView navigationView;

    @InjectView(R.id.home_container)
    XViewPager viewPager;

    @InjectView(R.id.drawer_layout)
    DrawerLayout drawer;

    @InjectView(R.id.toolbar)
    Toolbar toolbar;

    @InjectView(R.id.boom)
    BoomMenuButton boomMenuButton;

    @InjectView(R.id.id_indicator_one)
    ChangeColorIconWithTextView xunJia;
    @InjectView(R.id.id_indicator_two)
    ChangeColorIconWithTextView ziXun;
    @InjectView(R.id.id_indicator_three)
    ChangeColorIconWithTextView gongGao;
    @InjectView(R.id.id_indicator_four)
    ChangeColorIconWithTextView woDe;

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }

    protected void initView(){
        navigationView.setNavigationItemSelectedListener(this);
        homePresenter=new HomePresenterImpl(this,this);
        homePresenter.initialized();
/*
        LayoutInflater mInflater = LayoutInflater.from(this);
        mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
        mTitleTextView.setText(R.string.app_name);*/

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (init) return;
        init = true;

        homePresenter.initBoomMenu();
    }

    protected void initEnvent(){
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        mTabIndicator.add(xunJia);
        mTabIndicator.add(ziXun);
        mTabIndicator.add(gongGao);
        mTabIndicator.add(woDe);

        xunJia.setOnClickListener(this);
        ziXun.setOnClickListener(this);
        gongGao.setOnClickListener(this);
        woDe.setOnClickListener(this);

        boomMenuButton.setOnSubButtonClickListener(new SubButtonClickListener(this));
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void getBundleExtras(Bundle bundle) {

    }

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onEventComming(EventCenter eventCenter) {

    }

    @Override
    protected View getLoadingTargetView() {
        return ButterKnife.findById(this, R.id.home_container);
    }

    @Override
    protected void initViewsAndEvents() {
        initView();
        initEnvent();
        xunJia.setIconAlpha(1.0f);
        setTitle(mTabIndicator.get(0).getText());
    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType netType) {

    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isBindEventBusHere() {
        return false;
    }

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * 初始化底部按钮
     * @param bottomEntities
     */
    @Override
    public void initializeViews(List<BaseLazyFragment> fragments,List<BottomEntity> bottomEntities) {
//        for (BottomEntity bottomEntity:bottomEntities
//             ) {
//            ChangeColorIconWithTextView view=new ChangeColorIconWithTextView(MainActivity.this);
//            view.setIcon(bottomEntity.getIconResId());
//            view.setText(bottomEntity.getName());
//            view.setTextSize(bottomEntity.getTextSize());
//            bottomLayout.addView(view,bottomViewParams);
//        }

        if (null != fragments && !fragments.isEmpty()) {
            viewPager.setEnableScroll(false);
            viewPager.setOffscreenPageLimit(fragments.size());
            viewPager.setAdapter(new VPFragmentAdapter(getSupportFragmentManager(), fragments));
        }
    }

    @Override
    public void initBoomMenu(BoomMenuEntity boomMenuEntity) {
        boomMenuButton.init(boomMenuEntity.getDrawables(),boomMenuEntity.getStrings(),boomMenuEntity.getColors(), ButtonType.CIRCLE, BoomType.PARABOLA_2,boomMenuEntity.getPlaceType(),null,null,null,null,null,null,null);
        boomMenuButton.setSubButtonShadowOffset(Util.getInstance().dp2px(2), Util.getInstance().dp2px(2));
        boomMenuButton.setShareLine1Color(boomMenuEntity.getColor1());
        boomMenuButton.setShareLine2Color(boomMenuEntity.getColor2());
    }

    @Override
    public void onClick(View v) {
        resetOtherTabs();
        String title= (String) getTitle();
        switch (v.getId())
        {
            case R.id.id_indicator_one:
                title= mTabIndicator.get(0).setIconAlpha(1.0f).getText();
                viewPager.setCurrentItem(0, false);
                toolbar.setTitle(title);
                boomMenuButton.setVisibility(View.VISIBLE);

                break;
            case R.id.id_indicator_two:
                title=mTabIndicator.get(1).setIconAlpha(1.0f).getText();
                boomMenuButton.setVisibility(View.GONE);
                viewPager.setCurrentItem(1, false);
                break;
            case R.id.id_indicator_three:
                title= mTabIndicator.get(2).setIconAlpha(1.0f).getText();
                boomMenuButton.setVisibility(View.GONE);
                viewPager.setCurrentItem(2, false);
                break;
            case R.id.id_indicator_four:
                title= mTabIndicator.get(3).setIconAlpha(1.0f).getText();
                boomMenuButton.setVisibility(View.GONE);
                viewPager.setCurrentItem(3, false);
                break;

        }
        toolbar.setTitle(title);
    }

    /**
     * 重置其他的Tab
     */
    private void resetOtherTabs()
    {
        for (int i = 0; i < mTabIndicator.size(); i++)
        {
            mTabIndicator.get(i).setIconAlpha(0);
        }
    }
}
