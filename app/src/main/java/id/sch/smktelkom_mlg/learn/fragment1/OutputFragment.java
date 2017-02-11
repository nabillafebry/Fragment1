package id.sch.smktelkom_mlg.learn.fragment1;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OutputFragment extends android.support.v4.app.Fragment {

    TextView tvHasil;

    public OutputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_output, container, false);

        tvHasil = (TextView) view.findViewById(R.id.textViewHasil);

        return view;
    }

    public void doProses(String nama, String umur) {
        tvHasil.setText(nama + " (" + umur + " tahun");
    }
}
