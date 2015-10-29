package br.com.mrcsfelipe.simplefragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by markFelipe on 28/10/15.
 */
public class Fragmento1 extends Fragment {

    int contador = 0;

    /**
     *  Feito para retornar a view
     * */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.i("Scritp", " --> OnCreateView()");

        if(savedInstanceState != null){
            contador = savedInstanceState.getInt("contador");
        }
        Log.i("Scritp", " --> CONTADOR = " + contador);

        View view = inflater.inflate(R.layout.layout_frag1, null);

        TextView tv =(TextView) view.findViewById(R.id.textView1);
        tv.setText("Fragment 1");

       // setRetainInstance(true); Outro modo de manter a instancia do seu fragmentos ao virar.
        return view;
    }

    public void alteraTextView(String texto){
        TextView tv =(TextView) getView().findViewById(R.id.textView1);
        tv.setText(texto);
    }

    @Override
    public void onAttach(Context context) {
        Log.i("Scritp", " --> OnAttach()");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("Scritp", " --> OnCreate()");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.i("Scritp", " --> OnActivityCreated()");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("Scritp", " --> OnStart()");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("Scritp", " --> OnResume()");
        contador ++;
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("Scritp", " --> OnPause()");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.i("Scritp", " --> OnStop()");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("Scritp", " --> OnDestroyView()");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("Scritp", " --> OnDestroy()");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("Scritp", " --> OnDetach()");
        super.onDetach();
    }


    //PEGA A VIRADA DE TELA
    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("Scritp", " --> onSaveInstanceState()");
        outState.putInt("contador", contador);
        super.onSaveInstanceState(outState);
    }
}
