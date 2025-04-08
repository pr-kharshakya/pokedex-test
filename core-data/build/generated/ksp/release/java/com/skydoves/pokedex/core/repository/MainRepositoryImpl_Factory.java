package com.skydoves.pokedex.core.repository;

import com.skydoves.pokedex.core.database.PokemonDao;
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
public final class MainRepositoryImpl_Factory implements Factory<MainRepositoryImpl> {
  private final Provider<PokedexClient> pokedexClientProvider;

  private final Provider<PokemonDao> pokemonDaoProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public MainRepositoryImpl_Factory(Provider<PokedexClient> pokedexClientProvider,
      Provider<PokemonDao> pokemonDaoProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.pokedexClientProvider = pokedexClientProvider;
    this.pokemonDaoProvider = pokemonDaoProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public MainRepositoryImpl get() {
    return newInstance(pokedexClientProvider.get(), pokemonDaoProvider.get(), ioDispatcherProvider.get());
  }

  public static MainRepositoryImpl_Factory create(
      javax.inject.Provider<PokedexClient> pokedexClientProvider,
      javax.inject.Provider<PokemonDao> pokemonDaoProvider,
      javax.inject.Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new MainRepositoryImpl_Factory(Providers.asDaggerProvider(pokedexClientProvider), Providers.asDaggerProvider(pokemonDaoProvider), Providers.asDaggerProvider(ioDispatcherProvider));
  }

  public static MainRepositoryImpl_Factory create(Provider<PokedexClient> pokedexClientProvider,
      Provider<PokemonDao> pokemonDaoProvider, Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new MainRepositoryImpl_Factory(pokedexClientProvider, pokemonDaoProvider, ioDispatcherProvider);
  }

  public static MainRepositoryImpl newInstance(PokedexClient pokedexClient, PokemonDao pokemonDao,
      CoroutineDispatcher ioDispatcher) {
    return new MainRepositoryImpl(pokedexClient, pokemonDao, ioDispatcher);
  }
}
