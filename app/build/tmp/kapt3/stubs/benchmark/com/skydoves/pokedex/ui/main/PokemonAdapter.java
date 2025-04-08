package com.skydoves.pokedex.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/skydoves/pokedex/ui/main/PokemonAdapter;", "Lcom/skydoves/bindables/BindingListAdapter;", "Lcom/skydoves/pokedex/core/model/Pokemon;", "Lcom/skydoves/pokedex/ui/main/PokemonAdapter$PokemonViewHolder;", "()V", "onClickedAt", "", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "PokemonViewHolder", "app_benchmark"})
public final class PokemonAdapter extends com.skydoves.bindables.BindingListAdapter<com.skydoves.pokedex.core.model.Pokemon, com.skydoves.pokedex.ui.main.PokemonAdapter.PokemonViewHolder> {
    private long onClickedAt = 0L;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.skydoves.pokedex.core.model.Pokemon> diffUtil = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.skydoves.pokedex.ui.main.PokemonAdapter.Companion Companion = null;
    
    public PokemonAdapter() {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.skydoves.pokedex.ui.main.PokemonAdapter.PokemonViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.skydoves.pokedex.ui.main.PokemonAdapter.PokemonViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/skydoves/pokedex/ui/main/PokemonAdapter$Companion;", "", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/skydoves/pokedex/core/model/Pokemon;", "app_benchmark"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/skydoves/pokedex/ui/main/PokemonAdapter$PokemonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/skydoves/pokedex/databinding/ItemPokemonBinding;", "(Lcom/skydoves/pokedex/ui/main/PokemonAdapter;Lcom/skydoves/pokedex/databinding/ItemPokemonBinding;)V", "bindPokemon", "", "pokemon", "Lcom/skydoves/pokedex/core/model/Pokemon;", "app_benchmark"})
    public final class PokemonViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.skydoves.pokedex.databinding.ItemPokemonBinding binding = null;
        
        public PokemonViewHolder(@org.jetbrains.annotations.NotNull()
        com.skydoves.pokedex.databinding.ItemPokemonBinding binding) {
            super(null);
        }
        
        public final void bindPokemon(@org.jetbrains.annotations.NotNull()
        com.skydoves.pokedex.core.model.Pokemon pokemon) {
        }
    }
}