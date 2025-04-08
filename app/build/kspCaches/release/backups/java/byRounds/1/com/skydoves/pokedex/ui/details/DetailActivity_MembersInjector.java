package com.skydoves.pokedex.ui.details;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class DetailActivity_MembersInjector implements MembersInjector<DetailActivity> {
  private final Provider<DetailViewModel.AssistedFactory> detailViewModelFactoryProvider;

  public DetailActivity_MembersInjector(
      Provider<DetailViewModel.AssistedFactory> detailViewModelFactoryProvider) {
    this.detailViewModelFactoryProvider = detailViewModelFactoryProvider;
  }

  public static MembersInjector<DetailActivity> create(
      Provider<DetailViewModel.AssistedFactory> detailViewModelFactoryProvider) {
    return new DetailActivity_MembersInjector(detailViewModelFactoryProvider);
  }

  public static MembersInjector<DetailActivity> create(
      javax.inject.Provider<DetailViewModel.AssistedFactory> detailViewModelFactoryProvider) {
    return new DetailActivity_MembersInjector(Providers.asDaggerProvider(detailViewModelFactoryProvider));
  }

  @Override
  public void injectMembers(DetailActivity instance) {
    injectDetailViewModelFactory(instance, detailViewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.skydoves.pokedex.ui.details.DetailActivity.detailViewModelFactory")
  public static void injectDetailViewModelFactory(DetailActivity instance,
      DetailViewModel.AssistedFactory detailViewModelFactory) {
    instance.detailViewModelFactory = detailViewModelFactory;
  }
}
