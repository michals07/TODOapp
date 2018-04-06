package pl.android.michal.to_doapp.fragment.archivalChecklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.android.michal.to_doapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ArchivalChecklistFragment extends Fragment {


    public ArchivalChecklistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_archival_checklist, container, false);
    }

}
