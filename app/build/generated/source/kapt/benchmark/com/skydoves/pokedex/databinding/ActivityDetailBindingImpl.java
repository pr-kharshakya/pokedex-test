package com.skydoves.pokedex.databinding;
import com.skydoves.pokedex.R;
import com.skydoves.pokedex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailBindingImpl extends ActivityDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_name, 14);
        sViewsWithIds.put(R.id.header, 15);
        sViewsWithIds.put(R.id.weight_title, 16);
        sViewsWithIds.put(R.id.height_title, 17);
        sViewsWithIds.put(R.id.stats_title, 18);
        sViewsWithIds.put(R.id.hp, 19);
        sViewsWithIds.put(R.id.attack, 20);
        sViewsWithIds.put(R.id.defense, 21);
        sViewsWithIds.put(R.id.speed, 22);
        sViewsWithIds.put(R.id.exp, 23);
    }
    // views
    @NonNull
    private final com.skydoves.progressview.ProgressView mboundView10;
    @NonNull
    private final com.skydoves.progressview.ProgressView mboundView11;
    @NonNull
    private final com.skydoves.progressview.ProgressView mboundView12;
    @NonNull
    private final com.skydoves.progressview.ProgressView mboundView13;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ActivityDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatTextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[23]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.core.widget.NestedScrollView) bindings[0]
            , (com.skydoves.progressview.ProgressView) bindings[9]
            , (android.widget.ProgressBar) bindings[6]
            , (com.skydoves.androidribbon.RibbonRecyclerView) bindings[5]
            , (android.widget.TextView) bindings[22]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            );
        this.arrow.setTag(null);
        this.height.setTag(null);
        this.image.setTag(null);
        this.index.setTag(null);
        this.mboundView10 = (com.skydoves.progressview.ProgressView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (com.skydoves.progressview.ProgressView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (com.skydoves.progressview.ProgressView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (com.skydoves.progressview.ProgressView) bindings[13];
        this.mboundView13.setTag(null);
        this.name.setTag(null);
        this.nestedScroll.setTag(null);
        this.progressHp.setTag(null);
        this.progressbar.setTag(null);
        this.ribbonRecyclerView.setTag(null);
        this.weight.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.vm == variableId) {
            setVm((com.skydoves.pokedex.ui.details.DetailViewModel) variable);
        }
        else if (BR.pokemon == variableId) {
            setPokemon((com.skydoves.pokedex.core.model.Pokemon) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.skydoves.pokedex.ui.details.DetailViewModel Vm) {
        updateRegistration(0, Vm);
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setPokemon(@Nullable com.skydoves.pokedex.core.model.Pokemon Pokemon) {
        this.mPokemon = Pokemon;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.pokemon);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVm((com.skydoves.pokedex.ui.details.DetailViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVm(com.skydoves.pokedex.ui.details.DetailViewModel Vm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.pokemonInfo) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.toastMessage) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.loading) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
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
        java.lang.String pokemonName = null;
        java.lang.String vmPokemonInfoHeightString = null;
        java.lang.String vmPokemonInfoSpeedString = null;
        com.skydoves.pokedex.ui.details.DetailViewModel vm = mVm;
        int vmPokemonInfoExp = 0;
        boolean vmLoading = false;
        java.lang.String vmPokemonInfoAttackString = null;
        int vmPokemonInfoDefense = 0;
        java.lang.String pokemonImageUrl = null;
        int vmPokemonInfoSpeed = 0;
        java.lang.String vmToastMessage = null;
        com.skydoves.pokedex.core.model.Pokemon pokemon = mPokemon;
        java.lang.String vmPokemonInfoIdString = null;
        java.util.List<com.skydoves.pokedex.core.model.PokemonInfo.TypeResponse> vmPokemonInfoTypes = null;
        java.lang.String vmPokemonInfoHpString = null;
        java.lang.String vmPokemonInfoDefenseString = null;
        java.lang.String vmPokemonInfoExpString = null;
        int vmPokemonInfoHp = 0;
        com.skydoves.pokedex.core.model.PokemonInfo vmPokemonInfo = null;
        int vmPokemonInfoAttack = 0;
        java.lang.String vmPokemonInfoWeightString = null;
        boolean VmLoading1 = false;

        if ((dirtyFlags & 0x3dL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (vm != null) {
                        // read vm.toastMessage
                        vmToastMessage = vm.getToastMessage();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (vm != null) {
                        // read vm.pokemonInfo
                        vmPokemonInfo = vm.getPokemonInfo();
                    }


                    if (vmPokemonInfo != null) {
                        // read vm.pokemonInfo.heightString
                        vmPokemonInfoHeightString = vmPokemonInfo.getHeightString();
                        // read vm.pokemonInfo.speedString
                        vmPokemonInfoSpeedString = vmPokemonInfo.getSpeedString();
                        // read vm.pokemonInfo.exp
                        vmPokemonInfoExp = vmPokemonInfo.getExp();
                        // read vm.pokemonInfo.attackString
                        vmPokemonInfoAttackString = vmPokemonInfo.getAttackString();
                        // read vm.pokemonInfo.defense
                        vmPokemonInfoDefense = vmPokemonInfo.getDefense();
                        // read vm.pokemonInfo.speed
                        vmPokemonInfoSpeed = vmPokemonInfo.getSpeed();
                        // read vm.pokemonInfo.idString
                        vmPokemonInfoIdString = vmPokemonInfo.getIdString();
                        // read vm.pokemonInfo.types
                        vmPokemonInfoTypes = vmPokemonInfo.getTypes();
                        // read vm.pokemonInfo.hpString
                        vmPokemonInfoHpString = vmPokemonInfo.getHpString();
                        // read vm.pokemonInfo.defenseString
                        vmPokemonInfoDefenseString = vmPokemonInfo.getDefenseString();
                        // read vm.pokemonInfo.expString
                        vmPokemonInfoExpString = vmPokemonInfo.getExpString();
                        // read vm.pokemonInfo.hp
                        vmPokemonInfoHp = vmPokemonInfo.getHp();
                        // read vm.pokemonInfo.attack
                        vmPokemonInfoAttack = vmPokemonInfo.getAttack();
                        // read vm.pokemonInfo.weightString
                        vmPokemonInfoWeightString = vmPokemonInfo.getWeightString();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (vm != null) {
                        // read vm.loading
                        VmLoading1 = vm.isLoading();
                    }


                    // read !vm.loading
                    vmLoading = !VmLoading1;
            }
        }
        if ((dirtyFlags & 0x22L) != 0) {



                if (pokemon != null) {
                    // read pokemon.name()
                    pokemonName = pokemon.name();
                    // read pokemon.imageUrl
                    pokemonImageUrl = pokemon.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindOnBackPressed(this.arrow, true);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewMax(this.mboundView10, com.skydoves.pokedex.core.model.PokemonInfo.MAX_ATTACK);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewMax(this.mboundView11, com.skydoves.pokedex.core.model.PokemonInfo.MAX_DEFENSE);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewMax(this.mboundView12, com.skydoves.pokedex.core.model.PokemonInfo.MAX_SPEED);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewMax(this.mboundView13, com.skydoves.pokedex.core.model.PokemonInfo.MAX_EXP);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewMax(this.progressHp, com.skydoves.pokedex.core.model.PokemonInfo.MAX_HP);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.height, vmPokemonInfoHeightString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.index, vmPokemonInfoIdString);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewLabelText(this.mboundView10, vmPokemonInfoAttackString);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewProgress(this.mboundView10, vmPokemonInfoAttack);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewLabelText(this.mboundView11, vmPokemonInfoDefenseString);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewProgress(this.mboundView11, vmPokemonInfoDefense);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewLabelText(this.mboundView12, vmPokemonInfoSpeedString);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewProgress(this.mboundView12, vmPokemonInfoSpeed);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewLabelText(this.mboundView13, vmPokemonInfoExpString);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewProgress(this.mboundView13, vmPokemonInfoExp);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewLabelText(this.progressHp, vmPokemonInfoHpString);
            com.skydoves.pokedex.binding.ViewBinding.bindProgressViewProgress(this.progressHp, vmPokemonInfoHp);
            com.skydoves.pokedex.binding.ViewBinding.bindPokemonTypes(this.ribbonRecyclerView, vmPokemonInfoTypes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.weight, vmPokemonInfoWeightString);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindToast(this.image, vmToastMessage);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindLoadImagePaletteView(this.image, pokemonImageUrl, header);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, pokemonName);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindGone(this.progressbar, vmLoading);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): pokemon
        flag 2 (0x3L): vm.pokemonInfo
        flag 3 (0x4L): vm.toastMessage
        flag 4 (0x5L): vm.loading
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}