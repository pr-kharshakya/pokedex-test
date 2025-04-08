-keepnames class com.skydoves.pokedex.core.model.Pokemon
-if class com.skydoves.pokedex.core.model.Pokemon
-keep class com.skydoves.pokedex.core.model.PokemonJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.skydoves.pokedex.core.model.Pokemon
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-keepclassmembers class com.skydoves.pokedex.core.model.Pokemon {
    public synthetic <init>(int,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
