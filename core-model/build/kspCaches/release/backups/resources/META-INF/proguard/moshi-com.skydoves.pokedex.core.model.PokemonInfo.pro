-keepnames class com.skydoves.pokedex.core.model.PokemonInfo
-if class com.skydoves.pokedex.core.model.PokemonInfo
-keep class com.skydoves.pokedex.core.model.PokemonInfoJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.skydoves.pokedex.core.model.PokemonInfo
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-keepclassmembers class com.skydoves.pokedex.core.model.PokemonInfo {
    public synthetic <init>(int,java.lang.String,int,int,int,java.util.List,int,int,int,int,int,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
