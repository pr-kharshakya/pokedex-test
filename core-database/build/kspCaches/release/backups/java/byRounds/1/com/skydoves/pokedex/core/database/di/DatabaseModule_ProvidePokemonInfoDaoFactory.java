package com.skydoves.pokedex.core.database.di;

import com.skydoves.pokedex.core.database.PokedexDatabase;
import com.skydoves.pokedex.core.database.PokemonInfoDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class DatabaseModule_ProvidePokemonInfoDaoFactory implements Factory<PokemonInfoDao> {
  private final Provider<PokedexDatabase> appDatabaseProvider;

  public DatabaseModule_ProvidePokemonInfoDaoFactory(
      Provider<PokedexDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public PokemonInfoDao get() {
    return providePokemonInfoDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvidePokemonInfoDaoFactory create(
      javax.inject.Provider<PokedexDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvidePokemonInfoDaoFactory(Providers.asDaggerProvider(appDatabaseProvider));
  }

  public static DatabaseModule_ProvidePokemonInfoDaoFactory create(
      Provider<PokedexDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvidePokemonInfoDaoFactory(appDatabaseProvider);
  }

  public static PokemonInfoDao providePokemonInfoDao(PokedexDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providePokemonInfoDao(appDatabase));
  }
}
