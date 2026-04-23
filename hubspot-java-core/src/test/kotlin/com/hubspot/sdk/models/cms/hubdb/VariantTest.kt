// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VariantTest {

    @Test
    fun create() {
        val variant = Variant.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val variant = Variant.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()

        val roundtrippedVariant =
            jsonMapper.readValue(jsonMapper.writeValueAsString(variant), jacksonTypeRef<Variant>())

        assertThat(roundtrippedVariant).isEqualTo(variant)
    }
}
