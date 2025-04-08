package com.skydoves.pokedex.ui.details;

import com.skydoves.pokedex.core.repository.DetailRepository;
import dagger.internal.DaggerGenerated;
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
public final class DetailViewModel_Factory {
  private final Provider<DetailRepository> detailRepositoryProvider;

  public DetailViewModel_Factory(Provider<DetailRepository> detailRepositoryProvider) {
    this.detailRepositoryProvider = detailRepositoryProvider;
  }

  public DetailViewModel get(String pokemonName) {
    return newInstance(detailRepositoryProvider.get(), pokemonName);
  }

  public static DetailViewModel_Factory create(
      javax.inject.Provider<DetailRepository> detailRepositoryProvider) {
    return new DetailViewModel_Factory(Providers.asDaggerProvider(detailRepositoryProvider));
  }

  public static DetailViewModel_Factory create(
      Provider<DetailRepository> detailRepositoryProvider) {
    return new DetailViewModel_Factory(detailRepositoryProvider);
  }

  public static DetailViewModel newInstance(DetailRepository detailRepository, String pokemonName) {
    return new DetailViewModel(detailRepository, pokemonName);
  }
}
