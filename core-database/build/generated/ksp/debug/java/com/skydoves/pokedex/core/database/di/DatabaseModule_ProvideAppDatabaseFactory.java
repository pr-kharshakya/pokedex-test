package com.skydoves.pokedex.core.database.di;

import android.app.Application;
import com.skydoves.pokedex.core.database.PokedexDatabase;
import com.skydoves.pokedex.core.database.TypeResponseConverter;
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
public final class DatabaseModule_ProvideAppDatabaseFactory implements Factory<PokedexDatabase> {
  private final Provider<Application> applicationProvider;

  private final Provider<TypeResponseConverter> typeResponseConverterProvider;

  public DatabaseModule_ProvideAppDatabaseFactory(Provider<Application> applicationProvider,
      Provider<TypeResponseConverter> typeResponseConverterProvider) {
    this.applicationProvider = applicationProvider;
    this.typeResponseConverterProvider = typeResponseConverterProvider;
  }

  @Override
  public PokedexDatabase get() {
    return provideAppDatabase(applicationProvider.get(), typeResponseConverterProvider.get());
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(
      javax.inject.Provider<Application> applicationProvider,
      javax.inject.Provider<TypeResponseConverter> typeResponseConverterProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(Providers.asDaggerProvider(applicationProvider), Providers.asDaggerProvider(typeResponseConverterProvider));
  }

  public static DatabaseModule_ProvideAppDatabaseFactory create(
      Provider<Application> applicationProvider,
      Provider<TypeResponseConverter> typeResponseConverterProvider) {
    return new DatabaseModule_ProvideAppDatabaseFactory(applicationProvider, typeResponseConverterProvider);
  }

  public static PokedexDatabase provideAppDatabase(Application application,
      TypeResponseConverter typeResponseConverter) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideAppDatabase(application, typeResponseConverter));
  }
}
