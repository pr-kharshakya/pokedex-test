package com.skydoves.pokedex.ui.main;

import com.skydoves.pokedex.core.repository.MainRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MainRepository> mainRepositoryProvider;

  public MainViewModel_Factory(Provider<MainRepository> mainRepositoryProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(mainRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(
      javax.inject.Provider<MainRepository> mainRepositoryProvider) {
    return new MainViewModel_Factory(Providers.asDaggerProvider(mainRepositoryProvider));
  }

  public static MainViewModel_Factory create(Provider<MainRepository> mainRepositoryProvider) {
    return new MainViewModel_Factory(mainRepositoryProvider);
  }

  public static MainViewModel newInstance(MainRepository mainRepository) {
    return new MainViewModel(mainRepository);
  }
}
