package br.com.mrcsfelipe.simplefragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by markFelipe on 28/10/15.
 */
public class Fragmento2 extends Fragment {

    /**
     *  Feito para retornar a view
     * */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_frag2, null);

        TextView tv =(TextView) view.findViewById(R.id.textView1);
        tv.setText("Fragment 2");

        return view;
    }


}