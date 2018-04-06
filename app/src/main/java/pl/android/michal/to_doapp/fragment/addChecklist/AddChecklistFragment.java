package pl.android.michal.to_doapp.fragment.addChecklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.android.michal.to_doapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddChecklistFragment extends Fragment {


    public AddChecklistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_checklist, container, false);
    }

}
