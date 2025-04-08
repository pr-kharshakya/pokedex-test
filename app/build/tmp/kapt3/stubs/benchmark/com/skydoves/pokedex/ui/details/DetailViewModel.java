package com.skydoves.pokedex.ui.details;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8G@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108GX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00058G@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001f"}, d2 = {"Lcom/skydoves/pokedex/ui/details/DetailViewModel;", "Lcom/skydoves/bindables/BindingViewModel;", "detailRepository", "Lcom/skydoves/pokedex/core/repository/DetailRepository;", "pokemonName", "", "(Lcom/skydoves/pokedex/core/repository/DetailRepository;Ljava/lang/String;)V", "<set-?>", "", "isLoading", "()Z", "setLoading", "(Z)V", "isLoading$delegate", "Lcom/skydoves/bindables/BindingPropertyIdWithDefaultValue;", "pokemonInfo", "Lcom/skydoves/pokedex/core/model/PokemonInfo;", "getPokemonInfo", "()Lcom/skydoves/pokedex/core/model/PokemonInfo;", "pokemonInfo$delegate", "Lcom/skydoves/bindables/FlowBindingPropertyIdWithDefaultValueOnScope$Delegate;", "pokemonInfoFlow", "Lkotlinx/coroutines/flow/Flow;", "toastMessage", "getToastMessage", "()Ljava/lang/String;", "setToastMessage", "(Ljava/lang/String;)V", "toastMessage$delegate", "AssistedFactory", "Companion", "app_benchmark"})
public final class DetailViewModel extends com.skydoves.bindables.BindingViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pokemonName = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.bindables.BindingPropertyIdWithDefaultValue isLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.bindables.BindingPropertyIdWithDefaultValue toastMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.skydoves.pokedex.core.model.PokemonInfo> pokemonInfoFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.bindables.FlowBindingPropertyIdWithDefaultValueOnScope.Delegate pokemonInfo$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.skydoves.pokedex.ui.details.DetailViewModel.Companion Companion = null;
    
    @dagger.assisted.AssistedInject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.skydoves.pokedex.core.repository.DetailRepository detailRepository, @dagger.assisted.Assisted()
    @org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName) {
        super();
    }
    
    @androidx.databinding.Bindable()
    public final boolean isLoading() {
        return false;
    }
    
    private final void setLoading(boolean p0) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToastMessage() {
        return null;
    }
    
    private final void setToastMessage(java.lang.String p0) {
    }
    
    @androidx.databinding.Bindable()
    @org.jetbrains.annotations.Nullable()
    public final com.skydoves.pokedex.core.model.PokemonInfo getPokemonInfo() {
        return null;
    }
    
    @dagger.assisted.AssistedFactory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/skydoves/pokedex/ui/details/DetailViewModel$AssistedFactory;", "", "create", "Lcom/skydoves/pokedex/ui/details/DetailViewModel;", "pokemonName", "", "app_benchmark"})
    public static abstract interface AssistedFactory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.skydoves.pokedex.ui.details.DetailViewModel create(@org.jetbrains.annotations.NotNull()
        java.lang.String pokemonName);
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/skydoves/pokedex/ui/details/DetailViewModel$Companion;", "", "()V", "provideFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "assistedFactory", "Lcom/skydoves/pokedex/ui/details/DetailViewModel$AssistedFactory;", "pokemonName", "", "app_benchmark"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.ViewModelProvider.Factory provideFactory(@org.jetbrains.annotations.NotNull()
        com.skydoves.pokedex.ui.details.DetailViewModel.AssistedFactory assistedFactory, @org.jetbrains.annotations.NotNull()
        java.lang.String pokemonName) {
            return null;
        }
    }
}