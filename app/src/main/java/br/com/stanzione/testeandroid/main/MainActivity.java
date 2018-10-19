package br.com.stanzione.testeandroid.main;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.stanzione.testeandroid.R;
import br.com.stanzione.testeandroid.form.FormFragment;
import br.com.stanzione.testeandroid.investment.InvestmentFragment;
import br.com.stanzione.testeandroid.main.adapter.ViewPagerAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    @BindView(R.id.viewPager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUi();
    }

    private void setupUi(){
        ButterKnife.bind(this);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addOption(new InvestmentFragment(), getString(R.string.title_tab_investment));
        adapter.addOption(new FormFragment(), getString(R.string.title_tab_contact));
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager, true);
    }
}
