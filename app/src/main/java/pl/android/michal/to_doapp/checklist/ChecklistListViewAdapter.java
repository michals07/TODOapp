package pl.android.michal.to_doapp.checklist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Michał on 05.04.2018.
 */

public class ChecklistListViewAdapter extends BaseAdapter {

    private List todoList;

    public ChecklistListViewAdapter(List todoList) {
        this.todoList = todoList;
    }

    @Override
    public int getCount() {
        return todoList.size();
    }

    @Override
    public Object getItem(int i) {
        return todoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        return view;
    }
}
