package com.skydoves.pokedex.core.repository;

import com.skydoves.pokedex.core.database.PokemonInfoDao;
import com.skydoves.pokedex.core.network.service.PokedexClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.skydoves.pokedex.core.network.Dispatcher")
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
public final class DetailRepositoryImpl_Factory implements Factory<DetailRepositoryImpl> {
  private final Provider<PokedexClient> pokedexClientProvider;

  private final Provider<PokemonInfoDao> pokemonInfoDaoProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public DetailRepositoryImpl_Factory(Provider<PokedexClient> pokedexClientProvider,
      Provider<PokemonInfoDao> pokemonInfoDaoProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.pokedexClientProvider = pokedexClientProvider;
    this.pokemonInfoDaoProvider = pokemonInfoDaoProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public DetailRepositoryImpl get() {
    return newInstance(pokedexClientProvider.get(), pokemonInfoDaoProvider.get(), ioDispatcherProvider.get());
  }

  public static DetailRepositoryImpl_Factory create(
      javax.inject.Provider<PokedexClient> pokedexClientProvider,
      javax.inject.Provider<PokemonInfoDao> pokemonInfoDaoProvider,
      javax.inject.Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new DetailRepositoryImpl_Factory(Providers.asDaggerProvider(pokedexClientProvider), Providers.asDaggerProvider(pokemonInfoDaoProvider), Providers.asDaggerProvider(ioDispatcherProvider));
  }

  public static DetailRepositoryImpl_Factory create(Provider<PokedexClient> pokedexClientProvider,
      Provider<PokemonInfoDao> pokemonInfoDaoProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new DetailRepositoryImpl_Factory(pokedexClientProvider, pokemonInfoDaoProvider, ioDispatcherProvider);
  }

  public static DetailRepositoryImpl newInstance(PokedexClient pokedexClient,
      PokemonInfoDao pokemonInfoDao, CoroutineDispatcher ioDispatcher) {
    return new DetailRepositoryImpl(pokedexClient, pokemonInfoDao, ioDispatcher);
  }
}
