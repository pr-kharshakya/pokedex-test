package com.skydoves.pokedex.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0007R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118GX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00198G@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\""}, d2 = {"Lcom/skydoves/pokedex/ui/main/MainViewModel;", "Lcom/skydoves/bindables/BindingViewModel;", "mainRepository", "Lcom/skydoves/pokedex/core/repository/MainRepository;", "(Lcom/skydoves/pokedex/core/repository/MainRepository;)V", "<set-?>", "", "isLoading", "()Z", "setLoading", "(Z)V", "isLoading$delegate", "Lcom/skydoves/bindables/BindingPropertyIdWithDefaultValue;", "pokemonFetchingIndex", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "pokemonList", "", "Lcom/skydoves/pokedex/core/model/Pokemon;", "getPokemonList", "()Ljava/util/List;", "pokemonList$delegate", "Lcom/skydoves/bindables/FlowBindingPropertyIdWithDefaultValueOnScope$Delegate;", "pokemonListFlow", "Lkotlinx/coroutines/flow/Flow;", "", "toastMessage", "getToastMessage", "()Ljava/lang/String;", "setToastMessage", "(Ljava/lang/String;)V", "toastMessage$delegate", "fetchNextPokemonList", "", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MainViewModel extends com.skydoves.bindables.BindingViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.pokedex.core.repository.MainRepository mainRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.bindables.BindingPropertyIdWithDefaultValue isLoading$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.bindables.BindingPropertyIdWithDefaultValue toastMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> pokemonFetchingIndex = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.skydoves.pokedex.core.model.Pokemon>> pokemonListFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.bindables.FlowBindingPropertyIdWithDefaultValueOnScope.Delegate pokemonList$delegate = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.skydoves.pokedex.core.repository.MainRepository mainRepository) {
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
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.skydoves.pokedex.core.model.Pokemon> getPokemonList() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    public final void fetchNextPokemonList() {
    }
}