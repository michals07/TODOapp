package pl.android.michal.to_doapp.database.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by Michał on 05.04.2018.
 */

@Entity(tableName = "todo_lists")
public class TodoList {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public Date dateOfAdd;
    public boolean archival;
    public String title;
}
