package polinema.ac.id.starterchapter05.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlerLoadPushup(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(fragment == null || fragment instanceof DipsFragment || fragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new PushupFragment(),"Pushup_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }

    }

    public void handlerLoadDips(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(fragment == null || fragment instanceof PushupFragment || fragment instanceof HandstandFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new DipsFragment(),"Dips_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }
    }

    public void handlerLoadHandstand(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_placeholder);

        if(fragment == null || fragment instanceof PushupFragment || fragment instanceof DipsFragment){
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.fragment_placeholder,new HandstandFragment(),"Dips_Fragment");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        }
    }
}
