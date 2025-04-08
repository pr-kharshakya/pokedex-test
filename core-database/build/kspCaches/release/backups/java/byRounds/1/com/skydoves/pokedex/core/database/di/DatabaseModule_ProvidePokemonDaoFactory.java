package com.skydoves.pokedex.core.database.di;

import com.skydoves.pokedex.core.database.PokedexDatabase;
import com.skydoves.pokedex.core.database.PokemonDao;
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
public final class DatabaseModule_ProvidePokemonDaoFactory implements Factory<PokemonDao> {
  private final Provider<PokedexDatabase> appDatabaseProvider;

  public DatabaseModule_ProvidePokemonDaoFactory(Provider<PokedexDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public PokemonDao get() {
    return providePokemonDao(appDatabaseProvider.get());
  }

  public static DatabaseModule_ProvidePokemonDaoFactory create(
      javax.inject.Provider<PokedexDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvidePokemonDaoFactory(Providers.asDaggerProvider(appDatabaseProvider));
  }

  public static DatabaseModule_ProvidePokemonDaoFactory create(
      Provider<PokedexDatabase> appDatabaseProvider) {
    return new DatabaseModule_ProvidePokemonDaoFactory(appDatabaseProvider);
  }

  public static PokemonDao providePokemonDao(PokedexDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.providePokemonDao(appDatabase));
  }
}
