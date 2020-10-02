package com.example.trabajopracticofinal.ui.propiedades;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.trabajopracticofinal.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class PropiedadesFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private PropiedadesViewModel vm;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

                ViewModelProviders.of(this).get(PropiedadesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_propiedades, container, false);

        inicializar(root);
        return root;
    }

    public  void inicializar(View v)
    {
        viewPager= v.findViewById(R.id.viewPage);
        appBarLayout= v.findViewById(R.id.appbar);
        tabLayout = new TabLayout(getContext());
        appBarLayout.addView(tabLayout);

        ViewPageAdapter vpa= new ViewPageAdapter(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpa.addFragment(new PropiedadFragment(),"Prop 1");
        vpa.addFragment(new PropiedadFragment(),"Prop 2");

        viewPager.setAdapter(vpa);
        tabLayout.setupWithViewPager(viewPager);
    }

    public class ViewPageAdapter extends FragmentPagerAdapter
    {
        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> titulos= new ArrayList<>();

        public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position)
        {
            return fragmentList.get(position);
        }

        @Override
        public int getCount()
        {
            return fragmentList.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titulos.get(position);
        }

        public  void  addFragment(Fragment fragment, String titulo)
        {
           fragmentList.add(fragment);
           titulos.add(titulo);
        }
    }


}