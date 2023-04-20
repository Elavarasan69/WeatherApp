package com.robosoft.weatherapp.interfaces;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.robosoft.weatherapp.dataclass.WeatherDetails;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDetailsDAO_Impl implements WeatherDetailsDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherDetails> __insertionAdapterOfWeatherDetails;

  private final SharedSQLiteStatement __preparedStmtOfUpdate;

  public WeatherDetailsDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherDetails = new EntityInsertionAdapter<WeatherDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `weather_tb` (`id`,`city`,`fav`,`temperature`,`climateText`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherDetails value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getCity() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCity());
        }
        if (value.getFav() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFav());
        }
        if (value.getTemperature() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTemperature());
        }
        if (value.getClimateText() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getClimateText());
        }
      }
    };
    this.__preparedStmtOfUpdate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE weather_tb SET fav = ?  WHERE city = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final WeatherDetails weatherDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherDetails.insert(weatherDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final String city, final String favorite) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdate.acquire();
    int _argIndex = 1;
    if (favorite == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, favorite);
    }
    _argIndex = 2;
    if (city == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, city);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdate.release(_stmt);
    }
  }

  @Override
  public List<WeatherDetails> getAllData() {
    final String _sql = "SELECT * FROM weather_tb";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final int _cursorIndexOfFav = CursorUtil.getColumnIndexOrThrow(_cursor, "fav");
      final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfClimateText = CursorUtil.getColumnIndexOrThrow(_cursor, "climateText");
      final List<WeatherDetails> _result = new ArrayList<WeatherDetails>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WeatherDetails _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        final String _tmpFav;
        if (_cursor.isNull(_cursorIndexOfFav)) {
          _tmpFav = null;
        } else {
          _tmpFav = _cursor.getString(_cursorIndexOfFav);
        }
        final String _tmpTemperature;
        if (_cursor.isNull(_cursorIndexOfTemperature)) {
          _tmpTemperature = null;
        } else {
          _tmpTemperature = _cursor.getString(_cursorIndexOfTemperature);
        }
        final String _tmpClimateText;
        if (_cursor.isNull(_cursorIndexOfClimateText)) {
          _tmpClimateText = null;
        } else {
          _tmpClimateText = _cursor.getString(_cursorIndexOfClimateText);
        }
        _item = new WeatherDetails(_tmpId,_tmpCity,_tmpFav,_tmpTemperature,_tmpClimateText);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<WeatherDetails> getSelectedCity(final String city) {
    final String _sql = "SELECT * FROM weather_tb WHERE city == ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (city == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, city);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final int _cursorIndexOfFav = CursorUtil.getColumnIndexOrThrow(_cursor, "fav");
      final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
      final int _cursorIndexOfClimateText = CursorUtil.getColumnIndexOrThrow(_cursor, "climateText");
      final List<WeatherDetails> _result = new ArrayList<WeatherDetails>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WeatherDetails _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        final String _tmpFav;
        if (_cursor.isNull(_cursorIndexOfFav)) {
          _tmpFav = null;
        } else {
          _tmpFav = _cursor.getString(_cursorIndexOfFav);
        }
        final String _tmpTemperature;
        if (_cursor.isNull(_cursorIndexOfTemperature)) {
          _tmpTemperature = null;
        } else {
          _tmpTemperature = _cursor.getString(_cursorIndexOfTemperature);
        }
        final String _tmpClimateText;
        if (_cursor.isNull(_cursorIndexOfClimateText)) {
          _tmpClimateText = null;
        } else {
          _tmpClimateText = _cursor.getString(_cursorIndexOfClimateText);
        }
        _item = new WeatherDetails(_tmpId,_tmpCity,_tmpFav,_tmpTemperature,_tmpClimateText);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
