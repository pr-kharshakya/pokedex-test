package com.skydoves.pokedex.ui.details;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class DetailViewModel_AssistedFactory_Impl implements DetailViewModel.AssistedFactory {
  private final DetailViewModel_Factory delegateFactory;

  DetailViewModel_AssistedFactory_Impl(DetailViewModel_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public DetailViewModel create(String pokemonName) {
    return delegateFactory.get(pokemonName);
  }

  public static Provider<DetailViewModel.AssistedFactory> create(
      DetailViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new DetailViewModel_AssistedFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<DetailViewModel.AssistedFactory> createFactoryProvider(
      DetailViewModel_Factory delegateFactory) {
    return InstanceFactory.create(new DetailViewModel_AssistedFactory_Impl(delegateFactory));
  }
}
