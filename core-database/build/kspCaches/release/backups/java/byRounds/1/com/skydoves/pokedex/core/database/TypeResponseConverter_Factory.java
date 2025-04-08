package com.skydoves.pokedex.core.database;

import com.squareup.moshi.Moshi;
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
public final class TypeResponseConverter_Factory implements Factory<TypeResponseConverter> {
  private final Provider<Moshi> moshiProvider;

  public TypeResponseConverter_Factory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public TypeResponseConverter get() {
    return newInstance(moshiProvider.get());
  }

  public static TypeResponseConverter_Factory create(javax.inject.Provider<Moshi> moshiProvider) {
    return new TypeResponseConverter_Factory(Providers.asDaggerProvider(moshiProvider));
  }

  public static TypeResponseConverter_Factory create(Provider<Moshi> moshiProvider) {
    return new TypeResponseConverter_Factory(moshiProvider);
  }

  public static TypeResponseConverter newInstance(Moshi moshi) {
    return new TypeResponseConverter(moshi);
  }
}
