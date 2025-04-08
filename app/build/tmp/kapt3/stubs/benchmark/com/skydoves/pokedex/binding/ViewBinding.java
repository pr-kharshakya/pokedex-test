package com.skydoves.pokedex.binding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0007J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007J\u001a\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0007J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007\u00a2\u0006\u0002\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007\u00a2\u0006\u0002\u0010 J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0007\u00a8\u0006#"}, d2 = {"Lcom/skydoves/pokedex/binding/ViewBinding;", "", "()V", "bindGone", "", "view", "Landroid/view/View;", "shouldBeGone", "", "bindLoadImagePalette", "Landroidx/appcompat/widget/AppCompatImageView;", "url", "", "paletteCard", "Lcom/google/android/material/card/MaterialCardView;", "bindLoadImagePaletteView", "paletteView", "bindOnBackPressed", "onBackPress", "bindPokemonTypes", "recyclerView", "Lcom/skydoves/androidribbon/RibbonRecyclerView;", "types", "", "Lcom/skydoves/pokedex/core/model/PokemonInfo$TypeResponse;", "bindProgressViewLabelText", "progressView", "Lcom/skydoves/progressview/ProgressView;", "text", "bindProgressViewMax", "value", "", "(Lcom/skydoves/progressview/ProgressView;Ljava/lang/Integer;)V", "bindProgressViewProgress", "bindToast", "app_benchmark"})
public final class ViewBinding {
    @org.jetbrains.annotations.NotNull()
    public static final com.skydoves.pokedex.binding.ViewBinding INSTANCE = null;
    
    private ViewBinding() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"toast"})
    public static final void bindToast(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"paletteImage", "paletteCard"})
    public static final void bindLoadImagePalette(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.google.android.material.card.MaterialCardView paletteCard) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"paletteImage", "paletteView"})
    public static final void bindLoadImagePaletteView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatImageView view, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    android.view.View paletteView) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"gone"})
    public static final void bindGone(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean shouldBeGone) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"onBackPressed"})
    public static final void bindOnBackPressed(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean onBackPress) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindPokemonTypes"})
    public static final void bindPokemonTypes(@org.jetbrains.annotations.NotNull()
    com.skydoves.androidribbon.RibbonRecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.skydoves.pokedex.core.model.PokemonInfo.TypeResponse> types) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"progressView_labelText"})
    public static final void bindProgressViewLabelText(@org.jetbrains.annotations.NotNull()
    com.skydoves.progressview.ProgressView progressView, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"progressView_progress"})
    public static final void bindProgressViewProgress(@org.jetbrains.annotations.NotNull()
    com.skydoves.progressview.ProgressView progressView, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"progressView_max"})
    public static final void bindProgressViewMax(@org.jetbrains.annotations.NotNull()
    com.skydoves.progressview.ProgressView progressView, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
}