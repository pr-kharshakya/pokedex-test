package com.skydoves.pokedex.core.network.di;

import com.skydoves.pokedex.core.network.service.PokedexClient;
import com.skydoves.pokedex.core.network.service.PokedexService;
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
public final class NetworkModule_ProvidePokedexClientFactory implements Factory<PokedexClient> {
  private final Provider<PokedexService> pokedexServiceProvider;

  public NetworkModule_ProvidePokedexClientFactory(
      Provider<PokedexService> pokedexServiceProvider) {
    this.pokedexServiceProvider = pokedexServiceProvider;
  }

  @Override
  public PokedexClient get() {
    return providePokedexClient(pokedexServiceProvider.get());
  }

  public static NetworkModule_ProvidePokedexClientFactory create(
      javax.inject.Provider<PokedexService> pokedexServiceProvider) {
    return new NetworkModule_ProvidePokedexClientFactory(Providers.asDaggerProvider(pokedexServiceProvider));
  }

  public static NetworkModule_ProvidePokedexClientFactory create(
      Provider<PokedexService> pokedexServiceProvider) {
    return new NetworkModule_ProvidePokedexClientFactory(pokedexServiceProvider);
  }

  public static PokedexClient providePokedexClient(PokedexService pokedexService) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providePokedexClient(pokedexService));
  }
}
