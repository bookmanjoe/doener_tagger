package com.gruppe10.mobilecommerce.doener_tagger;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bookman on 14.01.2016.
 */
public class DoenerFavActivityFragment extends Fragment {

public DoenerFavActivityFragment(){

}

    public View onCreateView(LayoutInflater  inflater, ViewGroup container, Bundle savedInstanceState){



        String [] doenerFavoritenArray = {
                "Berlin Döner: 3,50 Euro",
                "Döner Palast: 3,50 Euro",
                "Alhay Döner: 3,00 Euro ",
                "Urfa Mangal: 3,50 Euro"
        };

        List <String> doenerFavoritenListe= new ArrayList<>(Arrays.asList(doenerFavoritenArray));

        ArrayAdapter<String> doenerFavoritenListeAdapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.doener_favoriten_liste
        );
        return inflater.inflate(R.layout.fragment_doener_fav, container, false);
    }
}
