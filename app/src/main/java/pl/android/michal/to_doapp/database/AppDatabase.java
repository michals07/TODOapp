package pl.android.michal.to_doapp.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

import pl.android.michal.to_doapp.database.dao.TodoListDAO;
import pl.android.michal.to_doapp.database.model.TodoList;

/**
 * Created by Michał on 05.04.2018.
 */

@Database(entities = {TodoList.class} , version = 1) //znaleźć podawanie entities jako package
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase{

    private static AppDatabase INSTANCE;

    public abstract TodoListDAO todoListDAO();

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "todoapp-database").build();
        }
        return INSTANCE;
    }
}
