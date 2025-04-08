package com.skydoves.pokedex.databinding;
import com.skydoves.pokedex.R;
import com.skydoves.pokedex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPokemonBindingImpl extends ItemPokemonBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPokemonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemPokemonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (com.skydoves.transformationlayout.TransformationLayout) bindings[0]
            );
        this.image.setTag(null);
        this.name.setTag(null);
        this.transformationLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.pokemon == variableId) {
            setPokemon((com.skydoves.pokedex.core.model.Pokemon) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPokemon(@Nullable com.skydoves.pokedex.core.model.Pokemon Pokemon) {
        this.mPokemon = Pokemon;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pokemon);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String pokemonImageUrl = null;
        java.lang.String pokemonName = null;
        com.skydoves.pokedex.core.model.Pokemon pokemon = mPokemon;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pokemon != null) {
                    // read pokemon.imageUrl
                    pokemonImageUrl = pokemon.getImageUrl();
                    // read pokemon.name()
                    pokemonName = pokemon.name();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindLoadImagePalette(this.image, pokemonImageUrl, cardView);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, pokemonName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pokemon
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}