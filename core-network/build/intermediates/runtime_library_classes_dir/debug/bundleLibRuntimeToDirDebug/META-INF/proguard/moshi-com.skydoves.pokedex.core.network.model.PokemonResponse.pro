-keepnames class com.skydoves.pokedex.core.network.model.PokemonResponse
-if class com.skydoves.pokedex.core.network.model.PokemonResponse
-keep class com.skydoves.pokedex.core.network.model.PokemonResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
