package com.skydoves.pokedex.core.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.skydoves.pokedex.core.database.entity.PokemonInfoEntity;
import com.skydoves.pokedex.core.model.PokemonInfo;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PokemonInfoDao_Impl implements PokemonInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PokemonInfoEntity> __insertionAdapterOfPokemonInfoEntity;

  private TypeResponseConverter __typeResponseConverter;

  public PokemonInfoDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemonInfoEntity = new EntityInsertionAdapter<PokemonInfoEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `PokemonInfoEntity` (`id`,`name`,`height`,`weight`,`experience`,`types`,`hp`,`attack`,`defense`,`speed`,`exp`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final PokemonInfoEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindString(2, entity.getName());
        statement.bindLong(3, entity.getHeight());
        statement.bindLong(4, entity.getWeight());
        statement.bindLong(5, entity.getExperience());
        final String _tmp = __typeResponseConverter().fromInfoType(entity.getTypes());
        statement.bindString(6, _tmp);
        statement.bindLong(7, entity.getHp());
        statement.bindLong(8, entity.getAttack());
        statement.bindLong(9, entity.getDefense());
        statement.bindLong(10, entity.getSpeed());
        statement.bindLong(11, entity.getExp());
      }
    };
  }

  @Override
  public Object insertPokemonInfo(final PokemonInfoEntity pokemonInfo,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPokemonInfoEntity.insert(pokemonInfo);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getPokemonInfo(final String name_,
      final Continuation<? super PokemonInfoEntity> $completion) {
    final String _sql = "SELECT * FROM PokemonInfoEntity WHERE name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindString(_argIndex, name_);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<PokemonInfoEntity>() {
      @Override
      @Nullable
      public PokemonInfoEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfExperience = CursorUtil.getColumnIndexOrThrow(_cursor, "experience");
          final int _cursorIndexOfTypes = CursorUtil.getColumnIndexOrThrow(_cursor, "types");
          final int _cursorIndexOfHp = CursorUtil.getColumnIndexOrThrow(_cursor, "hp");
          final int _cursorIndexOfAttack = CursorUtil.getColumnIndexOrThrow(_cursor, "attack");
          final int _cursorIndexOfDefense = CursorUtil.getColumnIndexOrThrow(_cursor, "defense");
          final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
          final int _cursorIndexOfExp = CursorUtil.getColumnIndexOrThrow(_cursor, "exp");
          final PokemonInfoEntity _result;
          if (_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpHeight;
            _tmpHeight = _cursor.getInt(_cursorIndexOfHeight);
            final int _tmpWeight;
            _tmpWeight = _cursor.getInt(_cursorIndexOfWeight);
            final int _tmpExperience;
            _tmpExperience = _cursor.getInt(_cursorIndexOfExperience);
            final List<PokemonInfo.TypeResponse> _tmpTypes;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfTypes);
            final List<PokemonInfo.TypeResponse> _tmp_1 = __typeResponseConverter().fromString(_tmp);
            if (_tmp_1 == null) {
              throw new IllegalStateException("Expected NON-NULL 'java.util.List<com.skydoves.pokedex.core.model.PokemonInfo.TypeResponse>', but it was NULL.");
            } else {
              _tmpTypes = _tmp_1;
            }
            final int _tmpHp;
            _tmpHp = _cursor.getInt(_cursorIndexOfHp);
            final int _tmpAttack;
            _tmpAttack = _cursor.getInt(_cursorIndexOfAttack);
            final int _tmpDefense;
            _tmpDefense = _cursor.getInt(_cursorIndexOfDefense);
            final int _tmpSpeed;
            _tmpSpeed = _cursor.getInt(_cursorIndexOfSpeed);
            final int _tmpExp;
            _tmpExp = _cursor.getInt(_cursorIndexOfExp);
            _result = new PokemonInfoEntity(_tmpId,_tmpName,_tmpHeight,_tmpWeight,_tmpExperience,_tmpTypes,_tmpHp,_tmpAttack,_tmpDefense,_tmpSpeed,_tmpExp);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Arrays.asList(TypeResponseConverter.class);
  }

  private synchronized TypeResponseConverter __typeResponseConverter() {
    if (__typeResponseConverter == null) {
      __typeResponseConverter = __db.getTypeConverter(TypeResponseConverter.class);
    }
    return __typeResponseConverter;
  }
}
