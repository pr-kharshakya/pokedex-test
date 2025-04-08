package com.skydoves.pokedex.core.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PokedexDatabase_Impl extends PokedexDatabase {
  private volatile PokemonDao _pokemonDao;

  private volatile PokemonInfoDao _pokemonInfoDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `PokemonEntity` (`page` INTEGER NOT NULL, `name` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`name`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `PokemonInfoEntity` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `height` INTEGER NOT NULL, `weight` INTEGER NOT NULL, `experience` INTEGER NOT NULL, `types` TEXT NOT NULL, `hp` INTEGER NOT NULL, `attack` INTEGER NOT NULL, `defense` INTEGER NOT NULL, `speed` INTEGER NOT NULL, `exp` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3e4fc349c7e47ef58902f587531caab0')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `PokemonEntity`");
        db.execSQL("DROP TABLE IF EXISTS `PokemonInfoEntity`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsPokemonEntity = new HashMap<String, TableInfo.Column>(3);
        _columnsPokemonEntity.put("page", new TableInfo.Column("page", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonEntity.put("name", new TableInfo.Column("name", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonEntity.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPokemonEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPokemonEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPokemonEntity = new TableInfo("PokemonEntity", _columnsPokemonEntity, _foreignKeysPokemonEntity, _indicesPokemonEntity);
        final TableInfo _existingPokemonEntity = TableInfo.read(db, "PokemonEntity");
        if (!_infoPokemonEntity.equals(_existingPokemonEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PokemonEntity(com.skydoves.pokedex.core.database.entity.PokemonEntity).\n"
                  + " Expected:\n" + _infoPokemonEntity + "\n"
                  + " Found:\n" + _existingPokemonEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsPokemonInfoEntity = new HashMap<String, TableInfo.Column>(11);
        _columnsPokemonInfoEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("height", new TableInfo.Column("height", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("weight", new TableInfo.Column("weight", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("experience", new TableInfo.Column("experience", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("types", new TableInfo.Column("types", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("hp", new TableInfo.Column("hp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("attack", new TableInfo.Column("attack", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("defense", new TableInfo.Column("defense", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("speed", new TableInfo.Column("speed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonInfoEntity.put("exp", new TableInfo.Column("exp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPokemonInfoEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPokemonInfoEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPokemonInfoEntity = new TableInfo("PokemonInfoEntity", _columnsPokemonInfoEntity, _foreignKeysPokemonInfoEntity, _indicesPokemonInfoEntity);
        final TableInfo _existingPokemonInfoEntity = TableInfo.read(db, "PokemonInfoEntity");
        if (!_infoPokemonInfoEntity.equals(_existingPokemonInfoEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "PokemonInfoEntity(com.skydoves.pokedex.core.database.entity.PokemonInfoEntity).\n"
                  + " Expected:\n" + _infoPokemonInfoEntity + "\n"
                  + " Found:\n" + _existingPokemonInfoEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3e4fc349c7e47ef58902f587531caab0", "c383a28f83a2d8bdf515f102130e5f01");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "PokemonEntity","PokemonInfoEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `PokemonEntity`");
      _db.execSQL("DELETE FROM `PokemonInfoEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PokemonDao.class, PokemonDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PokemonInfoDao.class, PokemonInfoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public PokemonDao pokemonDao() {
    if (_pokemonDao != null) {
      return _pokemonDao;
    } else {
      synchronized(this) {
        if(_pokemonDao == null) {
          _pokemonDao = new PokemonDao_Impl(this);
        }
        return _pokemonDao;
      }
    }
  }

  @Override
  public PokemonInfoDao pokemonInfoDao() {
    if (_pokemonInfoDao != null) {
      return _pokemonInfoDao;
    } else {
      synchronized(this) {
        if(_pokemonInfoDao == null) {
          _pokemonInfoDao = new PokemonInfoDao_Impl(this);
        }
        return _pokemonInfoDao;
      }
    }
  }
}
