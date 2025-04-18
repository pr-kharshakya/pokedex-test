// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "UNUSED_PARAMETER", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.skydoves.pokedex.core.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class PokemonInfo_TypeResponseJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<PokemonInfo.TypeResponse>() {
  private val options: JsonReader.Options = JsonReader.Options.of("slot", "type")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "slot")

  private val typeAdapter: JsonAdapter<PokemonInfo.Type> =
      moshi.adapter(PokemonInfo.Type::class.java, emptySet(), "type")

  public override fun toString(): String = buildString(46) {
      append("GeneratedJsonAdapter(").append("PokemonInfo.TypeResponse").append(')') }

  public override fun fromJson(reader: JsonReader): PokemonInfo.TypeResponse {
    var slot: Int? = null
    var type: PokemonInfo.Type? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> slot = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("slot", "slot", reader)
        1 -> type = typeAdapter.fromJson(reader) ?: throw Util.unexpectedNull("type", "type",
            reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return PokemonInfo.TypeResponse(
        slot = slot ?: throw Util.missingProperty("slot", "slot", reader),
        type = type ?: throw Util.missingProperty("type", "type", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: PokemonInfo.TypeResponse?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("slot")
    intAdapter.toJson(writer, value_.slot)
    writer.name("type")
    typeAdapter.toJson(writer, value_.type)
    writer.endObject()
  }
}
