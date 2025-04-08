package com.skydoves.pokedex.ui.details;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118AX\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/skydoves/pokedex/ui/details/DetailActivity;", "Lcom/skydoves/bindables/BindingActivity;", "Lcom/skydoves/pokedex/databinding/ActivityDetailBinding;", "()V", "detailViewModelFactory", "Lcom/skydoves/pokedex/ui/details/DetailViewModel$AssistedFactory;", "getDetailViewModelFactory$app_release", "()Lcom/skydoves/pokedex/ui/details/DetailViewModel$AssistedFactory;", "setDetailViewModelFactory$app_release", "(Lcom/skydoves/pokedex/ui/details/DetailViewModel$AssistedFactory;)V", "pokemon", "Lcom/skydoves/pokedex/core/model/Pokemon;", "getPokemon", "()Lcom/skydoves/pokedex/core/model/Pokemon;", "pokemon$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/skydoves/pokedex/ui/details/DetailViewModel;", "getViewModel$app_release", "()Lcom/skydoves/pokedex/ui/details/DetailViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"})
public final class DetailActivity extends com.skydoves.bindables.BindingActivity<com.skydoves.pokedex.databinding.ActivityDetailBinding> {
    @javax.inject.Inject()
    public com.skydoves.pokedex.ui.details.DetailViewModel.AssistedFactory detailViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy pokemon$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_POKEMON = "EXTRA_POKEMON";
    @org.jetbrains.annotations.NotNull()
    public static final com.skydoves.pokedex.ui.details.DetailActivity.Companion Companion = null;
    
    public DetailActivity() {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.pokedex.ui.details.DetailViewModel.AssistedFactory getDetailViewModelFactory$app_release() {
        return null;
    }
    
    public final void setDetailViewModelFactory$app_release(@org.jetbrains.annotations.NotNull()
    com.skydoves.pokedex.ui.details.DetailViewModel.AssistedFactory p0) {
    }
    
    @androidx.annotation.VisibleForTesting()
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.pokedex.ui.details.DetailViewModel getViewModel$app_release() {
        return null;
    }
    
    private final com.skydoves.pokedex.core.model.Pokemon getPokemon() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\f"}, d2 = {"Lcom/skydoves/pokedex/ui/details/DetailActivity$Companion;", "", "()V", "EXTRA_POKEMON", "", "getEXTRA_POKEMON$app_release$annotations", "startActivity", "Landroid/content/Intent;", "transformationLayout", "Lcom/skydoves/transformationlayout/TransformationLayout;", "pokemon", "Lcom/skydoves/pokedex/core/model/Pokemon;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent startActivity(@org.jetbrains.annotations.NotNull()
        com.skydoves.transformationlayout.TransformationLayout transformationLayout, @org.jetbrains.annotations.NotNull()
        com.skydoves.pokedex.core.model.Pokemon pokemon) {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getEXTRA_POKEMON$app_release$annotations() {
        }
    }
}