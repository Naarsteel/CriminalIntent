package com.sample.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sample.criminalintent.Crime

@Database(entities = [ Crime::class ], version=1)
abstract class CrimeDatabase : RoomDatabase() {
}