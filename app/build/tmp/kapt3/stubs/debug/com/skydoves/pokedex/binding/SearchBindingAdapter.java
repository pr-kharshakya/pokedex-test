package com.skydoves.pokedex.binding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/skydoves/pokedex/binding/SearchBindingAdapter;", "", "()V", "bindClearButtonVisibility", "", "view", "Landroid/widget/ImageView;", "text", "", "bindOnClearSearch", "viewModel", "Lcom/skydoves/pokedex/ui/main/MainViewModel;", "bindSearchText", "Landroid/widget/EditText;", "app_debug"})
public final class SearchBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.skydoves.pokedex.binding.SearchBindingAdapter INSTANCE = null;
    
    private SearchBindingAdapter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"searchText"})
    public static final void bindSearchText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"clearButtonVisibility"})
    public static final void bindClearButtonVisibility(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"onClearSearch"})
    public static final void bindOnClearSearch(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.NotNull()
    com.skydoves.pokedex.ui.main.MainViewModel viewModel) {
    }
}