// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicBusinessUnitTest {

    @Test
    fun create() {
        val publicBusinessUnit = PublicBusinessUnit.builder().id(0).build()

        assertThat(publicBusinessUnit.id()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicBusinessUnit = PublicBusinessUnit.builder().id(0).build()

        val roundtrippedPublicBusinessUnit =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicBusinessUnit),
                jacksonTypeRef<PublicBusinessUnit>(),
            )

        assertThat(roundtrippedPublicBusinessUnit).isEqualTo(publicBusinessUnit)
    }
}
