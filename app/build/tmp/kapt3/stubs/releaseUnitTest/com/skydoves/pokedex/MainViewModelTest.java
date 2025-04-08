package com.skydoves.pokedex;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0012H\u0007R\u0013\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/skydoves/pokedex/MainViewModelTest;", "", "()V", "coroutinesRule", "Lcom/skydoves/pokedex/core/test/MainCoroutinesRule;", "getCoroutinesRule", "()Lcom/skydoves/pokedex/core/test/MainCoroutinesRule;", "mainRepository", "Lcom/skydoves/pokedex/core/repository/MainRepository;", "pokdexClient", "Lcom/skydoves/pokedex/core/network/service/PokedexClient;", "pokedexService", "Lcom/skydoves/pokedex/core/network/service/PokedexService;", "pokemonDao", "Lcom/skydoves/pokedex/core/database/PokemonDao;", "viewModel", "Lcom/skydoves/pokedex/ui/main/MainViewModel;", "fetchPokemonListTest", "", "Lkotlinx/coroutines/test/TestResult;", "setup", "app_releaseUnitTest"})
public final class MainViewModelTest {
    private com.skydoves.pokedex.ui.main.MainViewModel viewModel;
    private com.skydoves.pokedex.core.repository.MainRepository mainRepository;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.pokedex.core.network.service.PokedexService pokedexService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.pokedex.core.network.service.PokedexClient pokdexClient = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.pokedex.core.database.PokemonDao pokemonDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.skydoves.pokedex.core.test.MainCoroutinesRule coroutinesRule = null;
    
    public MainViewModelTest() {
        super();
    }
    
    @org.junit.Rule()
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.pokedex.core.test.MainCoroutinesRule getCoroutinesRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void setup() {
    }
    
    @org.junit.Test()
    public final void fetchPokemonListTest() {
    }
}