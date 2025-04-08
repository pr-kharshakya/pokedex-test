package com.skydoves.pokedex.databinding;
import com.skydoves.pokedex.R;
import com.skydoves.pokedex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_toolbar, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.view.View) bindings[4]
            , (android.widget.ProgressBar) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.appBarLayout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressbar.setTag(null);
        this.recyclerView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setVm((com.skydoves.pokedex.ui.main.MainViewModel) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.skydoves.pokedex.ui.main.PokemonAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.skydoves.pokedex.ui.main.MainViewModel Vm) {
        updateRegistration(0, Vm);
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.skydoves.pokedex.ui.main.PokemonAdapter Adapter) {
        updateRegistration(1, Adapter);
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVm((com.skydoves.pokedex.ui.main.MainViewModel) object, fieldId);
            case 1 :
                return onChangeAdapter((com.skydoves.pokedex.ui.main.PokemonAdapter) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVm(com.skydoves.pokedex.ui.main.MainViewModel Vm, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.pokemonList) {
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
    private boolean onChangeAdapter(com.skydoves.pokedex.ui.main.PokemonAdapter Adapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.submitted) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        boolean vmLoading = false;
        java.util.List<com.skydoves.pokedex.core.model.Pokemon> vmPokemonList = null;
        com.skydoves.pokedex.ui.main.MainViewModel vm = mVm;
        boolean vmLoadingAdapterSubmittedBooleanFalse = false;
        com.skydoves.pokedex.ui.main.PokemonAdapter adapter = mAdapter;
        java.lang.String vmToastMessage = null;
        boolean adapterSubmitted = false;
        boolean VmLoading1 = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x45L) != 0) {

                    if (vm != null) {
                        // read vm.pokemonList
                        vmPokemonList = vm.getPokemonList();
                    }
            }
            if ((dirtyFlags & 0x49L) != 0) {

                    if (vm != null) {
                        // read vm.toastMessage
                        vmToastMessage = vm.getToastMessage();
                    }
            }
            if ((dirtyFlags & 0x73L) != 0) {

                    if (vm != null) {
                        // read vm.loading
                        VmLoading1 = vm.isLoading();
                    }


                    // read !vm.loading
                    vmLoading = !VmLoading1;
                if((dirtyFlags & 0x73L) != 0) {
                    if(vmLoading) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x42L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {



                if (adapter != null) {
                    // read adapter.submitted
                    adapterSubmitted = adapter.isSubmitted();
                }
        }

        if ((dirtyFlags & 0x73L) != 0) {

                // read !vm.loading ? adapter.submitted : false
                vmLoadingAdapterSubmittedBooleanFalse = ((vmLoading) ? (adapterSubmitted) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x73L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindGone(this.progressbar, vmLoadingAdapterSubmittedBooleanFalse);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.RecyclerViewBinding.bindAdapter(this.recyclerView, adapter);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.RecyclerViewBinding.paginationPokemonList(this.recyclerView, vm);
        }
        if ((dirtyFlags & 0x45L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.RecyclerViewBinding.bindSubmitList(this.recyclerView, vmPokemonList);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.ViewBinding.bindToast(this.recyclerView, vmToastMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): adapter
        flag 2 (0x3L): vm.pokemonList
        flag 3 (0x4L): vm.toastMessage
        flag 4 (0x5L): vm.loading
        flag 5 (0x6L): adapter.submitted
        flag 6 (0x7L): null
        flag 7 (0x8L): !vm.loading ? adapter.submitted : false
        flag 8 (0x9L): !vm.loading ? adapter.submitted : false
    flag mapping end*/
    //end
}