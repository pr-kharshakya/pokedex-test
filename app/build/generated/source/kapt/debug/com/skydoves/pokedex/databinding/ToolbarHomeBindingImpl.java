package com.skydoves.pokedex.databinding;
import com.skydoves.pokedex.R;
import com.skydoves.pokedex.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ToolbarHomeBindingImpl extends ToolbarHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar_title, 3);
        sViewsWithIds.put(R.id.search_card, 4);
        sViewsWithIds.put(R.id.search_icon, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ToolbarHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ToolbarHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[0]
            , (android.widget.TextView) bindings[3]
            );
        this.clearSearchButton.setTag(null);
        this.searchEditText.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVm((com.skydoves.pokedex.ui.main.MainViewModel) object, fieldId);
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
        else if (fieldId == BR.searchText) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String vmSearchText = null;
        com.skydoves.pokedex.ui.main.MainViewModel vm = mVm;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.searchText
                    vmSearchText = vm.getSearchText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.SearchBindingAdapter.bindClearButtonVisibility(this.clearSearchButton, vmSearchText);
            com.skydoves.pokedex.binding.SearchBindingAdapter.bindSearchText(this.searchEditText, vmSearchText);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.skydoves.pokedex.binding.SearchBindingAdapter.bindOnClearSearch(this.clearSearchButton, vm);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): vm.searchText
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}