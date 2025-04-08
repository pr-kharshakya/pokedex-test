package com.skydoves.pokedex.core.network.service;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class PokedexClient_Factory implements Factory<PokedexClient> {
  private final Provider<PokedexService> pokedexServiceProvider;

  public PokedexClient_Factory(Provider<PokedexService> pokedexServiceProvider) {
    this.pokedexServiceProvider = pokedexServiceProvider;
  }

  @Override
  public PokedexClient get() {
    return newInstance(pokedexServiceProvider.get());
  }

  public static PokedexClient_Factory create(
      javax.inject.Provider<PokedexService> pokedexServiceProvider) {
    return new PokedexClient_Factory(Providers.asDaggerProvider(pokedexServiceProvider));
  }

  public static PokedexClient_Factory create(Provider<PokedexService> pokedexServiceProvider) {
    return new PokedexClient_Factory(pokedexServiceProvider);
  }

  public static PokedexClient newInstance(PokedexService pokedexService) {
    return new PokedexClient(pokedexService);
  }
}
