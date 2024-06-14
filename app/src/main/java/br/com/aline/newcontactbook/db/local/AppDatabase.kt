package br.com.aline.newcontactbook.db.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.aline.newcontactbook.constant.Constants
import br.com.aline.newcontactbook.dao.ContactsDao
import br.com.aline.newcontactbook.model.Contacts

@Database(entities = [Contacts::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contacstDao(): ContactsDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    Constants.CONTACTS_DB
                ).build()
                INSTANCE = instance
                instance
            }

        }
    }
}