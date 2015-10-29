package br.com.mrcsfelipe.simplefragments;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.widget.AdapterView.*;

public class MainActivity extends FragmentActivity {

    FragmentManager fragmentManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Scritp", "OnCreate");

        /*
        *
        * Nova maneira
        * */
        if(savedInstanceState == null){
            Fragmento1 frag1 = new Fragmento1();
            Fragmento2 frag2 = new Fragmento2();
            Fragmento3 frag3 = new Fragmento3();

            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.add(R.id.layout_direito, frag1, "frag1");
            ft.commit();
        }


        String []lista = new String[]{"Fragmento 1", "Altera o texto Fragmento 1", "Fragmento 2", "Fragmento 3"};

        ArrayAdapter<String> adpater =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adpater);

        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> lv, View view, int position, long id) {
                /*
                if (position == 1) {
                    Fragmento1 frag1 = (Fragmento1) fragmentManager.findFragmentById(R.id.fragment1);
                    frag1.alteraTextView("Fragment 1 alterado");
                }
                */

                if (position == 0) {
                    Fragmento1 frag1 = new Fragmento1();
                    FragmentTransaction ft = fragmentManager.beginTransaction();
                    ft.replace(R.id.layout_direito, frag1, "frag1");
                    ft.addToBackStack("pilha"); //Usa o botao voltar
                    ft.commit();

                } else if (position == 1){
                    Fragmento1 frag1 = new Fragmento1();
                    frag1 = (Fragmento1) fragmentManager.findFragmentByTag("frag1");

                    if(frag1 != null){
                        frag1.alteraTextView("Fragmento 1 - Texto Alterado");
                    }

                } else if(position == 2){
                    Fragmento2 frag2 = new Fragmento2();
                    FragmentTransaction ft = fragmentManager.beginTransaction();
                    ft.replace(R.id.layout_direito, frag2, "frag2");
                    ft.addToBackStack("pilha"); //Usa o botao voltar
                    ft.commit();

                } else if(position == 3){
                    Fragmento3 frag3 = new Fragmento3();
                    FragmentTransaction ft = fragmentManager.beginTransaction();
                    ft.replace(R.id.layout_direito, frag3, "frag3");
                    ft.addToBackStack("pilha"); //Usa o botao voltar
                    ft.commit();
                }


            }
        });

    }

    @Override
    protected void onStart() {
        Log.i("Scritp", "OnStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("Scritp", "OnResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("Scritp", "OnPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("Scritp", "OnStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("Scritp", "OnDestroy()");
        super.onDestroy();
    }
}
