package com.skydoves.pokedex.core.database.di;

import com.skydoves.pokedex.core.database.TypeResponseConverter;
import com.squareup.moshi.Moshi;
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
public final class DatabaseModule_ProvideTypeResponseConverterFactory implements Factory<TypeResponseConverter> {
  private final Provider<Moshi> moshiProvider;

  public DatabaseModule_ProvideTypeResponseConverterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public TypeResponseConverter get() {
    return provideTypeResponseConverter(moshiProvider.get());
  }

  public static DatabaseModule_ProvideTypeResponseConverterFactory create(
      javax.inject.Provider<Moshi> moshiProvider) {
    return new DatabaseModule_ProvideTypeResponseConverterFactory(Providers.asDaggerProvider(moshiProvider));
  }

  public static DatabaseModule_ProvideTypeResponseConverterFactory create(
      Provider<Moshi> moshiProvider) {
    return new DatabaseModule_ProvideTypeResponseConverterFactory(moshiProvider);
  }

  public static TypeResponseConverter provideTypeResponseConverter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTypeResponseConverter(moshi));
  }
}
